package utils.elezioni;

import java.util.ArrayList;
import java.util.Random;

public class Seggio {
	
	private ArrayList<Cittadino> scrutinatori = new ArrayList<>();
	private ArrayList<Cittadino> scrutinatoriPossibili = new ArrayList<>();
	ArrayList<Cittadino> cittadino2 = new ArrayList<>();
	ArrayList<Cittadino> cittadino1 = new ArrayList<>();
	private ArrayList<Cittadino> votanti = new ArrayList<>();
	InterpetreInfoCittadino infoCittadino = new InterpreteInfoCittadinoDiTest();
	public Quartiere quartiere;
	ArrayList<Cittadino> cittadini;
	private static int numeroScrutinatori = 5;
	
	public Seggio(Quartiere quartiere, ArrayList<String> list) {
		super();
		this.quartiere = quartiere;
		cittadini = infoCittadino.listaCittadini(list);
		cittadini = quartiere.getCittadini();
		
	}
	
	public void estrazioneCittadini(){
		scrutinatoriPossibili();
		for (int i = 0; i < numeroScrutinatori; i++) {
			int index = scegliNumero(scrutinatoriPossibili.size());
			Cittadino cittadino = scrutinatoriPossibili.get(index);
			scrutinatori.add(cittadino);
			scrutinatoriPossibili.remove(index);
		}
	}
	
	public int scegliNumero(int massimoNumero){
		int numero = 0;
		Random random = new Random();
		numero = random.nextInt(massimoNumero);
		return numero; 
	}

	public ArrayList<Cittadino> getScrutinatori() {
		return scrutinatori;
	}

	public void scrutinatoriPossibili(){
		for (int i = 0; i < cittadini.size(); i++) {
			Cittadino cittadino = cittadini.get(i);
			if(cittadino.isScrutinabile()){
				scrutinatoriPossibili.add(cittadino);
			}
		}
	}
	
	public void votanti(){
		for (int i = 0; i < cittadini.size(); i++) {
			Cittadino cittadino = cittadini.get(i);
			if(cittadino.getEta()>=18){
				votanti.add(cittadino);
			}
		}
	}
	
	public void impostaSchede(){
		for (int i = 0; i < votanti.size(); i++) {
			Cittadino cittadino = votanti.get(i);
			if(cittadino.getValoreVoto()==2){
				cittadino2.add(cittadino);
			}else{
				cittadino1.add(cittadino);
			}
		}
	}
}

