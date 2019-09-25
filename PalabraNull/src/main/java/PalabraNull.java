/*
 * @author AaronCedillo
 */
public class PalabraNull {

    public static void main(String[] args) {
        Persona persona = new Persona("Aaron");
        System.out.println("persona = " + persona.obtenerNombre());
        
        Persona persona1 = persona;
        System.out.println("persona1 = " + persona1.obtenerNombre());
        
        persona = null;        
        System.out.println("persona1 = " + persona.obtenerNombre());
    }
}

class Persona {

    String nombre;

    Persona(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }
}
