import java.util.Scanner;
/*
 * @author aaroncedillo
 */
public class triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int area, perimetro;
        
        System.out.println("Proporciona el alto: ");
        var altoString = scanner.nextLine();
        int alto = Integer.parseInt(altoString);
        System.out.println("Proporciona el ancho: ");
        var anchoString = scanner.nextLine();
        int ancho = Integer.parseInt(anchoString);
        
        area = alto * ancho;
        perimetro = (alto + ancho) * 2;
        
        System.out.println("El area es= " + area);
        System.out.println("El perimetro es= " + perimetro);
    }
}
