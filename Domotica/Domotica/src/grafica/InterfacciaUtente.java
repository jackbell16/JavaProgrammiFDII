package grafica;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import utils.CaricamentoFile;
import utils.ProxyFiltro;
import utils.TimerImpostato;

public class InterfacciaUtente implements utils.Observer{
	
	public static void mostraArea(ArrayList<String> list,JTextArea area){
		area.setText("");
		int size = list.size();
		System.out.println(size);
		for (int i = 0; i < size ; i++) {
			area.append(list.get(i));
			area.append("\n");
		}
	}
	@Override
	public void update() {
		if(indirizzoFile!=null){
			CaricamentoFile.setFileName(indirizzoFile);
			System.out.println("Aggiornamento file");
			}
	}
	private static String indirizzoFile = null;
	public static void main(String[] args) {
		final CaricamentoFile caricamentoFile = new CaricamentoFile();
		TimerImpostato subject = new TimerImpostato();
		subject.setDelay(2000);
		InterfacciaUtente observer = new InterfacciaUtente();
        subject.addObserver(observer);
        subject.setState();
        final ProxyFiltro filtro = new ProxyFiltro();
		final JFileChooser fileChooser = new JFileChooser(".");
		fileChooser.setVisible(false);
		final JTextArea area = new JTextArea();
		area.setFont(new Font("SansSerif", Font.BOLD, 18));
		area.setEditable(false);
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem item = new JMenuItem("Carica file");
		menu.add(item);
		JMenu menu2 = new JMenu("Filtro");
		JMenuItem item2 = new JMenuItem("Allarme");
		JMenuItem item3 = new JMenuItem("Info");
		menu2.add(item2);
		menu2.add(item3);
		menuBar.add(menu);
		menuBar.add(menu2);
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fileChooser.setVisible(true);
				int status = fileChooser.showOpenDialog(null);
				if (status == JFileChooser.APPROVE_OPTION) {
			      File selectedFile = fileChooser.getSelectedFile();
			      System.out.println(selectedFile.getParent());
			      System.out.println(selectedFile.getPath());
			      indirizzoFile = selectedFile.getPath();
			      caricamentoFile.setFileName(indirizzoFile);
			      CaricamentoFile.setFileName(selectedFile.getName());
			    } else if (status == JFileChooser.CANCEL_OPTION) {
			      System.out.println("canceled");
			    }
			}
		});
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				filtro.setFiltroID(1);
				mostraArea(filtro.filtro(caricamentoFile.getList()), area);
				
				
			}
		});
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				filtro.setFiltroID(2);
				mostraArea(filtro.filtro(caricamentoFile.getList()), area);
			}
		});
		JFrame frame = new JFrame("Domotica");
		frame.setSize(700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(menuBar);
		
		frame.add(area,BorderLayout.CENTER);
		frame.setVisible(true);
		}
}
