/**
 * Questa classe gestisce il pannello che viene mostrato all'utente
 */
package utils;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UserPanel {
	public static void main(String[] args) {
		final JFileChooser fileChooser = new JFileChooser(".");
		fileChooser.setVisible(false);
		final JTextField field = new JTextField();
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(1, 1));
		final JButton traduci = new JButton("Traduci");
		buttonsPanel.add(traduci);
		final JTextArea area = new JTextArea();
		area.setEditable(false);
		/**
		 * Gestione del button di traduzione
		 */
		traduci.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					area.setFont(new Font("SansSerif", Font.BOLD, 20));
					
					if(Dizionario.corrispondenzaParola.containsKey(field.getText())){
						area.append("Traduzione "+Dizionario.corrispondenzaParola.get(field.getText()));
						area.append("\n");
						area.append("Frase "+Dizionario.corrispondenzaFrase.get(Dizionario.corrispondenzaParola.get(field.getText())));
						area.append("\n");
					}else{
					System.err.println("Non c'e' la traduzione");
					area.setText("Non c'e' traduzione");
					}
			}
		});
		JMenuBar menuBar = new JMenuBar();
		JMenu carica = new JMenu("File");
		JMenuItem caricaDizionario = new JMenuItem("Carica dizionario");
		JMenu strumenti = new JMenu("Strumenti");
		JMenuItem pulisci = new JMenuItem("Pulisci");
		carica.add(caricaDizionario);
		strumenti.add(pulisci);
		menuBar.add(carica);
		menuBar.add(strumenti);
		/**
		 *  Gestione del menu
		 */
		caricaDizionario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fileChooser.setVisible(true);
				int status = fileChooser.showOpenDialog(null);
				if (status == JFileChooser.APPROVE_OPTION) {
			      File selectedFile = fileChooser.getSelectedFile();
			      Dizionario.getInstance().setCorrispondenza(Dizionario.corrispondenzaParola, selectedFile.getName());
			      System.out.println(selectedFile.getParent());
			      System.out.println(selectedFile.getName());
			      CaricaDizionario.setFileName(selectedFile.getName());
			    } else if (status == JFileChooser.CANCEL_OPTION) {
			      System.out.println("canceled");
			    }
			}
		});
		/**
		 * Gestice il menu "Pulisci"
		 */
		pulisci.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setText("");
			}
		});
		JFrame frame = new JFrame("Dizionario");
		frame.setSize(600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(field,BorderLayout.NORTH);
		frame.add(buttonsPanel,BorderLayout.EAST);
		frame.add(area,BorderLayout.CENTER);
		frame.setJMenuBar(menuBar);
		frame.add(fileChooser,BorderLayout.SOUTH);
		frame.setVisible(true);
	}
}