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
        vista.getPaneldatos().getBotonSumar().addActionListener(this);
        vista.getPaneldatos().getBotonResta().addActionListener(this);
        vista.getPaneldatos().getBotonMultiplicacion().addActionListener(this);
        vista.getPaneldatos().getBotonDivision().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals("SUMAR")) {
            int n1 = Integer.parseInt(vista.getPaneldatos().getCampoNumero1().getText());
            int n2 = Integer.parseInt(vista.getPaneldatos().getCampoNumero2().getText());
            vista.getPanelresultados().getCamporesultados().setText("" + (n1 + n2));
        } else if (comando.equals("RESTAR")) {
            int n1 = Integer.parseInt(vista.getPaneldatos().getCampoNumero1().getText());
            int n2 = Integer.parseInt(vista.getPaneldatos().getCampoNumero2().getText());
            vista.getPanelresultados().getCamporesultados().setText("" + (n1 - n2));
        } else if (comando.equals("MULTIPLICACION")) {
            int n1 = Integer.parseInt(vista.getPaneldatos().getCampoNumero1().getText());
            int n2 = Integer.parseInt(vista.getPaneldatos().getCampoNumero2().getText());
            vista.getPanelresultados().getCamporesultados().setText("" + (n1 * n2));
        } else if (comando.equals("DIVISION")) {
            int n1 = Integer.parseInt(vista.getPaneldatos().getCampoNumero1().getText());
            int n2 = Integer.parseInt(vista.getPaneldatos().getCampoNumero2().getText());
            vista.getPanelresultados().getCamporesultados().setText("" + (n1 / n2));
        }

    }
}
