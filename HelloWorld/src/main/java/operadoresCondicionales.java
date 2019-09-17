/*
 * @author AaronCedillo
 */
public class operadoresCondicionales {

    public static void main(String[] args) {
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
    }
}
