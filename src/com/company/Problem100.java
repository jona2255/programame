package com.company;
import java.util.Scanner;

public class Problem100 {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        int ass = in.nextInt();
        int[] myArray;
        int resultado;
        int numRestado;

        myArray = new int[ass];



        for (int arr = 0; arr < myArray.length; arr++) {

            int numero = in.nextInt() ;
            int[] digitos = {0,0,0,0};
            resultado=0;

            if(numero==6174){
                System.out.println("0");
            } else if (numero == 0 || numero==1111 || numero == 2222 || numero == 4444 || numero == 5555 || numero == 6666 || numero == 7777 || numero == 8888 || numero == 9999){
                System.out.println("8");
            } else{
                while (numero != 6174){
                    String Menor = "";
                    String Mayor = "";
                    for (int u = 0; u < digitos.length; u++) {
                        digitos[u] = numero % 10;
                        numero /= 10;
                    }
                    //Ordena de menor a major
                    for (int i = 0; i < digitos.length; i++) {
                        for (int j = i + 1; j < digitos.length; j++) {

                            if (digitos[i] > digitos[j]) {
                                int aux = digitos[i];
                                digitos[i] = digitos[j];
                                digitos[j] = aux;

                            }
                        }
                    }
                    for(int a=0; a<=3; a++){
                        Menor += digitos[a];
                    }

                    //Ordena de major a menor

                    for (int x = 0; x < digitos.length; x++) {
                        for (int z = x + 1; z < digitos.length; z++) {

                            if (digitos[x] < digitos[z]) {
                                int aux = digitos[x];
                                digitos[x] = digitos[z];
                                digitos[z] = aux;
                            }
                        }
                    }
                    for(int a=0; a<=3; a++){
                        Mayor += digitos[a];
                    }
                    int numMayor = Integer.parseInt(Mayor);
                    int numMenor = Integer.parseInt(Menor);

                    numRestado = numMayor - numMenor;
                    resultado = resultado + 1;
                    numero=numRestado;
                    for(int a=0; a<=3; a++){
                        digitos[a] = 0;
                        a++;
                    }
                }
                System.out.println(resultado);
            }


        }

    }
}