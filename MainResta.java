import java.util.Scanner;
public class MainResta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resta resta = new Resta();

        System.out.println("Ingresa el primer número: ");
        int a = scanner.nextInt();
        resta.setA(a);

        System.out.println("Ingresa el segundo número: ");
        int b = scanner.nextInt();
        resta.setB(b);

        resta.restar();

        int resultado = resta.getR();
        System.out.println("El resultado de la resta es " + resultado);
        System.out.println(resta.toString());

        scanner.close();
    }
}

    

