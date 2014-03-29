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

import utils.Bibita;
import utils.CassaPaninoteca;
import utils.Panino;
import utils.Paninoteca;

public class PannelloCassaPaninoteca {
	static int quantità = 0;
	static String newLine = "\n";
	static double totale = 0;
	final static Paninoteca PANINOTECA = new Paninoteca();
	final static ArrayList<JMenuItem> jMenuItemsPanini = new ArrayList<>();
	final static ArrayList<JMenuItem> jMenuItemsBibite = new ArrayList<>();
	final static ArrayList<JMenuItem> jMenuteItemsQuantità = new ArrayList<>();
	final static CassaPaninoteca CASSA_PANINOTECA = new CassaPaninoteca();
	final static JTextArea area = new JTextArea();
	
	private static void selezionaPaninoMenu(final int i) {
		jMenuItemsPanini.get(i).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.append(quantità+" x "+PANINOTECA.getPaini().get(i).toString());
				area.append(newLine);
				CASSA_PANINOTECA.aggiungiPanini(PANINOTECA.getPaini().get(i), quantità);
			}
		});
	}
	
	
	private static void selezionaBibitaMenu(final int i) {
		jMenuItemsBibite.get(i).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.append(quantità+" x "+PANINOTECA.getBibite().get(i).toString());
				area.append(newLine);
				CASSA_PANINOTECA.aggiungiBibite(PANINOTECA.getBibite().get(i), quantità);
			}
		});
	}
	
//	private static double calcolaRisultatoParziale(int idexPizza){
//		return quantità*PANINOTECA..get(idexPizza).getPrezzo();
//	}
	
	private static void impostaSelezionaPanini() {
		for (int i = 0; i < jMenuItemsPanini.size(); i++) {
			selezionaPaninoMenu(i);
		}
	}
	
	private static void impostaSelezionaBibite() {
		for (int i = 0; i < jMenuItemsBibite.size(); i++) {
			selezionaBibitaMenu(i);
		}
	}
	
	public static void main(String[] args) {
			Panino panino = new Panino("Prosciutto", 3);
			Bibita bibita = new Bibita("Cola", 2.50);
			Panino panino2 = new Panino("Salame", 4);
			Bibita bibita2 = new Bibita("Acqua", 1);
			PANINOTECA.aggiungiPanino(panino);
			PANINOTECA.aggiungiPanino(panino2);
			PANINOTECA.aggiungiBibia(bibita);
			PANINOTECA.aggiungiBibia(bibita2);
			final JButton calcolaButton = new JButton("Calcola");
			JMenuBar jMenuBar = new JMenuBar();
			JMenu menu = new JMenu("Seleziona quantità");
			JMenu menu2 = new JMenu("Seleziona panino");
			JMenu menu3 = new JMenu("Seleziona bibita");
			JMenu menu4 = new JMenu("Strumenti");
			JMenuItem pulisci = new JMenuItem("Pulisci");
			menu4.add(pulisci);
			inserisciJMenuteItemQuantità();
			inserisciJMenuItemPanini();
			inserisciJMenuItemBibite();
			impostaMenuQuantità(menu);
			impostaMenuPanini(menu2);	
			impostaMenuBibite(menu3);
			jMenuBar.add(menu);
			jMenuBar.add(menu2);
			jMenuBar.add(menu3);
			jMenuBar.add(menu4);
			selezionaMenuQuantità(0);
			selezionaMenuQuantità(1);
			selezionaMenuQuantità(2);
			selezionaMenuQuantità(3);
			impostaSelezionaPanini();
			impostaSelezionaBibite();
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
					area.append(newLine);
					if(CASSA_PANINOTECA.verificaMenuPrezzoFisso()){
						area.append("E' stato applicato il Menu a prezzo fisso");
					}
					area.append(newLine);
					totale = CASSA_PANINOTECA.calcolaConto();
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

	private static void impostaMenuPanini(JMenu menu2) {
		for (int i = 0; i < jMenuItemsPanini.size(); i++) {
			menu2.add(jMenuItemsPanini.get(i));
		}
	}
	
	private static void impostaMenuBibite(JMenu menu3) {
		for (int i = 0; i < jMenuItemsBibite.size(); i++) {
			menu3.add(jMenuItemsBibite.get(i));
		}
	}

	private static void inserisciJMenuItemPanini() {
		for (int i = 0; i < PANINOTECA.getPaini().size(); i++) {
			JMenuItem jMenuItem = new JMenuItem(PANINOTECA.getPaini().get(i).toString());
			jMenuItemsPanini.add(jMenuItem);
		}
	}
	
	private static void inserisciJMenuItemBibite() {
		for (int i = 0; i < PANINOTECA.getBibite().size(); i++) {
			JMenuItem jMenuItem = new JMenuItem(PANINOTECA.getBibite().get(i).toString());
			jMenuItemsBibite.add(jMenuItem);
		}
	}
}	

