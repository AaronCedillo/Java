/*
 * @author AaronCedillo
 */
public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Aaron", 12000);
        empleado1.setEdad(28);
        empleado1.setGenero('M');
        empleado1.setDireccion("Lomas #3");
        System.out.println(empleado1);
    }
}
