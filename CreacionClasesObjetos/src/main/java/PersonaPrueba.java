/*
 * @author AaronCedillo
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        //Creamos un objeto
        Persona persona1 = new Persona();
        
        //Llamamos al metodo del objeto creado
        System.out.println("valores por default del objeto perona");
        persona1.desplegarNombre();
        
        System.out.println("Agregamos datos a los atributos del objeto" + "\n");
        //Modificar valores del objeto
        persona1.nombre = "Adrian";
        persona1.apellidoPaterno = "Cedillo";
        persona1.apellidoMaterno = "Huerta";
        
        //Volvemos a llamar al metodo
        persona1.desplegarNombre();
    }   
}
