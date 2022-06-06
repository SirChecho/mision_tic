package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelPrincipal extends JPanel {

    private JButton botonValidar;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel titulo;
    private JLabel resultados;
    private JTextField campoNumero;

    public PanelPrincipal() {
        setLayout(null);

        inicializarComponentes();

        setVisible(true);
    }

    public void inicializarComponentes() {
        titulo = new JLabel("PROGRAMA QUE DETERMINAR SI UN NÚMERO ES PAR O IMPAR");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(60, 20, 670, 80);
        add(titulo);

        etiqueta1 = new JLabel("Ingrese número entero:");
        etiqueta1.setBounds(100, 200, 200, 30);
        add(etiqueta1);

        etiqueta2 = new JLabel("Resultado:");
        etiqueta2.setBounds(100, 300, 200, 30);
        add(etiqueta2);

        resultados = new JLabel();
        resultados.setBounds(100, 350, 200, 30);
        add(resultados);

        campoNumero = new JTextField();
        campoNumero.setBounds(300, 200, 100, 30);
        add(campoNumero);

        botonValidar = new JButton("Validar");
        botonValidar.setActionCommand("VALIDAR");
        botonValidar.setBounds(480, 200, 100, 30);
        botonValidar.setBackground(Color.blue);
        botonValidar.setForeground(Color.yellow);
        add(botonValidar);

    }

    public JButton getBotonValidar() {
        return botonValidar;
    }

    public void setBotonValidar(JButton botonValidar) {
        this.botonValidar = botonValidar;
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

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    public JLabel getResultados() {
        return resultados;
    }

    public void setResultados(JLabel resultados) {
        this.resultados = resultados;
    }

    public JTextField getCampoNumero() {
        return campoNumero;
    }

    public void setCampoNumero(JTextField campoNumero) {
        this.campoNumero = campoNumero;
    }

}
