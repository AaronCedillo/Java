/*
 * @author AaronCedillo
 */
public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Aaron", "Cedillo", true);
        
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Adrian");
        System.out.println("persona1 = " + persona1.getNombre());
        
        System.out.println("persona1 = " + persona1);
    }
}
