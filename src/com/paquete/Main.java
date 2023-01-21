package com.paquete;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Luis","Felipe","Maria"};
        int contador=0;
        String concatenar="";
        for(String nombre : nombres){
            concatenar=concatenar+nombres[contador]+" ";
            contador++;
        }
        System.out.println(concatenar);
    }

}
