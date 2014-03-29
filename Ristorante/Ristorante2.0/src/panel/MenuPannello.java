package panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import utils.Prodotto;

public class MenuPannello extends JMenuBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int index = 0;
	private static int quantità = 0;
	ArrayList<JMenuItem> jMenuItemsquantità = new ArrayList<>();
	protected static JTextArea area = new JTextArea();
	public void setArea(JTextArea area){
		this.area = area;
	}
	static ArrayList<JMenuItem> jMenuItemsprodotti = new ArrayList<>();

	public JMenuBar setMenu(JMenuBar menuBar, ArrayList<JMenu> menus, int quantità, ArrayList<Prodotto> prodotti){
		
		impostaJMenuItemsQuantità(menus, quantità);
		
		impostaJMenuItemsProdotti(menus, prodotti);
		
		impostaJMenu(menuBar, menus);
		
		return menuBar;
	}
	
	public static int aziona(final int i, final ArrayList<Prodotto> prodotti){
		jMenuItemsprodotti.get(i).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(prodotti.get(i).toString());
				mostraArea(i,prodotti);
			}
		});
		return i;
	}
	
	public static void mostraArea(int i,ArrayList<Prodotto> prodotti){
		area.append(quantità+"x"+" "+prodotti.get(i).toString());
		area.append("\n");
	}
	
	private void impostaJMenu(JMenuBar menuBar, ArrayList<JMenu> menus) {
		menuBar.add(menus.get(0));
		menuBar.add(menus.get(1));
	}

	private void impostaJMenuItemsProdotti(ArrayList<JMenu> menus,
			ArrayList<Prodotto> prodotti) {
		for (int i = 0; i < prodotti.size(); i++) {
			JMenuItem menuItem = new JMenuItem(prodotti.get(i).toString());
			jMenuItemsprodotti.add(menuItem);
			menus.get(1).add(menuItem);
		}
	}

	private void impostaJMenuItemsQuantità(ArrayList<JMenu> menus, int quantità) {
		for (int i = 0; i < quantità; i++) {
			JMenuItem menuItem = new JMenuItem(i+1+"x");
			jMenuItemsquantità.add(menuItem);
			menus.get(0).add(menuItem);
		}
	}
	
	public int impostaSelezionaQuantità() {
		for (int i = 0; i < jMenuItemsquantità.size() ; i++) {
			quantità=azioneQuantità(i);
		}
		return quantità;
	}
	
	private int azioneQuantità(final int i){
		jMenuItemsquantità.get(i).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				quantità = i+1;
				System.out.println(i+1);
				
			}
		});
		return i+1;
	}
	
	public int impostaSelezionaProdotti(ArrayList<Prodotto> prodotti) {
		for (int i = 0; i < jMenuItemsprodotti.size() ; i++) {
			index = aziona(i, prodotti);
		}
		return index;
	}	
}
