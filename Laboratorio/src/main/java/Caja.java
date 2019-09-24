/*
 * @author AaronCedillo
 */
public class Caja {
    // Atributos    
    int ancho, alto, profundo;
    
    // Constructores    
    Caja() {
        
    }
    
    Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    // Metodo
    int calcularVolumen(){
        int vol = ancho * alto * profundo;
        return vol;
    }
}
