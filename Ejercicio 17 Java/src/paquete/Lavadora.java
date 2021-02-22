package paquete;

public class Lavadora extends Electrodomestico {
    protected double carga;

    public Lavadora (){
        super ();
        carga = 5;
    }

    public Lavadora (double precioBase, double peso){
        super ( precioBase, peso);
        carga = 5;
    }

    public Lavadora (double carga, double precioBase, String color, char consumoEnergetico, double peso){
        super ( precioBase,  color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public double precioFinal(){
        double precio = super.precioFinal();
        if(carga > 30){
            precio += 50;
        }
        return precio;
    }

}
