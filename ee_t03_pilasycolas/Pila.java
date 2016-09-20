
package ee_t03_pilasycolas;

/**
 *
 * @author Armando1
 */
import javax.swing.*;

public class Pila<T> {
	public Lista<T> pila = new Lista<T>();
    
    public void push(T dato){
        pila.agregarFinal(dato);
    }
    
    public T pop(){
        return pila.eliminaFinalDevolviendo();
    }
    
    public T peek(){
        Nodo<T> temporal = pila.getInicio();
        if(temporal == null)
           return null;
           
        try{
            while(temporal.getSiguiente() != null)
                  temporal = temporal.getSiguiente();
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Esta vacia  la lista");
        }
        return temporal.getDato();
    }
    
    public Boolean estaVacia(){
        return pila.getInicio() == null;
    }
}