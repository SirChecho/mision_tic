package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.VentanaPrincipal;

public class Controller implements ActionListener {

    private VentanaPrincipal vista;

    public Controller() {
        vista = new VentanaPrincipal();
        asignarOyentes();
    }

    public void asignarOyentes() {
        vista.getPanel().getBotonValidar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals("VALIDAR")) {
            String texto = vista.getPanel().getCampoNumero().getText();
            if (!texto.equals("")) {
                int n = Integer.parseInt(texto);
                if (n % 2 == 0) {
                    vista.getPanel().getResultados().setText("Numero ingresado n = " + n + " es PAR");
                } else {
                    vista.getPanel().getResultados().setText("Numero ingresado n = " + n + " es IMPAR");
                }
            }else{
                vista.getPanel().getResultados().setText("Error: Dato incorrecto");
            }
            vista.getPanel().getCampoNumero().setText("");
        }
    }
}
