/**
 * Questa classe ha la responsabilità di gestire la parte di View dell'utente.
 * In particolare vengono mostrare nella {@link JTextArea} le stringhe richieste,
 * dall'azione di filtro
 */
package gui.user;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import filtri.utils.ProxyFiltro;

public class ToolView extends JPanel implements Observer {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea area;
	private ProxyFiltro proxyFiltro = new ProxyFiltro();
	private String newline = "\n";
	
	
	public ToolView(ProxyFiltro proxyFiltro) {
		super();
		this.proxyFiltro = proxyFiltro;
		proxyFiltro.addObserver(this);
		area = new JTextArea();
		area.setEditable(false);
		add(area);
	}

	@Override
	public void update(Observable o, Object arg) {
		area.setText("");
		for (int i = 0; i < proxyFiltro.getRisultato().size(); i++) {
			area.append(proxyFiltro.getRisultato().get(i).toString());
			area.append(newline);
		}
	}
}
