/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author maisc
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        /*
        En el método **main**, se debe permitir ingresar objetos 
        de tipo Estudiante Distancia y Estudiante Presencial. 
        Uno a la vez. Si el usuario ingresa 1, se debe crear un 
        Estudiante Distancia por teclado; si ingresa 2, se debe crear un 
        Estudiante Presencial. Los datos de entrada serán ingresados por 
        teclado.

        Restricciones:
        * En el código solo debe usar por una sola ocasión la siguiente 
        sentencias
        ```
            nombres = entrada.nextLine()
            cedula = entrada.nextLine()
        ```
        * Si el usuario ingresa algo diferente de 1 o 2; el programa debe 
        presentar un mensaje que diga: "Error, opción no válida."
        
         */
        Scanner sc = new Scanner(System.in);
        EstudianteDistancia estD = new EstudianteDistancia();
        EstudiantePresencial estP = new EstudiantePresencial();
        sc.useLocale(Locale.US);

        int op;

        System.out.println("Ingrese segun corresponda:\n"
                + "[1] Ingresar un nuevo estudiante de Distancia\n"
                + "[2] Ingresar un nuevo estudiante Presencial");
        op = sc.nextInt();
        sc.nextLine();

        if (op < 1 || op > 2) {
            System.out.println("Error, opción no válida");
        } else {
            switch (op) {
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    estD.establecerNombresEstudiante(sc.nextLine());
                    System.out.println("Ingrese el apellido del estudiante: ");
                    estD.establecerApellidoEstudiante(sc.nextLine());
                    System.out.println("Ingrese la identificacion del estudiante: ");
                    estD.establecerIdentificacionEstudiante(sc.nextLine());
                    System.out.println("Ingrese la edad del estudiante: ");
                    estD.establecerEdadEstudiante(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Ingrese el numero de asignaturas: ");
                    estD.establecerNumeroAsginaturas(sc.nextInt());
                    System.out.println("Ingrese el costo por asignaturas: ");
                    estD.establecerCostoAsignatura(sc.nextDouble());

                    estD.calcularMatriculaDistancia();

                    System.out.printf("%s\n", estD);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    estP.establecerNombresEstudiante(sc.nextLine());
                    System.out.println("Ingrese el apellido del estudiante: ");
                    estP.establecerApellidoEstudiante(sc.nextLine());
                    System.out.println("Ingrese la identificacion del estudiante: ");
                    estP.establecerIdentificacionEstudiante(sc.nextLine());
                    System.out.println("Ingrese la edad del estudiante: ");
                    estP.establecerEdadEstudiante(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Ingrese el numero de creditos: ");
                    estP.establecerNumeroCreditos(sc.nextInt());
                    System.out.println("Ingrese el costo por creditos: ");
                    estP.establecerCostoCredito(sc.nextDouble());

                    estP.calcularMatriculaPresencial();

                    System.out.printf("%s\n", estP);
                    break;
            }
        }

    }
}
