/*
 * @author AaronCedillo
 */
public class PalabraReturnClases {
    public static void main(String[] args) {
        Suma s = crearObjetoSuma();  
        int resultado = s.a + s.b;
        System.out.println("Suma = " + resultado);
    }
    
    public static Suma crearObjetoSuma(){
        Suma s = new Suma(3, 4);
        return s;
    }
}

class Suma {
    int a;
    int b;
    
    Suma(int a, int b) {
        this.a = a; // Se asignan los valores que se reciben a los atributos de esta clase
        this.b = b;
    }
}
