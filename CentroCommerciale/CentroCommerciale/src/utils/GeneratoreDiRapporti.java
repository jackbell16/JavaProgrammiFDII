/**
 * Questa classe contiene i metodi per realizzare i Report per il centro commerciale
 * @author Giacomo
 */
package utils;

import java.util.ArrayList;

public class GeneratoreDiRapporti {
	
	InterpreteReport interpreteReport;
	CentroCommerciale centroCommerciale;
	
	public GeneratoreDiRapporti(InterpreteReport interpreteReport,
			CentroCommerciale centroCommerciale) {
		super();
		this.interpreteReport = interpreteReport;
		this.centroCommerciale = centroCommerciale;
	}

	public InterpreteReport getInterpreteReport() {
		return interpreteReport;
	}

	public void setInterpreteReport(InterpreteReport interpreteReport) {
		this.interpreteReport = interpreteReport;
	}

	public CentroCommerciale getCentroCommerciale() {
		return centroCommerciale;
	}

	public void setCentroCommerciale(CentroCommerciale centroCommerciale) {
		this.centroCommerciale = centroCommerciale;
	}
	/**
	 * Questo metodo permette di impostare i vari incassi per tutte le attività presenti
	 * anche su locali diversi
	 * @param localiStrings
	 */
	public void impostaIncassoTotaleDaReport(ArrayList<String> localiStrings){
		ArrayList<Locale> localiGenerati = interpreteReport.creaLocaliDaFile(localiStrings);
		for (int k = 0; k < centroCommerciale.getAttivitàs().size(); k++) {
			double incassoTotale = 0;
			Attività attività = centroCommerciale.getAttivitàs().get(k);
			for (int j = 0; j < attività.getLocaList().size(); j++) {
				Locale locale9 = attività.getLocaList().get(j);
					for (int i = 0; i < localiGenerati.size() ; i++) {
						Locale locale10 = localiGenerati.get(i);
						if(locale9.stessoIdentificativo(locale10)){
							locale9.setMetriQuadrati(locale10.getMetriQuadrati());
							incassoTotale+=locale10.getIncasso();
						}
					}
			}		
			attività.setIncassoTotale(incassoTotale);
		}
	}	
	/**
	 * Questo metodo mostra i report per ciascuna delle attività presenti
	 */
	public void mostraReport (){
			System.out.println("Mostra report Attività:");
		for (int i = 0; i < centroCommerciale.getAttivitàs().size() ; i++) {
			Attività attività = centroCommerciale.getAttivitàs().get(i);
			System.out.println(attività.getNome()+" Numero locali: "+attività.locaList.size() + " Incasso: "+attività.getIncassoTotale()+" Guadagno: "+attività.calcoloGuadagno()+" Costi fissi: "+attività.getCostifissi());
		}
	}
}
