
package classes;

public class PersonaPrivada {
    
    // atributos
    private String nombre;
    private int edad;
    private String genero;
    private double peso;
    private double altura;
    private final int edadMayor = 18;
    // constructo
    public double imc;

    public PersonaPrivada(String nombre, int edad, String genero, double peso, double altura) {
        this.imc    = imc();
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
        return edadMayor < edad;
    }
    
    public String resumen(){
        return "Nombre = " + nombre + "\n" +
               "Genero = " + genero + "\n" +
               "Edad = "   + edad   + "\n" +
               "IMC = "    + imc();
    }
    
    // getters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdadMayor() {
        return edadMayor;
    }
    
    // setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
}
