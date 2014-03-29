package abbonamento;

public class AbbonamentoB implements Abbonamento {
	
	private static int numeroAccessiAttrazione = 2;

	@Override
	public boolean isValid(int numeroAccessi) {
		if(numeroAccessi<numeroAccessiAttrazione){
			return true;
		}else{
			return false;
		}
	}
}
