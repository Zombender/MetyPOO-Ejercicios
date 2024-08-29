package semana_1.NumeroMayor;
import java.util.Scanner;
public class NumeroMayor {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("El numero mayor es el primero");
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.println("El numero mayor es el segundo");
        }
        else if (n3 > n1 && n3 > n2) {
            System.out.println("El numero mayor es el tercero");
        }
        else {
            System.out.println("Hay un empate");
        }
    }
}