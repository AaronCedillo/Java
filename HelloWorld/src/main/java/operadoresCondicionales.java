
import java.util.Scanner;

/*
 * @author AaronCedillo
 */
public class operadoresCondicionales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 3, min = 0, max = 10;
        // Operador AND
        if (a >= min && a <= max) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }

        // Operador OR
        boolean vacaciones = false;
        boolean diaDescanso = false;

        if (vacaciones || diaDescanso) {
            System.out.println("Puede Salir");
        } else {
            System.out.println("Debe trabajar");
        }

        // Operador Ternario (Simplificacion de la condicion if)
        var numero = scanner.nextLine();
        int numeroInt = Integer.parseInt(numero);

        var resultado = (numeroInt % 2 == 0) ? "Es numero par" : "Es numero impar";
        System.out.println("resultado = " + resultado);
    }
}
