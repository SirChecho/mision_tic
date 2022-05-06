package classes;

import java.awt.BorderLayout;
import java.util.Scanner;

public class Classes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Celular j = new Celular("Huawei", 8, 2019);
        j.encender();

        Persona p = new Persona("Sergio", 26, "M", 65, 1.79);
        System.out.println(p.resumen());
        System.out.println(p.nombre + " es mayor de edad = " + (p.mayorEdad() ? "Si" : "No"));

        PersonaPrivada z = new PersonaPrivada("Marta", 35, "F", 60, 1.65);
        System.out.println(z.resumen());
        
        String menu = "\t******************" + "\n" +
                      "\t   Menu opciones  " + "\n" +
                      "\n" +
                      "\t1. Ver IMC \n" +
                      "\t2. Ver Mayoria edad \n" +
                      "\t3. Ver Datos completos \n" +
                      "\t4. Ver Salir \n";
        int option = 0;              
        
        do{
        System.out.println(menu);    
        option = sc.nextInt();
        switch(option){
            case 1:
                System.out.format("Indice de masa corporal = %.2f \n", z.imc());
            case 2:
                System.out.format("%s es mayor de edad = %s  \n", z.getNombre(),z.mayorEdad());
            case 3:
                System.out.println(z.resumen());
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }}while(option != 4);
        
    }
}
