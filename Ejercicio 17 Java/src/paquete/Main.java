package paquete;

public class Main {
    double precioBase;
    String color;
    char consumoEnergetico;
    double peso;
    double carga;
    public static void main (String [] args){
        Electrodomestico arregloElectrodomesticos[]=new Electrodomestico[10];


        arregloElectrodomesticos[0]=new Television(52, false, 620, "negro",'E', 50);
        arregloElectrodomesticos[1]=new Electrodomestico(150, "Verde", 'C', 30);
        arregloElectrodomesticos[2]=new Electrodomestico(500, "verde", 'D',40 );
        arregloElectrodomesticos[3]=new Television(72, true, 320, "azul",'B', 30);
        arregloElectrodomesticos[4]=new Television(80, true, 350, "rojo", 'B', 50);
        arregloElectrodomesticos[5]=new Lavadora(8, 400,"blanco" , 'D', 40);
        arregloElectrodomesticos[6]=new Lavadora(5, 250,"gris" , 'B', 20);
        arregloElectrodomesticos[7]=new Lavadora(10, 180, "azul", 'C', 35);
        arregloElectrodomesticos[8]=new Electrodomestico(600, "azul", 'B', 50);
        arregloElectrodomesticos[9]=new Electrodomestico(50, "negro", 'E', 40);


        int totalLavadoras = 0;
        int totalTelevisores = 0;
        int totalElectrodomesticos = 0;
        int total = 0;
        for ( int i = 0; i < arregloElectrodomesticos.length; i++){

            if(arregloElectrodomesticos[i] instanceof  Lavadora){
                totalLavadoras += arregloElectrodomesticos[i].precioFinal();
            }
            else if( arregloElectrodomesticos[i] instanceof  Television){
                totalTelevisores += arregloElectrodomesticos[i].precioFinal();
            }else if (arregloElectrodomesticos[i] instanceof  Electrodomestico){
                totalElectrodomesticos += arregloElectrodomesticos[i].precioFinal();
            }
            total += arregloElectrodomesticos[i].precioFinal();
        }

        System.out.println("El total de electrodomésticos es: " + totalElectrodomesticos+ "\n"+
                            "El total de lavadoras es: " + totalLavadoras + "\n" +
                            "El total de televisores es: " + totalTelevisores + "\n" +
                            "El total es: " + total);


    }
}
