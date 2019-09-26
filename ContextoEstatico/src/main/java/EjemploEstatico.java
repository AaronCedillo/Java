/*
 * @author AaronCedillo
 */
public class EjemploEstatico {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Adrian");
        System.out.println(persona1);
        
        Persona persona2 = new Persona("Aaron");
        System.out.println(persona2);
        
        Persona person3 = new Persona("Cedillo");
        System.out.println(person3);
        
        System.out.println("Contador = " + Persona.getContadorPersonas());
    }
}

class Persona{
    private int idPersona;
    private String nombre;
    public static int contadorPersonas;
    
    public Persona(String nombre){        
        this.idPersona = contadorPersonas++;
        this.nombre = nombre;
    }
    
    public int getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static int getContadorPersonas() { // Son estaticos para asociarse con la clase y no con los objetos
        return contadorPersonas;
    }
    
    public String toString() {
        return "idPersona: " + idPersona + ", " + "Nombre: " + nombre;
    }
}
