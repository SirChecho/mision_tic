package controller;

import model.Numero;
import view.ViewConsola;
import view.ViewVentanas;

public class Controller {

    private Numero a;
    private Numero b;
    private Numero c;
    private ViewVentanas vista;
    //private ViewConsola vista;

    public Controller() {
        vista = new ViewVentanas();
        //vista = new ViewConsola();
        funcionar();
    }

    public void funcionar() {
        int aux = 0;

        aux = vista.leerDato("Ingrese primer número: ");
        a = new Numero(aux);

        aux = vista.leerDato("Ingrese segundo número: ");
        b = new Numero(aux);

        aux = vista.leerDato("Ingrese tercer número: ");
        c = new Numero(aux);

        int mayor1 = a.hallarMayor1(b, c);
        
        vista.mostrarInformacion("El mayor de " + a.getN() + ", " + b.getN() + " y " + c.getN() + " es " + mayor1);

    }

}
