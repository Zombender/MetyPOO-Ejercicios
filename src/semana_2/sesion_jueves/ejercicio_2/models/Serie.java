package semana_2.sesion_jueves.ejercicio_2.models;

public class Serie {
    private String titulo;
    private int n_temporadas;
    public boolean entregado;
    public String genero;
    public String creador;
    public Serie() {

    }
    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.n_temporadas = 0;
        this.entregado = false;
    }
    public Serie(String titulo, int n_temporadas, String genero, String creador){
        this.titulo = titulo;
        this.n_temporadas = n_temporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getN_temporadas() {
        return n_temporadas;
    }

    public void setN_temporadas(int n_temporadas){
        this.n_temporadas = n_temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String toString(){
        return String.format("Titulo: %s%nTemporadas: %d%nGenero: %s%nCreador: %s%n",
                this.titulo,this.n_temporadas,this.genero,this.creador);
    }
}
