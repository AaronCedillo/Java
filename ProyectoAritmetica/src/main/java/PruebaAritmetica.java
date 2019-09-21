/*
 * @author aaroncedillo
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Aritmetica
        Aritmetica aritmetica = new Aritmetica();
        
        // Llamamos al metodo sumar
        int resultado = aritmetica.sumar(5, 3);
        
        System.out.println("resultado = " + resultado);
    }
}
