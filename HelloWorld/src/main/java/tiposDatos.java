/*
 * @author AdrianCedillo
 */
public class tiposDatos {
    public static void main(String[] args) {
        
        //***** Tipos Decimal, Octal, Binario, Hexadecimal *****//
        int numeroDecimal = 10;
        System.out.println("numeroDecimal: " + numeroDecimal);
        
        int numeroOctal = 012;
        System.out.println("NumeroOctal: " + numeroOctal); //Imprime el valor en decimal
        
        int numeroHexadecimal = 0xA;
        System.out.println("NumeroHexadecimal: " + numeroHexadecimal);
        
        int numeroBinario = 0b1010;
        System.out.println("NumeroBinario: " + numeroBinario + "\n");
        
        
        //***** Tipos Flotante, Double *****//
        float floatVar = 1000;  ///convertir literal double a float ---> 1000.10F
        System.out.println("Valor flotante: " + floatVar);
        System.out.println("Bits en el tipo Float: " + Float.SIZE);
        System.out.println("Bytes en el tipo Float: " + Float.BYTES);
        System.out.println("Valor minimo en el tipo Float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo en el tipo float: " + Float.MAX_VALUE);
        
        var doubleVar = 1000.10D;
        System.out.println("Valor double: " + doubleVar);
        System.out.println("Bits en el tipo Float: " + Double.SIZE);
        System.out.println("Bytes en el tipo Float: " + Double.BYTES);
        System.out.println("Valor minimo en el tipo Float: " + Double.MIN_VALUE);
        System.out.println("Valor maximo en el tipo float: " + Double.MAX_VALUE);
    }
}
