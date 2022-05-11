package sesion14.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Colecciones {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            lista.add((int) (Math.random() * 100));
        }
        System.out.println(lista);

        lista.remove(3);

        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        HashMap<String, Double> mapa = new HashMap<>();

        mapa.put("nota 1", 3.4);
        mapa.put("nota 2", 4.4);
        mapa.put("nota 3", 4.7);

        // cantidad de elementos en el HashMap
        System.out.println("Tama~no: " + mapa.size());
        System.out.println("HashMap 1: " + mapa);
    }
}
