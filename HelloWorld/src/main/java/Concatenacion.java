/*
 * @author AdrianCedillo
 */
public class Concatenacion {
    public static void main(String[] args) {
        var nombre = "Adrian";
        var apellido = "Cedillo";
        
        System.out.println(nombre + " " + apellido);
        
        int i = 3;
        int j = 5;
        
        System.out.println(nombre + i + j); /// Adrian35
        System.out.println(i + j + nombre); /// 8Adrian
    }
}
