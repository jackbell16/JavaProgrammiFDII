/**
 * Questa classe ha la responsabilità di gestire il Menu dell'applicazione e di informare
 * la View, che è stato premuto un comando
 */
package gui.user;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import utils.CaricamentoFile;
import filtri.utils.Errore;
import filtri.utils.Evento;
import filtri.utils.Filtro;
import filtri.utils.Info;
import filtri.utils.ProxyFiltro;
import filtri.utils.TuttiLogs;

public class ToolMenu extends JMenuBar {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProxyFiltro proxyFiltro;
	private Errore errore = new Errore();
	private Evento evento = new Evento();
	private Info info = new Info();
	private TuttiLogs tuttiLogs = new TuttiLogs();
	private ArrayList<String> list;
	private CaricamentoFile caricamentoFile = new CaricamentoFile();
	
	public ToolMenu(final ProxyFiltro proxyFiltro){
		this.proxyFiltro = proxyFiltro;
		JMenu menu = new JMenu("File");
		JMenuItem item = new JMenuItem("Apri file");
		azioneApriFile(item);
		menu.add(item);
		JMenu menu2 = new JMenu("Filtra Log");
		JMenuItem item2 = new JMenuItem("Evento");
		JMenuItem item3 = new JMenuItem("Errore");
		JMenuItem item4 = new JMenuItem("Info");
		JMenuItem item5 = new JMenuItem("Tutti logs");
		setJMenuItem(item2, evento);
		setJMenuItem(item3, errore);
		setJMenuItem(item4, info);
		setJMenuItem(item5, tuttiLogs);
		menu2.add(item2);
		menu2.add(item3);
		menu2.add(item4);
		menu2.add(item5);
		add(menu);
		add(menu2);
	}

	private void azioneApriFile(JMenuItem item) {
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				final JFileChooser fileChooser = new JFileChooser(".");
				fileChooser.setVisible(false);
				fileChooser.setVisible(true);
				int status = fileChooser.showOpenDialog(null);
				if (status == JFileChooser.APPROVE_OPTION) {
			      File selectedFile = fileChooser.getSelectedFile();
			      caricamentoFile.setNomeFile(selectedFile.getAbsolutePath());
			    } else if (status == JFileChooser.CANCEL_OPTION) {
			      System.out.println("canceled");
			    }
				list = new ArrayList<>();
				list.clear();
				list = caricamentoFile.getList();
				}
		});
	}

	private void setJMenuItem(JMenuItem item2, final Filtro filtro) {
		item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				proxyFiltro.setFiltro(filtro);
				proxyFiltro.filtra(list);
				proxyFiltro.update();
			}
		});
	}
}
