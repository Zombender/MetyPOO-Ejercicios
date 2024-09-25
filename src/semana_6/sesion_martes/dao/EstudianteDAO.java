package semana_6.sesion_martes.dao;
import semana_6.sesion_martes.interfaces.operacion;
import semana_6.sesion_martes.models.Estudiante;

import java.util.ArrayList;
import java.util.Objects;

public class EstudianteDAO implements operacion{
    private final ArrayList<Estudiante> listado = new ArrayList<Estudiante>();
    @Override
    public void create(Object object) {
        try{
            Estudiante estudiante = (Estudiante) object;
            listado.add(estudiante);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    @Override
    public ArrayList<Object> read() {
        return null;
    }

    public ArrayList<Estudiante> showList(){
        return listado;
    }
    @Override
    public void delete(String cif) {
    for(Estudiante estudiante:listado){
        if(estudiante.getCif().equals(cif)){
            listado.remove(estudiante);
            return;
        }
    }
    }

    @Override
    public void update(Object object) {
        Estudiante est = (Estudiante) object;
        for(Estudiante e: listado){
            if(e.getCif().equals(est.getCif())){
                e.setNombres(est.getNombres());
                e.setApellidos(est.getApellidos());
                e.setEmail(est.getEmail());
                e.setTelefono(est.getTelefono());
                return;
            }
        }
    }

    @Override
    public Object search(String value) {
        for(Estudiante estudiante : showList()){
            if(estudiante.getCif().equals(value) || estudiante.getNombres().equals(value)){
                return estudiante;
            }
        }
        return null;
    }
}
