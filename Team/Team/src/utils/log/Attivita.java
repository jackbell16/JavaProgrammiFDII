/**
 * Questa classe astrae sul concetto di Attività
 */
package utils.log;

public class Attivita {
	
	private int ore;
	private String nome;
	
	public Attivita(int ora, String nome) {
		super();
		this.ore = ora;
		this.nome = nome;
	}
	
	public int getOre() {
		return ore;
	}

	public void setOre(int ore) {
		this.ore = ore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void sommaOre(int ore2){
		setOre(getOre()+ore2);
	}
	
	public boolean stessaAttivita(Attivita attivita2){
		boolean risultato = false;
		if(getNome().equalsIgnoreCase(attivita2.getNome())){
			risultato = true;
		}
		return risultato;
	}

	@Override
	public String toString(){
		return ""+getOre()+" "+getNome();
	}
}
