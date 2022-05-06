
package diagramas.diagramas;

import java.util.List;
import java.util.ArrayList;

public class TarjetaCredito {
    
    private int numero;
    private int saldo;

    public TarjetaCredito(int numero, int saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Numero = " + numero + ", \nSaldo = " + saldo;
    }
    
    
    
}
