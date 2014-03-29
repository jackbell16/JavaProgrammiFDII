package utils;


public class MenuTuristico implements MenuPrezzoFisso {
	private static double prezzoMenu = 4.50;
	@Override
	public double getPrezzoMenuFisso() {
		return prezzoMenu;
	}
	@Override
	public boolean isMenuPrezzoFisso(int numero) {
		if(numero==2){
			return true;
		}
		return false;
	}
}
