package utils;


public class CassaPaninoteca extends Cassa implements ICassa {

	MenuPrezzoFisso menuPrezzoFisso;
	
	

	public MenuPrezzoFisso getMenuPrezzoFisso() {
		return menuPrezzoFisso;
	}



	public void setMenuPrezzoFisso(MenuPrezzoFisso menuPrezzoFisso) {
		this.menuPrezzoFisso = menuPrezzoFisso;
	}



	@Override
	public double calcolaConto() {
		double totale = 0;
		if(menuPrezzoFisso.isMenuPrezzoFisso(getConto().size())){
			totale = menuPrezzoFisso.getPrezzoMenuFisso();
		}else{
			for (int i = 0; i < getConto().size(); i++) {
				totale+=getConto().get(i).getPrezzo();
			}
		}
		getConto().clear();
		return totale;
	}
}
