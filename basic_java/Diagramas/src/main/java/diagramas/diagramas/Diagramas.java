
package diagramas.diagramas;

/**
 * @author Sergio Mora
 */
public class Diagramas {

    public static void main(String[] args) {
        
        TarjetaCredito t1 = new TarjetaCredito(1536, 35000);
        TarjetaCredito t2 = new TarjetaCredito(4556, 15000);
        TarjetaCredito t3 = new TarjetaCredito(7891, 95000);
        
        Cliente c1 = new Cliente("12", "Mario Ramirez" );
        Cliente c2 = new Cliente("13", "Juliana Claves");
        
        
        Banco b1 = new Banco("1", 0.2, "Público");
        Banco b2 = new Banco("2", 0.4, "Privado");
        
        b1.agregarCliente(c1);
        b2.agregarCliente(c1);
        b2.agregarCliente(c2);
        
        System.out.println(b1.verClientes());
        
        
    }
}
