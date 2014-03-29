/**
 * Questo test verifica il corretto funzionamento per mostrare il report delle attività
 */
package tests;

import java.util.ArrayList;

import utils.Abbigliamento;
import utils.CaricamentoFileReport;
import utils.CentroCommerciale;
import utils.GeneratoreDiRapporti;
import utils.InterpreteReportTest;
import utils.Locale;
import utils.Parrucchiere;

public class Tests01 {
	static CentroCommerciale centroCommerciale = new CentroCommerciale("Bennet");
	static CaricamentoFileReport caricamentoFileReport = new CaricamentoFileReport();
	private static void impostaDatiDiAccesso(){
		Locale locale = new Locale(1);
		Locale locale2 = new Locale(2);
		Locale locale3 = new Locale(3);
		Locale locale4 = new Locale(4);
		Locale locale5 = new Locale(5);
		ArrayList<Locale> locales = new ArrayList<Locale>();
		locales.add(locale);
		locales.add(locale2);
		locales.add(locale3);
		Parrucchiere parrucchiere = new Parrucchiere("Paolo", locales, 0, 0);
		ArrayList<Locale> list = new ArrayList<Locale>();
		list.add(locale4);
		ArrayList<Locale> nuovoLocale = new ArrayList<Locale>();
		nuovoLocale.add(locale5);
		Parrucchiere parrucchiere2 = new Parrucchiere("Giacomo", list, 0, 0);
		Abbigliamento abbigliamento = new Abbigliamento("Chiara", nuovoLocale, 0, 0);
		caricamentoFileReport.setFileName("prova.txt");
		centroCommerciale.AggiungiAttività(parrucchiere);
		centroCommerciale.AggiungiAttività(parrucchiere2);
		centroCommerciale.AggiungiAttività(abbigliamento);
		
	}
	public static void main(String[] args) {
		impostaDatiDiAccesso();
		InterpreteReportTest reportTest = new InterpreteReportTest();
		GeneratoreDiRapporti generatoreDiRapporti = new GeneratoreDiRapporti(reportTest,centroCommerciale);
		generatoreDiRapporti.impostaIncassoTotaleDaReport(caricamentoFileReport.getList());
		generatoreDiRapporti.mostraReport();
		Locale.mostraLocaliNonUsati(reportTest.creaLocaliDaFile(caricamentoFileReport.getList()));
	}
}
