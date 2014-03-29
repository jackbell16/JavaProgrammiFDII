package gestoreAccessi;
import java.util.ArrayList;

import abbonamento.Abbonamento;
import abbonamento.AbbonamentoB;
import attrazione.Attrazione;
import attrazione.Passaggio;


public class GestoreAccessi {
	private ArrayList<Passaggio> passaggi = new ArrayList<>();
	
	public void accesso(Attrazione attrazione,Abbonamento abbonamento){
		passaggi.add(new Passaggio(attrazione, abbonamento));
	}
	
	public int numeroAccessiTotali(Abbonamento abbonamento){
		int numeroAccessiTotali = 0;
		for (int i = 0; i < passaggi.size(); i++) {
			if(passaggi.get(i).getAbbonamento().equals(abbonamento)){
				numeroAccessiTotali++;
			}
		}
		return numeroAccessiTotali;
	}
	
	public void verificaAbbonamento(Attrazione attrazione, Abbonamento abbonamento){
		if(abbonamento instanceof AbbonamentoB){
			int numeroAccessi = 0;
			for (int i = 0; i < passaggi.size(); i++) {
				if(passaggi.get(i).stessoPassaggio(attrazione, abbonamento)){
					numeroAccessi++;
				}
			}
			mostraRisultato(abbonamento.isValid(numeroAccessi));
		}else{
			int numeroAccessi = numeroAccessiTotali(abbonamento);
			mostraRisultato(abbonamento.isValid(numeroAccessi));
		}
	}
	
	public void mostraRisultato(boolean valido){
		if(valido){
			System.out.println("L'abbonamento e' valido");
		}else{
			System.out.println("L'abbonamento non e' valido");
		}
	}
}
