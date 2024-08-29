package semana_1.Temperatura;
import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        double temperatura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el temperatura del que desea: ");
        temperatura = sc.nextDouble();
        temperatura = (temperatura*9/5)+32;
        System.out.printf("Conversion de temperatura de Celsius a Fahrenheit: %.2f", temperatura);
    }
}