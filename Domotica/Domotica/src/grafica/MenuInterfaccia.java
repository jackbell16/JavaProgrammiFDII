package grafica;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuInterfaccia extends JMenuBar {
	private static final long serialVersionUID = 1L;
	JMenuBar menuBar = new JMenuBar();
	public MenuInterfaccia() {
		super();
		JMenu menu = new JMenu("Strumenti");
		JMenuItem item = new JMenuItem("Prova");
		menu.add(item);
		menuBar.add(menu);
		menuSelectionChanged(isSelected());
		menuBar.setVisible(true);
		}
}
