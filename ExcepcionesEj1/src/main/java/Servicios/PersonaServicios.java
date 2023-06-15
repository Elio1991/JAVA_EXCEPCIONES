/*
 Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: 
nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura.
    Si desea añadir algún otro atributo, puede hacerlo. 
    Agregar constructores, getters y setters.
    En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario
y después se le asignan a sus respectivos atributos para llenar el objeto Persona.
    Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
    Si no es correcto se deberá mostrar un mensaje.
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
    Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
    Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0. 
    Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1.
    A continuación, en la clase main hacer lo siguiente:
    Crear 4 objetos de tipo Persona con distintos valores, a continuación,
    llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto
si la persona es mayor de edad.
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables(arrays), para después calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima,
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
Para esto, podemos crear unos métodos adicionales.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class PersonaServicios {

    public boolean esMayorDeEdad(Persona p1) {
        return p1.getEdad() >= 18;
    }

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        Persona pers = new Persona();
        System.out.println("Ingrese su nombre");
        pers.setNombre(leer.nextLine());
        System.out.println("Ingrese su edad");
        pers.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese su sexo(‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro)");
            String leer2 = leer.next().toUpperCase();
            pers.setSexo(leer2.charAt(0));
            if (pers.getSexo() != 'H' && pers.getSexo() != 'M' && pers.getSexo() != 'O') {
                System.out.println("Ingrese una opción válida");
            }
        } while (pers.getSexo() != 'H' && pers.getSexo() != 'M' && pers.getSexo() != 'O');

        System.out.println("Ingrese su peso (en kg)");
        pers.setPeso(leer.nextFloat());
        System.out.println("Ingrese su altura");
        pers.setAltura(leer.nextFloat());
        return pers;
    }

    public int calcularIMC(Persona p1) {
        int imc;
        imc = (int) (p1.getPeso() / (Math.pow(p1.getAltura(), 2)));

        if (imc < 20) {
            imc = -1;
        } else if (imc > 25) {
            imc = 1;
        } else {
            imc = 0;
        }
        return imc;
    }

    public void porcentajePeso(Persona vecpers[]) {
        int[] peso = new int[4];
        int contP1 = 0;
        int contP2 = 0;
        int contP3 = 0;
        for (int i = 0; i < vecpers.length; i++) {
            peso[i] = calcularIMC(vecpers[i]);
            switch (peso[i]) {
                case -1:
                    contP1++;
                    break;
                case 0:
                    contP2++;
                    break;
                default:
                    contP3++;
                    break;
            }

        }
        int porcBajoPeso = (contP1 * 100) / 4;
        int porcPesoIdeal = (contP2 * 100) / 4;
        int porcSobrePeso = (contP3 * 100) / 4;

        System.out.println("Con bajo peso: " + porcBajoPeso + "%");
        System.out.println("Con peso ideal: " + porcPesoIdeal + "%");
        System.out.println("Con Sobrepeso: " + porcSobrePeso + "%");
    }

    public void porcentajeEdad(Persona vecpers[]) {
        boolean[] edad = new boolean[4];
        int contE1 = 0;
        int contE2 = 0;

        for (int i = 0; i < edad.length; i++) {
            edad[i] = esMayorDeEdad(vecpers[i]);
            if (edad[i]) {
                contE1++;
            } else {
                contE2++;
            }

        }
        int porcMayorEdad = (contE1 * 100) / 4;
        int porcMenorEdad = (contE2 * 100) / 4;
        System.out.println("Son Mayores de edad: " + porcMayorEdad + "%");
        System.out.println("Son Menores de edad: " + porcMenorEdad + "%");
    }
    
    // Este metodo lo hice antes de crear un vector para los objetos, pero era menos eficiente y daba el mismo resultado.
    /* public void porcentajePeso(Persona p1, Persona p2, Persona p3, Persona p4) {

        int[] peso = new int[4];

        peso[0] = calcularIMC(p1);
        peso[1] = calcularIMC(p2);
        peso[2] = calcularIMC(p3);
        peso[3] = calcularIMC(p4);

        int contP1 = 0;
        int contP2 = 0;
        int contP3 = 0;

        for (int i = 0; i < peso.length; i++) {
            switch (peso[i]) {
                case -1:
                    contP1++;
                    break;
                case 0:
                    contP2++;
                    break;
                default:
                    contP3++;
                    break;
            }
        }
        int porcBajoPeso = (contP1 * 100) / 4;
        int porcPesoIdeal = (contP2 * 100) / 4;
        int porcSobrePeso = (contP3 * 100) / 4;

        System.out.println("Con bajo peso: " + porcBajoPeso + "%");
        System.out.println("Con peso ideal: " + porcPesoIdeal + "%");
        System.out.println("Con Sobrepeso: " + porcSobrePeso + "%");
    }
    // Lo mismo para este metodo. No habia aplicado el array para los objetos
    
    public void porcentajeEdad(Persona p1, Persona p2, Persona p3, Persona p4) {

        boolean[] edad = new boolean[4];

        edad[0] = esMayorDeEdad(p1);
        edad[1] = esMayorDeEdad(p2);
        edad[2] = esMayorDeEdad(p3);
        edad[3] = esMayorDeEdad(p4);

        int contE1 = 0;
        int contE2 = 0;

        for (int i = 0; i < edad.length; i++) {
            if (edad[i]) {
                contE1++;
            } else {
                contE2++;
            }

        }
        int porcMayorEdad = (contE1 * 100) / 4;
        int porcMenorEdad = (contE2 * 100) / 4;
        System.out.println("Son Mayores de edad: " + porcMayorEdad + "%");
        System.out.println("Son Menores de edad: " + porcMenorEdad + "%");
    }*/

}
