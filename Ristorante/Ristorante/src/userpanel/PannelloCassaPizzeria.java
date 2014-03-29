package userpanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import utils.CassaPizzeria;
import utils.Pizza;
import utils.RistorantePizzeria;

public class PannelloCassaPizzeria {
	static int quantità = 0;
	static String newLine = "\n";
	static double totale = 0;
	final static RistorantePizzeria pizzeria = new RistorantePizzeria();
	final static ArrayList<JMenuItem> jMenuItemsPizze = new ArrayList<>();
	final static ArrayList<JMenuItem> jMenuteItemsQuantità = new ArrayList<>();
	final static CassaPizzeria cassaPizzeria = new CassaPizzeria();
	final static JTextArea area = new JTextArea();
	
	private static void selezionaPizzaMenu(final int i) {
		jMenuItemsPizze.get(i).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.append(quantità+" x "+pizzeria.getListaPizze().get(i).toString()+" = "+calcolaRisultatoParziale(i)+ " Euro");
				area.append(newLine);
				cassaPizzeria.aggiungiProdotti(pizzeria.getListaPizze().get(i), quantità);
			}
		});
	}
	
	private static double calcolaRisultatoParziale(int idexPizza){
		return quantità*pizzeria.getListaPizze().get(idexPizza).getPrezzo();
	}
	
	private static void impostaSelezionaPizze() {
		for (int i = 0; i < jMenuItemsPizze.size(); i++) {
			selezionaPizzaMenu(i);
		}
	}
	
	public static void main(String[] args) {
			final Pizza pizza = new Pizza("Margherita", 4);
			Pizza pizza2 = new Pizza("Napoli", 5);
			Pizza pizza3 = new Pizza("Prosciutto", 4.5);
			pizzeria.aggiungiPizza(pizza);
			pizzeria.aggiungiPizza(pizza2);
			pizzeria.aggiungiPizza(pizza3);
			final JButton calcolaButton = new JButton("Calcola");
			JMenuBar jMenuBar = new JMenuBar();
			JMenu menu = new JMenu("Seleziona quantità");
			JMenu menu2 = new JMenu("Seleziona pizza");
			JMenu menu3 = new JMenu("Strumenti");
			JMenuItem pulisci = new JMenuItem("Pulisci");
			menu3.add(pulisci);
			inserisciJMenuteItemQuantità();
			inserisciJMenuItemPizze();
			impostaMenuQuantità(menu);
			impostaMenuPizze(menu2);	
			jMenuBar.add(menu);
			jMenuBar.add(menu2);
			jMenuBar.add(menu3);
			selezionaMenuQuantità(0);
			selezionaMenuQuantità(1);
			selezionaMenuQuantità(2);
			selezionaMenuQuantità(3);
			impostaSelezionaPizze();
			area.setEditable(false);
			pulisci.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					area.setText(newLine);
					totale = 0;
				}
			});
			calcolaButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					totale = cassaPizzeria.calcolaConto();
					area.append(newLine);
					area.append("Totale "+totale+ " Euro");
					System.out.println(totale);
					totale = 0;
				}
			});
			JFrame frame = new JFrame("Pizzeria");
			frame.setSize(500, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setJMenuBar(jMenuBar);
			frame.add(calcolaButton,BorderLayout .SOUTH);
			frame.add(area,BorderLayout .CENTER);
			frame.setVisible(true);
		}

	private static void inserisciJMenuteItemQuantità() {
		for (int i = 1; i < 5; i++) {
			JMenuItem jMenuItem = new JMenuItem(i+"x");
			jMenuteItemsQuantità.add(jMenuItem);
		}
	}

	private static void impostaMenuQuantità(JMenu menu) {
		for (int i = 0; i < 4; i++) {
			menu.add(jMenuteItemsQuantità.get(i));
		}
	}

	private static void selezionaMenuQuantità(final int i) {
		jMenuteItemsQuantità.get(i).addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			quantità = i+1;
		}
});
	}

	private static void impostaMenuPizze(JMenu menu2) {
		for (int i = 0; i < jMenuItemsPizze.size(); i++) {
			menu2.add(jMenuItemsPizze.get(i));
		}
	}

	private static void inserisciJMenuItemPizze() {
		for (int i = 0; i < pizzeria.getListaPizze().size(); i++) {
			JMenuItem jMenuItem = new JMenuItem(pizzeria.getListaPizze().get(i).toString());
			jMenuItemsPizze.add(jMenuItem);
		}
	}
}