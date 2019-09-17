/*
 * @author AaronCedillo
 */
public class precedencia_Operadores {
    public static void main(String[] args) {
        int x = 5, y = 10;
        int z = ++x + y--; //Pre-incremento, Post-decremento
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);      
    }
}
