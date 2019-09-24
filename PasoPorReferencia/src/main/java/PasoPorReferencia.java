/*
 * @author AaronCedillo
 */
// Primero creamos una variable "p" de nuestro objeto Persona que estamos creando,
// con esta variable tendremos acceso a los metodos de la clase a la cual pertenece nuestro objeto,
// ya creada esta variable accederemos al metodo cambiarNombre() donde asignaremos un nombre,
// este sera el primer valor que contiene nuestra referencia de memoria del objeto,
// luego llamamos al metodo modificarPersona, aqui se pasar por referencia el valor que contiene
// la direccion de memoria, por tanto se modifica la referencia de memoria, no solo la variable.

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona p = new Persona();
        
        p.cambiarNombre("Aaron");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }
    
    public static void imprimirNombre(Persona p1){
        System.out.println("Valor Recibido = " + p1.obtenerNombre());
    }
    
    public static void modificarPersona(Persona arg) {
        arg.cambiarNombre("Carlos");
    }
}
