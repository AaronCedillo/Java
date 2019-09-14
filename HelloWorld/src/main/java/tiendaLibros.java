import java.util.Scanner;
/*
 * @author aaroncedillo
 */
public class tiendaLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        System.out.println("Proporcione el nombre: ");
        String titulo = scanner.nextLine();
        
        System.out.println("Proporcione el id: ");
        var id = scanner.nextLine();
        
        System.out.println("Proporcione el precio: ");
        var precio = scanner.nextLine();
        
        System.out.println("Proporcione el simbolo: ");
        var simbolo = scanner.nextLine();
        
        System.out.println("Proporcione el envio gratuito: ");
        var envio = scanner.nextLine();
        
        System.out.println(titulo + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio gratuito: " + envio);
    }
}
