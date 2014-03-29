package panel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

import utils.Pizza;
import utils.RistorantePizzeria;

public class PannelloCassa {
	static int quantità = 0;
	static int index = 0 ;
	public static void main(String[] args) {
		final RistorantePizzeria pizzeria = new RistorantePizzeria("Bella Napoli");
		Pizza pizza = new Pizza("Margherita",4);
		Pizza pizza2 = new Pizza("Napoli", 5);
		Pizza pizza3 = new Pizza("Americana", 6.50);
		pizzeria.aggiungiProdotto(pizza);
		pizzeria.aggiungiProdotto(pizza2);
		pizzeria.aggiungiProdotto(pizza3);
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Quantità");
		JMenu menu2 = new JMenu("Lista Pizze");
		ArrayList<JMenu> jMenus = new ArrayList<>();
		jMenus.add(menu);
		jMenus.add(menu2);
		JTextArea area = new JTextArea();
		MenuPannello menuPannello = new MenuPannello();
		menuPannello.setArea(area);
		menuPannello.setMenu(menuBar, jMenus, 4, pizzeria.getProdotti());
		index = menuPannello.impostaSelezionaProdotti(pizzeria.getProdotti());
		quantità=menuPannello.impostaSelezionaQuantità();
		final JButton calcolaButton = new JButton("Calcola");
		calcolaButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(quantità*pizzeria.getProdotti().get(index).getPrezzo());
				
			}
		});
		JFrame frame = new JFrame("Cassa");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(menuBar);
		frame.add(calcolaButton,BorderLayout .SOUTH);
		frame.add(area,BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
