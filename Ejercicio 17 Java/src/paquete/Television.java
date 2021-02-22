package paquete;

public class Television extends  Electrodomestico{

    private int resolucion;
    private boolean sintonizador;

    public Television(){
        super();
        resolucion = 20;
        sintonizador = false;
    }
    public Television (double precioBase, double peso){
        super ( precioBase, peso);
        resolucion = 20;
        sintonizador = false;
    }
    public Television ( int resolucion,boolean sintonizador, double precioBase,
                        String color, char consumoEnergetico, double peso){
        super ( precioBase,  color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public double precioFinal (){
        double precio = super.precioFinal();
        if (resolucion > 40){
            precio = (precio*0.30) + precio;
        }
        if (sintonizador){
            precio += 50;
        }
        return  precio;

    }
}
