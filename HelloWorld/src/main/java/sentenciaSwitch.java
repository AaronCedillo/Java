import java.util.Scanner;
/**
 * @author AaronCedillo
 */

public class sentenciaSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Ingrese un numero: ");
        String texto;
        var numeroInput = scanner.nextLine();
        int numero = Integer.parseInt(numeroInput);
        
        switch(numero) {
            case 1:
                texto = "Numero uno";
                break;
            case 2:
                texto = "Numero dos";
                break;
            case 3:
                texto = "Numero tres";
                break;
            default:
                texto = "Numero desconocido";
                break;
        }
        System.out.println("texto = " + texto);
    }
}
