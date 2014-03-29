/**
 * Questa classe astrae sul concetto di Log, che contiene il {@link Dipendente} che
 * compie una certa {@link Attivita}, in una determinata {@link Data}
 */
package utils.log;

public class Log {
	
	private Dipendente dipendente;
	private Attivita attivita;
	private Data data;
	
	public Log(Dipendente dipendente, Attivita attivita, Data data) {
		super();
		this.dipendente = dipendente;
		this.attivita = attivita;
		this.data = data;
	}
	public Dipendente getDipendente() {
		return dipendente;
	}
	public void setDipendente(Dipendente dipendente) {
		this.dipendente = dipendente;
	}
	public Attivita getAttivita() {
		return attivita;
	}
	public void setAttivita(Attivita attivita) {
		this.attivita = attivita;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString(){
		return getDipendente()+" "+getAttivita()+" "+getData();
	}
}