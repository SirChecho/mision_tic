
package diagramas.diagramas;

public class Empresa {
    protected String nit;
    protected String nombre;
    protected long telefono;

    public Empresa(String nit) {
        this.nit = nit;
        nombre = "";
        telefono = 0;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empresa: " + "\nnit=" + nit + ", \nnombre=" + nombre + ", \ntelefono=" + telefono + '}';
    }
    
    
    
    
}
