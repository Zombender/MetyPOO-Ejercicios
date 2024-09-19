package semana_5.sesion_jueves;

import semana_5.sesion_jueves.models.Student;

import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        Map<String, Student> list = new HashMap<String,Student>();
        list.put("Johan", new Student("Johan","Reyes"));
        System.out.println(list);
    }
}
