package abbonamento;

public class AbbonamentoA implements Abbonamento {
	
	private static int numeroAccessiTotali = 50;
	
	
	@Override
	public boolean isValid(int numeroAccessi) {
		if(numeroAccessi<numeroAccessiTotali){
			return true;
		}else{
			return false;
		}
	}
}
