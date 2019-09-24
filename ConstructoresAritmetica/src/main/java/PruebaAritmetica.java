/*
 * @author aaroncedillo
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        /*
        // Creamos el objeto
        Aritmetica objeto1 = new Aritmetica();  // Se manda a llamar el constructor vacio de la clase, este objeto 
                                                // se crea en una referencia de memoria
        
        objeto1.a = 5;
        objeto1.b = 10;
        
        int resultado = objeto1.sumar();
        System.out.println("resultado = " + resultado);
        
        // Creamos un segundo objeto
        
        Aritmetica objeto2 = new Aritmetica(5, 3);
        System.out.println("objeto2 = " + objeto2.sumar());
        */
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Ejercicio: Alcance de variables en Java
        
        //Definimos variables locales
        int operandoA = 6;
        int operandoB = 2;
        
        // Creamos un objeto de la clase Aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB); 
        
        //Imprimimos el resultado del metodo sumar()
        System.out.println("suma = " + objeto1.sumar());
        
        // Resultado del metodo restar()
        System.out.println("resta = " + objeto1.restar());
        
        // Resultado del metodo multiplicar()
        System.out.println("multiplicacion = " + objeto1.multiplicar());
        
        // Resultado del metodo dividir()
        System.out.println("division = " + objeto1.dividir());
    }
}
