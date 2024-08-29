package semana_1.models;

public class Student{
    private String cif;
    private String nombres;
    private String apellidos;
    private String asignatura;
    private int corte1;
    private int corte2;
    private int corte3;

    public Student() {

    }

    public Student(String cif, String nombres, String apellidos, String asignatura, int corte1, int corte2, int corte3) {
        this.cif = cif;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.asignatura = asignatura;
        this.corte1 = corte1;
        this.corte2 = corte2;
        this.corte3 = corte3;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setCorte1(int corte1) {
        this.corte1 = corte1;
    }

    public void setCorte2(int corte2) {
        this.corte2 = corte2;
    }

    public void setCorte3(int corte3) {
        this.corte3 = corte3;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public int getCorte1() {
        return corte1;
    }

    public int getCorte2() {
        return corte2;
    }

    public int getCorte3() {
        return corte3;
    }

    public String getCif() {
        return cif;
    }

    public int obtener_nota_final(){
        return (int) (this.corte1 + this.corte2 + this.corte3) /3;
    }
    public String evaluar_nota_final(){
        int nota_final = this.obtener_nota_final();
        if (nota_final < 0 || nota_final > 100){
            return "Nota final invalida.";
        }
        if (nota_final <70){
            return "Reprobado";
        }
        return "Aprobado";
    }
    public String evaluar_convocatoria(){
        int nota_final = this.obtener_nota_final();
        if (nota_final < 0 || nota_final > 100){
            return "Nota final invalida.";
        }
        if (nota_final >60 && nota_final <70){
            return "Aprobado";
        }
        return "Denegado";
    }
}