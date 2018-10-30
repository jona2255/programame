package com.company;
import java.util.Scanner;

public class Problem112 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double distancia = 1;
        double velocidad = 1;
        double segundos = 1;
        distancia = in.nextInt();
        velocidad = in.nextInt()/(3.6);
        segundos = in.nextInt();
        while (distancia != 0.0 || velocidad != 0.0 || segundos != 0.0) {




            double velocidad_coche = distancia / segundos;

            if (segundos <= 0 || distancia <= 0 || velocidad <= 0) {

                System.out.println("ERROR");

            } else if (velocidad_coche <= velocidad) {

                System.out.println("OK");

            } else if (velocidad_coche > velocidad && velocidad_coche > velocidad * 1.20) {

                System.out.println("PUNTOS");


            } else if (velocidad_coche > velocidad && velocidad_coche > velocidad) {

                System.out.println("MULTA");
            }

            distancia = in.nextInt();
            velocidad = in.nextInt()/(3.6);
            segundos = in.nextInt();

        }
    }
}