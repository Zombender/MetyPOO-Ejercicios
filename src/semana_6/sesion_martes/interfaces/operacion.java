package semana_6.sesion_martes.interfaces;
import semana_6.sesion_martes.models.Estudiante;

import java.util.ArrayList;

public interface operacion {
    public void create(Object object);
    public ArrayList<Object> read();
    public void delete(String cif);
    public void update(Object object);
    public Object search(String value);
}
