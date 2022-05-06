package diagramas.diagramas;

import java.util.List;
import java.util.ArrayList;

public class Banco extends Empresa {

    private double tasaInteres;
    private String tipoBanco;
    private List<Cliente> clientes;
    private List<TarjetaCredito> tarjetas;

    public Banco(String nit, double tasaInteres, String tipoBanco) {
        super(nit);
        this.tasaInteres = tasaInteres;
        this.tipoBanco = tipoBanco;
        clientes = new ArrayList<Cliente>();
        tarjetas = new ArrayList<TarjetaCredito>();
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public String getTipoBanco() {
        return tipoBanco;
    }

    public void setTipoBanco(String tipoBanco) {
        this.tipoBanco = tipoBanco;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<TarjetaCredito> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<TarjetaCredito> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public boolean agregarCliente(Cliente cliente) {
        if (!buscarCliente(cliente)) {
            clientes.add(cliente);
            return true;
        }
        return false;

    }
    public void agregarTarjeta(TarjetaCredito t) {
            tarjetas.add(t);
    }

    public boolean buscarCliente(Cliente cliente) {
        for (Cliente x : clientes) {
            if (x.getId() == cliente.getId()) {
                return true;
            }

        }
        return false;
    }

    public String verClientes() {
        String datos = "";
        for (Cliente x : clientes) {
            datos += x + "\n";
        }
        return datos;

    }
}
