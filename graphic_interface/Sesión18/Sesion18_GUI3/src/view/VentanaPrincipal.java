package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    private PanelDatos pdatos;
    private PanelInformacion pinformacion;
    private PanelImagen pimagen;

    public VentanaPrincipal() {
        setTitle("Programa Buscador de Pareja");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(253, 119, 253));
        getContentPane().setLayout(new BorderLayout(10, 10));

        inicializarComponentes();

        //setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void inicializarComponentes() {
        pdatos = new PanelDatos();
        getContentPane().add(pdatos, BorderLayout.NORTH);

        pinformacion = new PanelInformacion();
        getContentPane().add(pinformacion, BorderLayout.WEST);

        pimagen = new PanelImagen();
        getContentPane().add(pimagen, BorderLayout.CENTER);
    }

    public PanelDatos getPdatos() {
        return pdatos;
    }

    public void setPdatos(PanelDatos pdatos) {
        this.pdatos = pdatos;
    }

    public PanelInformacion getPinformacion() {
        return pinformacion;
    }

    public void setPinformacion(PanelInformacion pinformacion) {
        this.pinformacion = pinformacion;
    }

    public PanelImagen getPimagen() {
        return pimagen;
    }

    public void setPimagen(PanelImagen pimagen) {
        this.pimagen = pimagen;
    }

}
