package semana_1.Estudiante;

import java.util.Scanner;
import semana_1.models.Student;
public class Main{
    public static void main(String[] args){
        System.out.println("\u001B[32m");
        System.out.println("UAM");
        Student s1 = new Student();
        String cif, nombres, apellidos, curso;
        int g1,g2,g3,nota_final;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el cif: ");
        cif = sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombres = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        apellidos = sc.nextLine();
        System.out.println("Ingrese el curso: ");
        curso = sc.nextLine();
        System.out.println("Ingrese la nota 1: ");
        g1 = sc.nextInt();
        System.out.println("Ingrese la nota 2: ");
        g2 = sc.nextInt();
        System.out.println("Ingrese la nota 3: ");
        g3 = sc.nextInt();

        s1.setCif(cif);
        s1.setNombres(nombres);
        s1.setApellidos(apellidos);
        s1.setAsignatura(curso);
        s1.setCorte1(g1);
        s1.setCorte2(g2);
        s1.setCorte3(g3);
        nota_final = s1.obtener_nota_final();
        System.out.printf("Nota final: %d\n", nota_final);
        System.out.printf("Estado: %s\n", s1.evaluar_nota_final());
        System.out.printf("Convocatoria: %s\n",s1.evaluar_convocatoria());
    }
}