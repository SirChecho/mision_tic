
import java.util.ArrayList;
import java.util.HashSet;


public class Cultivo {
     public void obtenerCultivos(ArrayList<String> lista) {
        HashSet<String> cultivos = new HashSet<>(lista);
        for (String value : cultivos) {
            System.out.println(value);
        }
    }

    public ArrayList obtenerCultivosPendientes(ArrayList<Integer> posh, ArrayList<String> pendientes, String cultivo) {
        ArrayList cultivosPendientes = new ArrayList();
        for (Integer faltante : posh) {
            if (pendientes.get(faltante).equals(cultivo)) {
                cultivosPendientes.add(faltante);
            }
        }
        return cultivosPendientes;
    }

    public ArrayList<String> obtenerFaltantes(ArrayList<String> finca2, ArrayList<String> fincaMarta) {
        ArrayList<String> faltantes = new ArrayList<>();
        for (String cultivo: finca2){
            if(!fincaMarta.contains(cultivo)){
                faltantes.add(cultivo);
            }
        }
        return faltantes;
    }


    public Integer obtenerExcedentesIntercambiables(ArrayList<String> finca2, ArrayList<String> fincaMarta) {
        return Math.min(obtenerFaltantes(finca2,fincaMarta).size(),obtenerFaltantes(fincaMarta,finca2).size());
    }

    public Cultivo() {
    }
}
