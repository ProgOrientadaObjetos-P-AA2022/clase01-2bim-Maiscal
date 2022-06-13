/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;

import herencia1.EstudianteDistancia;

/**
 *
 * @author maisc
 */
public class Ejecutor1 {
    public static void main(String[] args) {
        EstudianteDistancia estD = new EstudianteDistancia();
        estD.establecerNombresEstudiante("Mario Isaac");
        estD.establecerApellidoEstudiante("Calva Abad");
        estD.establecerIdentificacionEstudiante("1101");
        estD.establecerEdadEstudiante(23);
        
        estD.establecerNumeroAsginaturas(6);
        estD.establecerCostoAsignatura(200);
        
        estD.calcularMatriculaDistancia();
        
        System.out.printf("%s\n",estD);
        
    }
}
