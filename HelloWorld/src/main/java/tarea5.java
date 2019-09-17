
import java.util.Scanner;

/*
 * @author AaronCedillo
 */
public class tarea5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero1 = ");
        var numero1 = scanner.nextLine();
        System.out.println("Ingrese el numero2 = ");
        var numero2 = scanner.nextLine();

        int numero_1 = Integer.parseInt(numero1);
        int numero_2 = Integer.parseInt(numero2);

        var res = (numero_1 > numero_2) ? "El numero1 es mayor" : "El numero2 es mayor";
        System.out.println(res);
    }
}
