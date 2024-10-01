package semana_6.sesion_martes;

import semana_6.sesion_martes.models.Estudiante;
import semana_6.sesion_martes.dao.EstudianteDAO;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        EstudianteDAO listEst = new EstudianteDAO();
        Estudiante estudiante = new Estudiante("23011038","Johan Enrique",
                "Reyes Rojas", "jereyesr@uamv.edu.ni","77051013");
        System.out.println("Mostrar listado");
        for (Estudiante e: listEst.showlist()){
            System.out.println(e);
        }
    }
}
