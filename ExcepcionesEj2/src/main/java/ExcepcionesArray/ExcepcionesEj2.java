/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */

package ExcepcionesArray;

/**
 *
 * @author Elio
 */
public class ExcepcionesEj2 {

    public static void main(String[] args) {
       String arr[] = new String[4];
  try {
        for (int i = 0; i < arr.length+5; i++) {
            arr[i] = " * ";

        }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
  
    }
}
