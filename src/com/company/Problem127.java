package com.company;

import java.util.Scanner;

public class Problem127 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();

        boolean[] descartados = new boolean[6];

        int ncamas = 2;
        int palabras = 3;
        int eqthq = 0;

        while (true) {
            for (int i = eqthq + 1; i <= 3; i++) {
                if (i == 3) {
                    descartados[6] = true;
                    eqthq = 3;
                }
            }
        }
        System.out.println("Descartados =  ???");
    }
}
