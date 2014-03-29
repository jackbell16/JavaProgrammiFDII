/**
 * Questa classe permete di impostare i costi per metroquadrato da applicare ai vari Locali
 * @author Giacomo
 */
package utils;

public class PrezziMetriQuadrati {
	public int identificativo;
	public double metriQuadrati;
	public boolean operativo;
	public int incasso;
	public double numeroMetraturaDiSoglia;
	public double prezzoMetroQuadroStandard;
	public double prezzoMetroQuadroScontato;

	public PrezziMetriQuadrati(double numeroMetraturaDiSoglia,
			double prezzoMetroQuadroStandard, double prezzoMetroQuadroScontato) {
		this.numeroMetraturaDiSoglia = numeroMetraturaDiSoglia;
		this.prezzoMetroQuadroStandard = prezzoMetroQuadroStandard;
		this.prezzoMetroQuadroScontato = prezzoMetroQuadroScontato;
	}
}