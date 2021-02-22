package paquete;

public class Main {
    public static void main (String [] args){
        int videojuegosEntregados = 0;
        int serieEntregadas = 0;
        Serie []arregloSerie = new Serie[5];
        Videojuego []arregloVideojuego = new Videojuego[5];
        Serie mayorSerie;
        Videojuego  mayorVideojuego;

        arregloSerie[0] = new Serie("Shadow hunters","Cassandra Clare", "Acción  y fantasía ", 4);
        arregloSerie[1] = new Serie("The 100","Kiera Cass", "Acción y futurista", 7);
        arregloSerie[2] = new Serie("Fate"," Iginio Straffi.", "Acción  y fantasía ", 1);
        arregloSerie[3] = new Serie("Alexa y Katie","Heather Wordham", "Amistad y comedia ", 4);
        arregloSerie[4] = new Serie("Pretty little liars","I. Marlene King", "Misterio y amistad ", 7);

        arregloVideojuego[0] = new Videojuego("Brawl stars ",223243425, "Acción  y pelea", "Super cell");
        arregloVideojuego[1] = new Videojuego("Clash royal ",173243425, "Acción  y pelea", "Super cell");
        arregloVideojuego[2] = new Videojuego("Clash of clans",123243425, "Acción  y pelea", "Super cell");
        arregloVideojuego[3] = new Videojuego("2048",123243825, "Estrategia ", "Solebon LLC");
        arregloVideojuego[4] = new Videojuego("Bully ",133243425, "Abuso", "Rock star");

        arregloSerie[1].entregar();
        arregloSerie[4].entregar();
        arregloVideojuego[0].entregar();
        arregloVideojuego[3].entregar();
        arregloSerie[2].entregar();

        for (int i = 0; i < arregloVideojuego.length; i++){
            serieEntregadas += arregloSerie[i].isEntregado() ? 1 : 0;
            videojuegosEntregados += arregloVideojuego[i].isEntregado() ? 1 : 0;
            arregloVideojuego[i].devolver();
            arregloSerie[i].devolver();
        }
        System.out.println(serieEntregadas + " cantidad de series entregadas");
        System.out.println(videojuegosEntregados + " cantidad de videojuegos entregadas");

        mayorSerie = arregloSerie[0];
        mayorVideojuego = arregloVideojuego[0];

        for (int i = 0; i < arregloSerie.length ; i++){
            mayorSerie = mayorSerie.compareTo(arregloSerie[i]) ? mayorSerie : arregloSerie[i];
            mayorVideojuego = mayorVideojuego.compareTo(arregloVideojuego[i]) ? mayorVideojuego : arregloVideojuego[i];
        }
        System.out.println(mayorSerie.toString());
        System.out.println(mayorVideojuego.toString());

    }
}
