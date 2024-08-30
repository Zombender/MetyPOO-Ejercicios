package semana_2.sesion_martes;

import semana_2.sesion_martes.models.Curso;
import semana_2.sesion_martes.models.Departamento;
import semana_2.sesion_martes.models.Profesor;
import semana_2.sesion_martes.models.Biblioteca;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Curso curso = new Curso("Metodologia y POO");
        Profesor profesor = new Profesor("Dimitrick");
        Profesor profesor1 = new Profesor("Juan");

        Departamento departamento = new Departamento();
        departamento.agregarProfesor(profesor);
        departamento.agregarProfesor(profesor1);
        departamento.setNombre("FIA");

        System.out.println(departamento.getNombre());
        for(Profesor doc: departamento.getProfesores()){
            System.out.println(doc.getNombre());
        }
        Biblioteca biblioteca = new Biblioteca();
        int cantidad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la cantidad de libros a ingresar: ");
        cantidad = sc.nextInt();
        for(int i = 0; i<cantidad; i++){
            System.out.printf("%d. Digite el titulo del libro: ",i+1);
            String libro = sc.next();
            biblioteca.agregar_libro(libro);
        }
        biblioteca.mostrar_libros();
    }
}