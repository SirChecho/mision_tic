package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private PanelDatos paneldatos;
	private PanelResultados panelresultados;
	
	public VentanaPrincipal() {
		setTitle("Segundo Programa");
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.blue);
		getContentPane().setLayout(new BorderLayout(10,10));

		inicializarComponentes();
                
		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		paneldatos = new PanelDatos();
		getContentPane().add(paneldatos, BorderLayout.WEST);
		
		panelresultados = new PanelResultados();
		getContentPane().add(panelresultados, BorderLayout.CENTER);
	}

	public PanelDatos getPaneldatos() {
		return paneldatos;
	}

	public void setPaneldatos(PanelDatos paneldatos) {
		this.paneldatos = paneldatos;
	}

	public PanelResultados getPanelresultados() {
		return panelresultados;
	}

	public void setPanelresultados(PanelResultados panelresultados) {
		this.panelresultados = panelresultados;
	}
	
}
