package classes;

public class Celular {

//atributos
    public String marca;
    public int ram;
    public int year;

//constructor
    public Celular(String brand, int ram, int year) {

        this.marca = brand;
        this.ram   = ram;
        this.year  = year;

    }

//metodos 
    public void encender() {
        System.out.println("Encendiendo");
    }
    public void llamar(String nombre){
        System.out.println("Llamando a " + nombre);
    }
 }
