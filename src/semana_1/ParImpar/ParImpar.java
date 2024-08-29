package semana_1.ParImpar;
import java.util.Scanner;
public class ParImpar{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        n = sc.nextInt();
        if (n %2 == 0){
            System.out.printf("El numero %d es par",n);
        }
        else{
            System.out.printf("El numero %d es impar",n);
        }
    }
}