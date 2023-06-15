/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */

package AdivinarNumero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class ExcepcionesEj5 {

    public static void main(String[] args) {
       int numAdivinar = (int) (Math.random() * 501);
        int num = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Intente adivinar el numero");
        int cont = 0;
        System.out.println("N: " + numAdivinar);

        boolean gano = true;
        do {

            try {

                System.out.println("Intente adivinar el numero");
                num = leer.nextInt();

                if (num == numAdivinar) {
                    gano = false;
                    break;

                } else {

                    if (num > numAdivinar) {
                        System.out.println("El numero es mas chico");
                    } else {
                        System.out.println("El numero es mas grande");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("El dato tiene que ser un Numero entero");
                leer.next();
            } catch (Exception e) {
                System.out.println("Error desconocido");
                System.out.println(e.toString());
            }

            cont++;
            System.out.println("vas " + cont + " intentos");
        } while (gano);

        System.out.println("Lo adivinaste en " + (cont + 1) + " intentos.");
    }
}
