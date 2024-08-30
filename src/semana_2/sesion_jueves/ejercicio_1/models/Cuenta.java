package semana_2.sesion_jueves.ejercicio_1.models;

public class Cuenta {
    private String titular;
    private double cantidad;


    public Cuenta(String titular) {
        this(titular,0);
    }
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public boolean ingresar_cantidad(double cantidad){
       if (cantidad <=0) return false;
       this.cantidad += cantidad;
       return true;
    }

    public boolean retirar_cantidad(double cantidad){
        if (cantidad <= 0) return false;
        if (cantidad >= this.cantidad) this.cantidad = 0;
        else this.cantidad -= cantidad;
        return true;

    }
    public double getCantidad() {
        return cantidad;
    }
    public String getTitular() {
        return titular;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "Nombre de la cuenta: '" + titular + '\'' +
                ", cantidad en la cuenta: " + cantidad +
                '}';
    }
}
