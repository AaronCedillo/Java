import java.util.Scanner;
/*
 * @author Kanan
 */
public class tarea6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Proporciona un numero entre 0 y 10 = ");
        var valor = scanner.nextLine();
        double valor_Double = Double.parseDouble(valor);
        
        if(valor_Double >= 9 && valor_Double <= 10) {
            System.out.println("A");
        } else if (valor_Double >= 8 && valor_Double < 9) {
            System.out.println("B");
        } else if (valor_Double >= 7 && valor_Double < 8) {
            System.out.println("C");
        } else if (valor_Double >= 6 && valor_Double < 7) {
            System.out.println("D");
        } else if (valor_Double >= 0 && valor_Double < 6) {
            System.out.println("F");
        }
    }
}
