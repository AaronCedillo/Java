/*
 * @author AaronCedillo
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Aaron");
    }
}

class Persona {
    String nombre;
    
    Persona(String nombre) {
        this.nombre = nombre;
        
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this); // Referencia al objeto Persona
    }
}

class Imprimir{
    public void imprimir(Persona p){
        System.out.println("Impresion del argumento = " + p); // valor del objeto persona
        System.out.println("Impresion objeto (this)= " + this); // Apunta  aun objeto de tipo imprimir
    }  
}