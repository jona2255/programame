package com.company;

import java.util.Scanner;

public class Problem433 {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int uvas = 1000000;
        while (uvas != 0) {
            uvas = in.nextInt();
            int totalUvas = 0;
            int niveles = 0;
            while (uvas > totalUvas) {
                niveles++;
                totalUvas = niveles + totalUvas;
            }
            if(uvas != 0) {
                System.out.println(niveles);
            }
        }
    }
}