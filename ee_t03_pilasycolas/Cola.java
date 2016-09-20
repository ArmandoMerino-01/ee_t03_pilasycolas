
package ee_t03_pilasycolas;

/**
 *
 * @author Armando1
 */
public class Cola<T> {
	private Lista<T> cola = new Lista<T>();
    
    public void insertar(T dato){
        cola.agregarFinal(dato);
    }
    
    public T eliminar(){
        return cola.eliminaInicioDevolviendo();
    }
}


