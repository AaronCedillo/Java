/*
 * @author AaronCedillo
 */

// En el paso por valor unicamente se envia una copia del valor que contiene la variable primitiva,
// no se esta pasando un valor por referencia de la memoria del objeto. 
// Por lo tanto el valor original nunca se modifica. Por lo tanto, no se puede modificar el valor
// de la variable primitiva desde otro metodo cuando se pasan por valor. 

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        imprimir(x);
        cambiarValor(x);
        imprimir(x);
    }
    
    public static void imprimir(int arg) {
        System.out.println("arg = " + arg);
    }
    
    public static void cambiarValor(int i) {
        i = 200;
    }
}
