/*
 * @author AaronCedillo
 */
public class ciclo_While_doWhile {

    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println("i = " + i);
            i++;
        }
        
        int j = 0;
        do{
            System.out.println("j = " + j);
            j++;            
        } while(j < 3);            
    }
}
