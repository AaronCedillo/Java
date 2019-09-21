/*
 * @author aaroncedillo
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
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
    }
}
