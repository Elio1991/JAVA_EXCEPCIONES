/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */

package DivisionNumero;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class ExcepcionesEj3yEj4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         int n1Int = 0;
         int n2Int = 0;
        try {
            System.out.println("Ingrese N 1");
            String n1 = leer.next();
            System.out.println("Ingrese N 2");
            String n2 = leer.next();
           
            
           n1Int = parseInt(n1);
           n2Int = Integer.parseInt(n2);
              System.out.println("El resutaldo es "+ division(n1Int, n2Int));

        } catch (ArithmeticException e) {
            
            System.out.println("No se puede dividir por 0");
            
        }catch (NumberFormatException e) {
            System.out.println("El valor tiene que ser un numero");
            
        }catch (InputMismatchException e) {
            System.out.println("No coincide el tipo de dato");
        }
        
    

    }

    public static int division(int n1, int n2) {

        return n1 / n2;

    }
}
