
import java.util.*;

public class Reto4 {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("MORA");
        lista.add("PAPA");
        lista.add("MORA");
        lista.add("CURUBA");
        lista.add("CEBOLLA");
        lista.add("CEBOLLA");
        lista.add("MORA");
        lista.add("PAPA");
        lista.add("NARANJA");

        HashSet<String> orden = new HashSet<>();

        lista.forEach(value -> {
            orden.add(value);
        });
        Cultivo prueba = new Cultivo();
        prueba.obtenerCultivos(lista);
        System.out.println("");
        for (String value : orden) {
            System.out.println(value);

        }
        System.out.println("");
        System.out.println("");

        ArrayList<String> pendientes = new ArrayList<>(Arrays.asList("PAPA", "MORA", "MORA", "CURUBA", "CEBOLLA", "NARANJA", "MORA", "PAPA"));
        ArrayList<Integer> pos = new ArrayList<>(Arrays.asList(0, 2, 4, 7));

        System.out.println(prueba.obtenerCultivosPendientes(pos, pendientes, "MORA"));
    }

   
}
