package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{
	
	private JButton botonSumar;
	private JButton botonResta;
	private JButton botonMultiplicacion;
	private JButton botonDivision;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JTextField campoNumero1;
	private JTextField campoNumero2;
	
	public PanelDatos() {
		setLayout(new GridLayout(4,2));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		setBorder( new TitledBorder( "Módulo de datos :" ) );
		
		etiqueta1 = new JLabel("N1:");
		add(etiqueta1);
		
		campoNumero1 = new JTextField();
		add(campoNumero1);
		
		etiqueta2 = new JLabel("N2:");
		add(etiqueta2);
		
		campoNumero2 = new JTextField();
		add(campoNumero2);
		
		botonSumar = new JButton("Sumar");
		botonSumar.setActionCommand("SUMAR");
		add(botonSumar);
		
		botonResta = new JButton("Restar");
		botonResta.setActionCommand("RESTAR");
		add(botonResta);
		
		botonMultiplicacion = new JButton("Multiplicación");
		botonMultiplicacion.setActionCommand("MULTIPLICACION");
		add(botonMultiplicacion);
		
		botonDivision = new JButton("División");
		botonDivision.setActionCommand("DIVISION");
		add(botonDivision);
		
	}

	public JButton getBotonSumar() {
		return botonSumar;
	}

	public void setBotonSumar(JButton botonSumar) {
		this.botonSumar = botonSumar;
	}

	public JButton getBotonResta() {
		return botonResta;
	}

	public void setBotonResta(JButton botonResta) {
		this.botonResta = botonResta;
	}

	public JButton getBotonMultiplicacion() {
		return botonMultiplicacion;
	}

	public void setBotonMultiplicacion(JButton botonMultiplicacion) {
		this.botonMultiplicacion = botonMultiplicacion;
	}

	public JButton getBotonDivision() {
		return botonDivision;
	}

	public void setBotonDivision(JButton botonDivision) {
		this.botonDivision = botonDivision;
	}

	public JLabel getEtiqueta1() {
		return etiqueta1;
	}

	public void setEtiqueta1(JLabel etiqueta1) {
		this.etiqueta1 = etiqueta1;
	}

	public JLabel getEtiqueta2() {
		return etiqueta2;
	}

	public void setEtiqueta2(JLabel etiqueta2) {
		this.etiqueta2 = etiqueta2;
	}

	public JTextField getCampoNumero1() {
		return campoNumero1;
	}

	public void setCampoNumero1(JTextField campoNumero1) {
		this.campoNumero1 = campoNumero1;
	}

	public JTextField getCampoNumero2() {
		return campoNumero2;
	}

	public void setCampoNumero2(JTextField campoNumero2) {
		this.campoNumero2 = campoNumero2;
	}
	
}
