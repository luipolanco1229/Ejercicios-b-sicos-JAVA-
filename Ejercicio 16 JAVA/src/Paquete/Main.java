package Paquete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args){
        persona personaObjeto1 = new persona();
        persona personaObjeto2 = new persona();
        persona personaObjeto3 = new persona();
        String nombre = "";
        int edad = 0;
        char sexo = 'H';
        float altura = 0;
        float peso = 0;


        System.out.println("Ingrese su nombre");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            nombre = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ingrese su edad");
         in = new InputStreamReader(System.in);
         buffer = new BufferedReader(in);
        try {
            edad  = Integer.parseInt( buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ingrese su sexo. H si es hombre y M si es mujer ");
         in = new InputStreamReader(System.in);
         buffer = new BufferedReader(in);
        try {
            sexo = buffer.readLine().charAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ingrese su peso");
         in = new InputStreamReader(System.in);
         buffer = new BufferedReader(in);
        try {
            peso = Float.parseFloat(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ingrese su altura");
         in = new InputStreamReader(System.in);
         buffer = new BufferedReader(in);
        try {
            altura = Float.parseFloat(buffer.readLine()) ;
        } catch (IOException e) {
            e.printStackTrace();
        }

        personaObjeto1 = new persona(nombre, edad, sexo, peso, altura );
        personaObjeto1.calcularIMC();
        if (personaObjeto1.calcularIMC()==-1){
            System.out.println("Usted está por debajo de su peso ideal");
        }else if (personaObjeto1.calcularIMC() == 0){
            System.out.println("Usted está en su peso ideal");
        }else if (personaObjeto1.calcularIMC() == 1){
            System.out.println("Usted está en sobrepeso");
        }

        personaObjeto1.esMayorDeEdad();
        if (personaObjeto1.esMayorDeEdad() ){
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
        System.out.println(personaObjeto1.toString());



        personaObjeto2 = new persona(nombre, edad, sexo);
        personaObjeto2.calcularIMC();
        if (personaObjeto2.calcularIMC()==-1){
            System.out.println("Usted está por debajo de su peso ideal");
        }else if (personaObjeto2.calcularIMC() == 0){
            System.out.println("Usted está en su peso ideal");
        }else if (personaObjeto2.calcularIMC() == 1){
            System.out.println("Usted está en sobrepeso");
        }
        personaObjeto2.esMayorDeEdad();
        if (personaObjeto2.esMayorDeEdad() ){
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
        System.out.println(personaObjeto2.toString());


        personaObjeto3 = new persona();
        personaObjeto3.calcularIMC();
        if (personaObjeto3.calcularIMC()==-1){
            System.out.println("Usted está por debajo de su peso ideal");
        }else if (personaObjeto3.calcularIMC() == 0){
            System.out.println("Usted está en su peso ideal");
        }else if (personaObjeto3.calcularIMC() == 1){
            System.out.println("Usted está en sobrepeso");
        }
        personaObjeto3.esMayorDeEdad();
        if (personaObjeto3.esMayorDeEdad() ){
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }

        personaObjeto3.setNombre("Luisa");
        personaObjeto3.setEdad(17);
        personaObjeto3.setAltura(1.70F);
        personaObjeto3.setPeso(65);
        personaObjeto3.setSexo('M');
        System.out.println(personaObjeto3.toString());

    }}
