package semana_1.Circulo;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio;
        System.out.println("Ingrese el radio del circulo: ");
        radio = sc.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.printf("El area del circulo es: %.2f", area);
    }
}