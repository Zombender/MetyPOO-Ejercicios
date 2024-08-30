package semana_2.sesion_martes.models;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
    public List<Profesor> getProfesores(){
        return profesores;
    }
    public Departamento(){
        profesores = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
