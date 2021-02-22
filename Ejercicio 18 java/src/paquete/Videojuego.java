package paquete;

public class Videojuego implements Entregable{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;

    public Videojuego() {
        titulo = "";
        horasEstimadas = 10;
        entregado = false;
        genero = "";
        compañia = "";
    }

    public Videojuego(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        entregado = false;
        genero = "";
        compañia = "";
    }

    public Videojuego (String titulo, int horasEstimadas, String genero, String compañia ){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
        entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String toString() {
        return "Titulo:" + titulo + "\n"+
                "Horas estimados: " + horasEstimadas + "\n" +
                "Entregado: " + entregado + "\n" +
                "Genéro: " + genero + "\n" +
                "Compañia:" + compañia + "\n";
    }

    @Override
    public void entregar() {
        entregado = true;
    }

    @Override
    public void devolver() {
        entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }
    
    public boolean compareTo(Videojuego a) {
        return horasEstimadas  > a.getHorasEstimadas();
    }

}
