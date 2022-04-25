
package com.mycompany.strings;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salto  \n de linea");
        System.out.println("Tabulación \t de linea \t así");
        System.out.println("Muy \"buenos días\"");
        
//        System.out.println("Digte un texto:");
//        String texto = sc.nextLine();
//        if(texto.contains("\"")){
//            System.out.println("El texto contiene comillas");
//        }
//        else {
//            System.out.println("El texto no contiene com");
//        }

        System.out.println("\u0127"); // usando unicode character

    }
}
