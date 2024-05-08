import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Crear un objeto de tipo Resta
        Resta resta = new Resta();

        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingresa el primer número: ");
        int a = scanner.nextInt();
        resta.setA(a);

        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingresa el segundo número: ");
        int b = scanner.nextInt();
        resta.setB(b);

        // Realizar la resta
        resta.restar();

        // Obtener el resultado de la resta
        int resultado = resta.getR();
        System.out.println("El resultado de la resta es " + resultado);
        System.out.println(resta.toString());

        // Cerrar el Scanner
        scanner.close();
    }
}
