package attrazione;

import abbonamento.Abbonamento;

public class Passaggio {
	
	private Attrazione attrazione;
	private Abbonamento abbonamento;
	
	public Passaggio(Attrazione attrazione, Abbonamento abbonamento) {
		super();
		this.attrazione = attrazione;
		this.abbonamento = abbonamento;
	}
	public Attrazione getAttrazione() {
		return attrazione;
	}
	public void setAttrazione(Attrazione attrazione) {
		this.attrazione = attrazione;
	}
	public Abbonamento getAbbonamento() {
		return abbonamento;
	}
	public void setAbbonamento(Abbonamento abbonamento) {
		this.abbonamento = abbonamento;
	}
	public boolean stessoPassaggio(Attrazione attrazione,Abbonamento abbonamento){
		if(this.attrazione.equals(attrazione)&&
		this.abbonamento.equals(abbonamento)){
			return true;
		}else{
			return false;
		}
	}
}
