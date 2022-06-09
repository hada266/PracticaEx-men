/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase para gestionar listas de productos
 * @author loned
 *
 */
public class ListaProductos {

	/**
	 * nombre de la lista de productos
	 */
	private String nombreLista;
    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el n√∫mero de productos contenidos en la lista
     */
    private static int n = 0;
    
    private int getNumProductos() {
        return n;
    }

    private void setNumProductos(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no est√° vac√≠a)
     * 
     * @param campo cadena a analizar
     * @return True: Cadena vac√≠a, False: Cadena correcta
     */
    private boolean parametro_vacio(String campo){
    
        if ((campo.replace(" ","").isEmpty()) || (campo == null))  return true; else return false;
    }
    /**
     * Este mÈtodo crea una lista de productos
     * @param nombre recibe como p·rametro un nombre
     *  
     */
    public ListaProductos(String nombre) {
    	if (parametro_vacio(nombre)) {
    		this.nombreLista = "noNamed";
    	}
    	else {
    	this.nombreLista = nombre;
    	}
    }
    /**
     * Con este mÈtodo conseguiremos el total de productos que tenemos
     * @return getNumProductos() devolver· el numero de productos que hay en la lista
     */
    public int totalProductos(){
            return this.getNumProductos();
    }
    /**
     * Mediante este mÈtodo registraremos los productos    
     * @param prod recibe un producto como parametro
     * @return prod devolvera un producto
     */
    public Producto registraProducto(Producto prod) {
    	
        if (listaP.containsKey(prod.getcode())) {
           return null;
        }else if (parametro_vacio(prod.getcode())) {
        	return prod;
        }
        
        listaP.put(prod.getcode(), prod);
        n++;
        this.setNumProductos(n);
        return prod;
    }
    /**
     * En este metodo descartamos el producto, si el producto es distinto de null lo removemos de la lista
     * @param codigo recibe como parametro el codigo del producto
     * @return devuelve el producto
     */
    public Producto descartaProducto(String codigo) { 
        
        Producto prod = encuentraProducto(codigo);
        if (codigo != "") return null;
        if (prod != null) {
	        listaP.remove(codigo);
	        n--;
	        this.setNumProductos(n);
        }
        return prod;
    }
    /**
     * Mediante el codigo encontramos el producto  
     * @param codigo recibe como parametro el codigo del producto
     * @return prod o buscar el codigo en la lista 
     */
    public Producto encuentraProducto(String codigo) { 
        Producto prod = null;
        if (codigo != "") return null;
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }
/**
 * Devuelve un array con los productos registrados en la lista
 * @return array de productos
 */
    public ArrayList<Producto> recuperaProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    

}
