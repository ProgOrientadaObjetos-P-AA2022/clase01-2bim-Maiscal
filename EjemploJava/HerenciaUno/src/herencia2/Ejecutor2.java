/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author maisc
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        EstudiantePresencial estP = new EstudiantePresencial();
        
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
        
        System.out.printf("%s\n",estP);
    }
}
