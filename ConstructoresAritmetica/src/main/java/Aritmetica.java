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
    Aritmetica(int arg1, int arg2) {
        a = arg1;
        b = arg2;
    }
    
    // Este metodo sumar toma los atributos de la clase
    int sumar(){  // Los metodos en Java corresponden a una accion
        return (a + b);
    }

}
