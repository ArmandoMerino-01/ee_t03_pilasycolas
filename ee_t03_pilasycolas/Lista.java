
package ee_t03_pilasycolas;

/**
 *
 * @author Armando1
 */
import javax.swing.*;
public class Lista<T>{
    private Nodo<T> inicio;
       
    public Lista(){
    	inicio = null;
    }
    
    public void agregarInicio(T dato){
        Nodo<T> nuevo = new Nodo<T>(dato);
        nuevo.setSiguiente(inicio);
        inicio = nuevo;
    }
    
    public void agregarFinal(T dato){
        Nodo<T> aux = inicio;
        if(inicio == null)
           agregarInicio(dato);
        else{
             while(aux.getSiguiente() != null)
                   aux = aux.getSiguiente();
             aux.setSiguiente(new Nodo<T>(dato));
        }        
    }
    
    public void recorre(){
    	Nodo<T> aux = inicio;
    	while(aux != null){
    		System.out.print(aux.getDato() + "-->");
    		aux = aux.getSiguiente();
    	}
    	System.out.print("null");
    }
    
    public void recorrerRecursivo(Nodo<T> p){
    	if(p != null){
    		System.out.println(p.getDato());
    		recorrerRecursivo(p.getSiguiente());
    	}
    }

    /**
     * Este método sobrescribe el método toString() de la clase Object
     */
    @Override
    public String toString(){
        Nodo<T> iterador = inicio;
        String s = "";
         while( iterador != null ){ 
             s += iterador.getDato() + " --> ";
             iterador = iterador.getSiguiente(); 
         } 
         s += null;
         return s;
    }
    
    public Nodo<T> getInicio(){
        return inicio;
    }
    
    public T eliminaFinalDevolviendo(){
        Nodo<T> aux = inicio, anterior = null;
        try{
            if(inicio.getSiguiente() == null)
               inicio = null;
               else{
                   while(aux.getSiguiente() != null){
                       anterior = aux;
                       aux = aux.getSiguiente();
                    }                
                    anterior.setSiguiente(null);
            }     
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Lista vacía");
        }
        return aux.getDato();
    }
    
    public T eliminaInicioDevolviendo(){
        Nodo<T> aux = inicio;
        try{
            if(aux.getSiguiente() != null)
                inicio = aux.getSiguiente();
                else
                inicio = null;
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null,"Lista vacía");
        }
        return aux.getDato();
    }
}