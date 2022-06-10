/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;


 import paquete1.Edificio;
 import paquete1.Empresa;
 import paquete1.Vehiculo;
 /* 
 * 
 * import paquete1.*;
 * 
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edi1 = new Edificio("Edificio Central");
        edi1.establecerCostos(10000);
        Edificio edi2 = new Edificio("Edificio Sur");
        edi2.establecerCostos(20000);
        Edificio edi3 = new Edificio("Edificio Norte");
        edi3.establecerCostos(30000);
        Edificio edi4 = new Edificio("Edificio Secundario");
        edi4.establecerCostos(20000);

        Vehiculo ve1 = new Vehiculo("Auto", "LBB0011", 10000);
        Vehiculo ve2 = new Vehiculo("Camioneta", "LCB0011", 20000);
        Vehiculo ve3 = new Vehiculo("Auto", "LBD0012", 6000);
        Vehiculo ve4 = new Vehiculo("Camioneta", "LCC0011", 10000);
        Vehiculo ve5 = new Vehiculo("Camioneta", "LDC0011", 25000);
        
        /*
        Edificio [] arregloE = new Edificio[4];
        arregloE[0] = edi1;
        arregloE[1] = edi2;
        arregloE[2] = edi3;
        arregloE[3] = edi4;
        */
        Edificio [] arregloE = {edi1,edi2,edi3,edi4};
        //System.out.println();
        
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        Empresa emp = new Empresa();
        
        emp.establecerNombre("Empresa de Hojas");
        emp.establecerEdificios(arregloE);
        
        emp.establecerCostoBienesInmuebles();
        System.out.println(emp);
        
        
        // Imprimir el costo de los bienes inmuebles de la empresa
        //System.out.printf("%.2f\n",emp.obtenerCostoBienesInmuebles());
    }
}
