package paquete;

public class Serie implements Entregable {
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        titulo = "";
        numeroTemporadas = 3;
        entregado = false;
        genero = "";
        creador = "";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        numeroTemporadas = 3;
        entregado = false;
        genero = "";
    }

    public Serie(String titulo, String creador, String genero, int numeroTemporadas) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.numeroTemporadas = numeroTemporadas;
        entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) { this.creador = creador; }

    public String toString() {
        return "Titulo:" + titulo + "\n"+
                "numeroTemporadas: " + numeroTemporadas + "\n" +
                "Entregado: " + entregado + "\n" +
                "Genéro: " + genero + "\n" +
                "Creador:" + creador + "\n";
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


    public boolean compareTo(Serie a) {
        return numeroTemporadas > a.getNumeroTemporadas();
    }
}
