
package ee_t03_pilasycolas;

/**
 *
 * @author Armando1
 */
import java.io.*;

public class Test {
	Pila<String> pila = new Pila<String>();
	Cola<String> cola = new Cola<String>();
	
	public void leerArchivo1(){		
		File file = new File("C:/Users/Armando1/Desktop/ESTRUCTURA (special)/datos.txt");
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String cad;
			cad = in.readLine(); //Lee la pimera linea del archivo de texto
			if(cad.equals("0")){ //Si el primer digito es 0,es pila
				System.out.println("PILA: ");
				cad = in.readLine(); //Lee la siguiente línea
				while(cad != null){
					if(cad.substring(0,1).equals("0"))
						pila.push(cad.substring(2,3));
					else{
						if(cad.equals("1")) 
							System.out.println(pila.pop());
						else
							if(cad.equals("2")) 
								System.out.println(pila.peek());
							else
								System.out.println("no existe la instruccion");
					}
					cad= in.readLine(); //Lee lineas y vuelve al ciclo
				}		
				in.close(); //Se cierra la lectura del archivo
			}
		}catch (FileNotFoundException e1) {
		      System.err.println("El archivo no existe");
	    } catch (IOException e2){
	      e2.printStackTrace();
	    }
	}
	
	public void leerArchivo2(){
	
		File file = new File("C:/Users/Armando1/Desktop/ESTRUCTURA (special)/datos2.txt");
		try{
			BufferedReader in = new BufferedReader(new FileReader(file));
			String cad;
			cad = in.readLine(); //Lee la pimera línea del documento
			if(cad.equals("1")){ //Si el primer número es 1, usará colas
				System.out.println("COLA:");
				cad = in.readLine(); //Lee la siguiente línea
				while(cad != null){
					if(cad.substring(0,1).equals("0")) 
						cola.insertar(cad.substring(2,3));
					else
						if(cad.equals("1"))
							System.out.println(cola.eliminar());
					cad = in.readLine(); //Lee la siguiente línea y regresa al ciclo
				}
				in.close(); //Se cierra la lectura del documento
			}
		}catch (FileNotFoundException ex) {
		      System.err.println("No existe el archivo");
	    } catch (IOException ex){
	      ex.printStackTrace();
	    }
	}
	
	public static void main(String[] args){
		Test a = new Test();
		a.leerArchivo1();
		System.out.println("-------------------------------------------------------------------");
		a.leerArchivo2();
	}
}