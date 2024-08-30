package semana_2.sesion_martes.models;

public class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public Profesor() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void enseñar(Curso curso) {
        System.out.printf("%s esta enseñando %s",nombre,curso.getNombre());
    }
}
