/*
 * @author AdrianCedillo
 */
import java.util.Scanner;

public class scannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dame el nombre de usuaio: ");
        var usuario = scanner.nextLine();
        System.out.println(usuario);
    }
}
