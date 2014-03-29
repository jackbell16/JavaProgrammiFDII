package utils.elezioni;

public class Cittadino {
	private String nome;
	private String Cognome;
	private String codiceFiscale;
	private int eta;
	private boolean scrutinabile;
	private int valoreVoto;
	public Cittadino(String nome, String cognome, String codiceFiscale, int eta) {
		super();
		this.nome = nome;
		Cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.eta = eta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	@Override
	public String toString(){
		return "CF: "+getCodiceFiscale()+" Cognome: "+getCognome()+" Nome: "+getNome()+" Eta': "+getEta();
	}
	public boolean isScrutinabile() {
		if(getEta()>=21){
			return true;
		}else{
			return false;
		}
	}
	public int getValoreVoto(){
		if(getEta()>=21){
			return 2;
		}else if(getEta()<21 && getEta()>=18){
			return 1;
		}else{
			return 0;
		}
	}
}
