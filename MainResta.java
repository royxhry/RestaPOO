import java.util.Scanner;
public class MainResta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resta resta = new Resta();

        System.out.println("Ingresa el primer número: ");
        int a = scanner.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int b = scanner.nextInt();
        

        int r = resta.restar(a,b);
        System.out.println("El resultado de la resta es " + r);

        scanner.close();
    }
}

    

