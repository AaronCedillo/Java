/*
 * @author aaroncedillo
 */
public class Aritmetica {

    // Definimos atributos de la clase
    int a;
    int b;
    
    // Agregamos un constructor vacio de la clase
    Aritmetica() {

    }

    // Constructor con dos argumentos
    Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    // Este metodo sumar toma los atributos de la clase
    int sumar(){  // Los metodos en Java corresponden a una accion
        return (a + b);
    }
    
    int restar() {
        return (a - b);
    }
    
    int multiplicar() {
        return (a * b);
    }
    
    int dividir() {
        return (a / b);
    }
}
