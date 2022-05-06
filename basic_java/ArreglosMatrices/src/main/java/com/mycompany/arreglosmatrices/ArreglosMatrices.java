package com.mycompany.arreglosmatrices;

import java.util.Scanner;
import java.util.Arrays;

public class ArreglosMatrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de datos");
        int tamaño = sc.nextInt();
        double[] arreglo = new double[tamaño];
        float suma = 0;

        for (int j = 0; j < tamaño; j++) {
            System.out.format("Ingrese el dato %d  \n", j + 1);
            arreglo[j] = sc.nextInt();
            suma += arreglo[j];
        }
        System.out.println(Arrays.toString(arreglo));
        System.out.println("la suma total es de "+ suma);
        float promedio = suma/tamaño;
        System.out.format("el promedio es %.2f  \n", promedio);
        
    }
}
