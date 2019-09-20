/*
 * @author AaronCedillo
 */
public class palabrasBreak_and_Continue {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            if (i % 2 != 0) 
                continue;
                 //break; // Termina el ciclo con el primer numero par que encuentra                
            System.out.println("i = " + i);                           
        }
    }
}
