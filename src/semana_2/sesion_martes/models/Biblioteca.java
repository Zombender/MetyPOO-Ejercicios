package semana_2.sesion_martes.models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
    private List<Libro> libros = new ArrayList<>();
    public Biblioteca(){

    }

    public void mostrar_libros() {
        System.out.println("\tLista de libros");
        libros.forEach(libro -> System.out.println(libro));
    }
    public void agregar_libro(String titulo) {
        Libro libro = new Libro(titulo);
        this.libros.add(libro);
    }

    private static class Libro{
        private String titulo;

        public Libro(String titulo){
            this.titulo = titulo;
        }
        public Libro(){

        }

        public String getTitulo(){
            return titulo;
        }
        public String setTitulo(String titulo){
            return this.titulo;
        }

        @Override
        public String toString() {
            System.out.printf("Titulo del libro: %s\n",this.titulo);
            return "";
        }
    }
}
