/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package Personal;

import Entidades.Persona;
import Servicios.PersonaServicios;
import java.util.Scanner;

/**
 *
 * @author Elio
 */
public class Personal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        PersonaServicios ps1 = new PersonaServicios();
        
        try{
       Persona pers =null;
     
        ps1.esMayorDeEdad(pers);
        }catch(Exception e){
            System.out.println("Error");
        }
        
        /*  Scanner leer = new Scanner(System.in);
        PersonaServicios ps1 = new PersonaServicios();
        Persona[] vecpers = new Persona[4];

        System.out.println("Bienvenido!");
        System.out.println("###############################");
        for (int i = 0; i < vecpers.length; i++) {
            System.out.println("Ingrese los datos de la " + (i + 1) + "° persona");
            vecpers[i] = ps1.crearPersona();
            switch (ps1.calcularIMC(vecpers[i])) {
                case -1:
                    System.out.println("Esta por debajo de su peso");
                    break;
                case 0:
                    System.out.println("Esta en su peso ideal");
                    break;
                default:
                    System.out.println("Esta por encima de su peso");
                    break;
            }
            if (ps1.esMayorDeEdad(vecpers[i])) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
            System.out.println("#######################################");
        }
        ps1.porcentajePeso(vecpers);
        ps1.porcentajeEdad(vecpers);
        
        // Cree un vector para alojar varios objetos y solicitar los datos a traves del bucle "for".
        /* System.out.println("Ingrese los datos de la 1° Persona");
        System.out.println("----------------------------------");
        Persona p1 = ps1.crearPersona();
        switch (ps1.calcularIMC(p1)) {
            case -1:
                System.out.println("Esta por debajo de su peso");
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                break;
            default:
                System.out.println("Esta por encima de su peso");
                break;
        }
        if (ps1.esMayorDeEdad(p1)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("##################################");
        System.out.println("Ingrese los datos de la 2° Persona");
        System.out.println("----------------------------------");
        Persona p2 = ps1.crearPersona();
        switch (ps1.calcularIMC(p2)) {
            case -1:
                System.out.println("Esta por debajo de su peso");
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                break;
            default:
                System.out.println("Esta por encima de su peso");
                break;
        }
        if (ps1.esMayorDeEdad(p2)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("#################################");

        System.out.println("Ingrese los datos de la 3° Persona");
        System.out.println("----------------------------------");
        Persona p3 = ps1.crearPersona();
        switch (ps1.calcularIMC(p3)) {
            case -1:
                System.out.println("Esta por debajo de su peso");
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                break;
            default:
                System.out.println("Esta por encima de su peso");
                break;
        }
        if (ps1.esMayorDeEdad(p3)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("#################################");

        System.out.println("Ingrese los datos de la 4° Persona");
        System.out.println("----------------------------------");
        Persona p4 = ps1.crearPersona();
        switch (ps1.calcularIMC(p4)) {
            case -1:
                System.out.println("Esta por debajo de su peso");
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                break;
            default:
                System.out.println("Esta por encima de su peso");
                break;
        }
        if (ps1.esMayorDeEdad(p4)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("###############################");
        
        ps1.porcentajePeso(p1, p2, p3, p4);
        
        System.out.println("###############################");

        ps1.porcentajeEdad(p1, p2, p3, p4);*/
      
    }
}
