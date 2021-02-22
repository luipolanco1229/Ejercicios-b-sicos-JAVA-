package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	// Ejercicio 1
       /* int var1=45000;
        int var2=45000;
        if (var1<var2){
            System.out.println( var2+" es mayor que " + var1);
        }
        else if (var1>var2){
            System.out.println(var1 + " es mayor que " + var2);
        }
        else{
            System.out.println("Las variables son iguales");
        }*/

        /*//Ejercicio 2
         int var1;
         int var2;
         var1 = 0;
         var2 = 0;


        System.out.println("Ingrese la variable número 1");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            var1 = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.getMessage();
        }

        System.out.println("Ingrese la variable número 2");
        in = new InputStreamReader(System.in);
        buffer = new BufferedReader(in);
        try {
            var2 = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.getMessage();
        }

        if (var1<var2){
            System.out.println( var2+" es mayor que " + var1);
        }
        else if (var1>var2){
            System.out.println(var1 + " es mayor que " + var2);
        }
        else{
            System.out.println("Las variables son iguales");
        }*/

        /*//Ejercicio 3
        double radio = 0;
        double PI = Math.PI;
        double areaCirculo = 0;

        System.out.println("Ingrese el valor del radio");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            radio = Double.parseDouble(buffer.readLine());
        } catch (IOException e) {
            e.getMessage();
        }

        areaCirculo= PI*(Math.pow(radio, 2));
        System.out.println("El area es "+ areaCirculo);*/


        /*//Ejercicio 4
        float precio = 0;
        float IVA = 0.21F;
        float precioFinal = 0;
        System.out.println("Ingrese el precio del producto");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            precio = Float.parseFloat(buffer.readLine());
        } catch (IOException e) {
            e.getMessage();
        }

        precioFinal= (precio * IVA) + precio;
        System.out.println("El precio final del producto es: " + precioFinal);*/

        /*//Ejercicio 5
        int i = 1;
        while (true) {
            if ((i % 2)==0) {
                System.out.println(i + " par");
            }
            if ((i % 2)!=0) {
                System.out.println(i + " impar");
            }
            i++;
            if (i>100){
                break;
            }
        }*/

        /*//Ejercicio 6
        int i ;
        for (i=1; i<=100; i++) {
            if ((i % 2) == 0) {
                System.out.println(i + " par");
            }
            if ((i % 2) != 0) {
                System.out.println(i + " impar");
            }
        }*/

        /*//Ejercicio 7
        int num = 0;
        do {
            System.out.println("Ingrese un número");
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(in);
            try {
                num = Integer.parseInt(buffer.readLine());
            } catch (IOException e) {
                e.getMessage();
            }

            if (num>=0){
                System.out.println(num + " es mayor o igual a 0 ");
            }
          } while (num<0);*/

        /*//Ejercicio 8
             String diaDeLaSemana;
             diaDeLaSemana = "";

             System.out.println("Ingrese un dia de la semana ");
             InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader buffer = new BufferedReader(in);
            try {
                diaDeLaSemana = buffer.readLine();
            } catch (IOException e) {
                e.getMessage();
            }

            switch (diaDeLaSemana){
                case "lunes" : diaDeLaSemana = "Lunes";
                    System.out.println("Este es un dia laboral");
                    break;
                case "martes" : diaDeLaSemana = "Martes";
                    System.out.println("Este es un dia laboral");
                    break;
                case "miercoles" : diaDeLaSemana = "Miercoles";
                    System.out.println("Este es un dia laboral");
                    break;
                case "jueves" : diaDeLaSemana = "Jueves";
                    System.out.println("Este es un dia laboral");
                    break;
                case "viernes" : diaDeLaSemana = "Viernes";
                    System.out.println("Este es un dia laboral");
                    break;
                case "sabado" : diaDeLaSemana = "Sabado";
                    System.out.println("Este no es un dia laboral");
                    break;
                case "domingo" : diaDeLaSemana = "Domingo";
                    System.out.println("Este no es un dia laboral");
                    break;
                default: diaDeLaSemana = "";
                    System.out.println("No has ingresado un dia válido");
            }*/

        /*//Ejercicio 9

             String frase = "La sonrisa sera la mejor arma contra la tristeza";
             String nuevaFrase = "";

             frase = frase.replace("a" , "e");
             System.out.println(frase);

             System.out.println("Ingresa una nueva frase");
             InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader buffer = new BufferedReader(in);
             try {
                nuevaFrase = buffer.readLine();
             } catch (IOException e) {
                e.getMessage();
             }
             nuevaFrase = nuevaFrase.concat(frase);

             System.out.println(nuevaFrase);*/

        /*//Ejercicio 10
             String sinEspacios = "";
             String frase = "";

             System.out.println("Ingresa una frase");
             InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader buffer = new BufferedReader(in);
             try {
                frase= buffer.readLine();
             } catch (IOException e) {
                e.getMessage();
             }

             sinEspacios = frase.replace(" ", "");

             System.out.println(sinEspacios);*/


        /*//Ejercicio 11

            String frase = "";
            int contadora = 0;
            int contadore = 0;
            int contadori = 0;
            int contadoro = 0;
            int contadoru = 0;

            System.out.println("Ingresa una frase");
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(in);
            try {
                frase= buffer.readLine();
            } catch (IOException e) {
                e.getMessage();
            }

            System.out.println("Contiene "+ frase.length()+ " letras");

            for (int i = 0; i < frase.length(); i ++){
                if ( frase.charAt(i) == 'a' ) {
                    contadora ++;
                }
                if ( frase.charAt(i) == 'e' ) {
                    contadore ++;
                }
                if ( frase.charAt(i) == 'i' ) {
                    contadori ++;
                }
                if ( frase.charAt(i) == 'o' ) {
                    contadoro ++;
                }
                if ( frase.charAt(i) == 'u' ) {
                    contadoru ++;
                }
            }

                System.out.println("Hay "+ contadora + " letras a");
                System.out.println("Hay "+ contadore + " letras e");
                System.out.println("Hay "+ contadori + " letras i");
                System.out.println("Hay "+ contadoro + " letras o");
                System.out.println("Hay "+ contadoru + " letras u");*/

        /*//Ejercicio 12
            String palabraUno="";
            String palabraDos="";
            List<Character> primeraPalabra =new ArrayList<>();
            List<Character> segundaPalabra =new ArrayList<>();

            System.out.println("Ingrese la primera palabra");
                InputStreamReader in = new InputStreamReader(System.in);
                BufferedReader buffer = new BufferedReader(in);
                try {
                    palabraUno = buffer.readLine();
                } catch (IOException e) {
                    e.getMessage();
                }

            System.out.println("Ingrese la segunda palabra");
                in = new InputStreamReader(System.in);
                buffer = new BufferedReader(in);
                try {
                    palabraDos = buffer.readLine();
                } catch (IOException e) {
                    e.getMessage();
                }

            for (int i = 0; i < palabraUno.length(); i ++){
                primeraPalabra.add(palabraUno.charAt(i));
            }

            for (int i = 0; i < palabraDos.length(); i ++){
                segundaPalabra.add(palabraDos.charAt(i));
            }

            if (palabraUno.equals(palabraDos) ){
                System.out.println("Las palabras ingresadas son iguales");
            }else {
                int palabraMayor = 0;
                if (primeraPalabra.size()>segundaPalabra.size()){
                    palabraMayor = primeraPalabra.size();
                }
                else {
                    palabraMayor = segundaPalabra.size();
                }
                for ( int i = 0; i < palabraMayor; i ++){
                    if (i< primeraPalabra.size() && i<segundaPalabra.size()){

                        if (!primeraPalabra.get(i).equals(segundaPalabra.get(i))){
                            System.out.println(primeraPalabra.get(i)+" es diferente a: "+ segundaPalabra.get(i));
                        }
                    }
                }

            }*/

        /*//Ejercicio 13
            Date fecha = new Date();
            System.out.println("(" + (1900 + fecha.getYear()) + "/" + (1 + fecha.getMonth()) + "/" + fecha.getDate() +
                    ")" + "(" + fecha.getHours() + ":" + fecha.getMinutes() + ":" + fecha.getSeconds() + ")");*/

        /*//Ejercicio 14
            int numeroIngresado = 0;

            System.out.println("Ingrese un número menor a 1000");
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(in);
            try {
                numeroIngresado = Integer.parseInt(buffer.readLine()) ;
            } catch (IOException e) {
                e.getMessage();
            }
            for (int i = numeroIngresado; i <= 1000; i += 2){
                System.out.println(i);
            }*/

        /* //Ejercicio 15

            int numeroIngresado = 0;
            while (numeroIngresado != 8){
               numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(
                        "****** GESTIÓN CINEMATOGRÁFICA ****** \n" +
                                "1. NUEVO ACTOR \n" +
                                "2. BUSCAR ACTOR \n" +
                                "3. ELIMINAR ACTOR \n" +
                                "4. MODIFICAR ACTOR \n" +
                                "5. VER TODOS LOS ACTORES \n" +
                                "6. VER PELICULAS DE LOS ACTORES \n" +
                                "7. VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n" +
                                "8. SALIR"
               ));


                switch (numeroIngresado){
                    case 1: break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                    case 6: break;
                    case 7: break;
                    case 8: break;
                    default:
                        System.out.println("Opción incorrecta");
                }


            }*/



    }

}
