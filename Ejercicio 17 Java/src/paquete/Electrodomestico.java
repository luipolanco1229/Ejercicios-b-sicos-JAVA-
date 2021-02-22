package paquete;

public class Electrodomestico {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico(){
        precioBase = 100;
        color = "Blanco";
        consumoEnergetico = 'F';
        peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        color = "Blanco";
        consumoEnergetico = 'F';

    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico();
        comprobarColor();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(){
        consumoEnergetico = Character.toUpperCase(consumoEnergetico);
        if (consumoEnergetico != 'A' && consumoEnergetico != 'B' && consumoEnergetico != 'C' &&
                consumoEnergetico != 'D' && consumoEnergetico != 'E' && consumoEnergetico != 'F' ){
            consumoEnergetico = 'F';
        }
    }
    private void comprobarColor(){

        if (!color.equalsIgnoreCase("blanco") &&
                !color.equalsIgnoreCase("negro") &&
                        !color.equalsIgnoreCase("rojo")  &&
                                !color.equalsIgnoreCase("gris") &&
                                        !color.equalsIgnoreCase("azul")){
            color = "blanco";
        }

    }

    public double precioFinal() {
        double precioFinal = 0;


        switch (consumoEnergetico) {
            case 'A':
                precioFinal = precioFinal + 100;
                break;
            case 'B':
                precioFinal = precioFinal + 80;
                break;
            case 'C':
                precioFinal = precioFinal + 60;
                break;
            case 'D':
                precioFinal = precioFinal + 50;
                break;
            case 'E':
                precioFinal = precioFinal + 30;
                break;
            case 'F':
                precioFinal = precioFinal + 10;
                break;
        }

        if (peso <= 19) {
            precioFinal += 10;
        } else if (peso >= 20 && peso < 49) {
            precioFinal += 50;
        } else if (peso >= 50 && peso < 79) {
            precioFinal += 80;
        } else if (peso >= 80) {
            precioFinal += 100;
        }
        precioFinal += precioBase;
        return precioFinal;
    }
}
