package utils.elezioni;

import java.util.ArrayList;

public interface InterpetreInfoCittadino {
	
	public Cittadino stringToCittadino(String string);
	
	public ArrayList<Cittadino> listaCittadini(ArrayList<String> list);
}
