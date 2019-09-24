/*
 * @author AaronCedillo
 */
public class PruebaCaja {
    public static void main(String[] args) {
        int ancho = 3;
        int alto = 2;
        int profundo = 6;
        
        Caja caja = new Caja(ancho, alto, profundo);
        
        // Imprimimos el volumen
        System.out.println("volumen = " + caja.calcularVolumen());
    }
}
