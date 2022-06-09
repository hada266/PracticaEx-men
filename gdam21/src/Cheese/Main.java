/*
*	grupo  :1GDAM TARDE
*	alumno :HADASA CARMEN TARLE
*	n.exp. :7261
*	fecha  :09/06/2022
 */
package Cheese;

/**
 * VERSION FINAL
 * Clase main del examen
 * @author ___
 */
public class Main {
	/**
	 * Método main del examen
	 * @param args Argumentos para linea de comandos
	 * @author ___
	 */
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
        
         ListaProductos lista1 = new ListaProductos("listaProd_1");
         Producto p1 = new Producto("123","alimetacion", 2, 2.6);
         Producto p2 = new Producto("345","mascotas", 8, 5.6);
         lista1.registraProducto(p1);
         lista1.registraProducto(p2);
         p1.imprime_etiqueta();
         p2.imprime_etiqueta();
     }
}
