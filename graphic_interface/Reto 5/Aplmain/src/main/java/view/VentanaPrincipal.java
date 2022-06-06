
package view;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    
    private PanelOpciones opciones;
    public VentanaPrincipal(){
        setSize(700,700);
        setTitle("Ferreteria Amiga");
        setLocationRelativeTo(null); // Centrar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        inicializarComponentes();
        setVisible(true);
    }
    
    private void inicializarComponentes(){
        opciones = new PanelOpciones();
        getContentPane().add(opciones);
    }
}
