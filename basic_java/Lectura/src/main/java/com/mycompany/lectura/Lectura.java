package com.mycompany.lectura;

import java.util.Scanner

public class Lectura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String a = "hola";
        String b = "hola";
        String c = "Hola";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
//        métodos para cadena de caracteres:
//        equals(x), contains(x), charAt(i), substring(inicio,fin)
//        split(" "),

        String s = sc.nextLine();
        String[] line = s.split(" ");
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "m");
    }
}
