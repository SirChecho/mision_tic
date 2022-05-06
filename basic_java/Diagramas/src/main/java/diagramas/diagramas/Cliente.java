package diagramas.diagramas;

import java.util.List;
import java.util.ArrayList;

public class Cliente {

    private String id;
    private String nombre;
    private List<Banco> bancos;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        bancos = new ArrayList<Banco>();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Banco> getBancos() {
        return bancos;
    }

    public void setBancos(List<Banco> bancos) {
        this.bancos = bancos;
    }

    @Override
    public String toString() {
        return "id = " + id + ", \nnombre = " + nombre;
    }

}
