
package classes;

public class Persona {
    
    // atributos
    public String nombre;
    public int edad;
    public String genero;
    public double peso;
    public double altura;
    public final int edadMayor = 18;
    
    // constructo

    public Persona(String nombre, int edad, String genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad   = edad;
        this.genero = genero;
        this.peso   = peso;
        this.altura = altura;
    }
    
    // métodos
    
    public double imc(){
        
        return peso / Math.pow(altura, 2);
    }
    
    public boolean mayorEdad(){
        if (edad >= edadMayor) {
            return true;            
        }else{return false;}
    }
    
    public String resumen(){
        return "Nombre = " + nombre + "\n" +
               "Genero = " + genero + "\n" +
               "Edad = "   + edad   + "\n" +
               "IMC = "    + imc();
    }
}
