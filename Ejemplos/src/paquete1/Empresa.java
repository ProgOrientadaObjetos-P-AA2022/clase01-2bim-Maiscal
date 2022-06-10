/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private Vehiculo [] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculo;
    private double costoTotalBienes;
    
    public void establecerNombre(String m){
        nombre = m;
    }
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    public void establecerVehiculos(Vehiculo[] v){
        vehiculos = v;
    }
    public void establecerCostoBienesInmuebles(){
        double suma = 0;
        //for(int i = 0; i < edificios().length;i++){
        for(int i = 0; i < obtenerEdificios().length;i++){
            suma = suma + obtenerEdificios()[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }
    public void establecerCostoVehiculo(){
        double suma = 0;
        //for(int i = 0; i < edificios().length;i++){
        for(int i = 0; i < obtenerVehiculos().length;i++){
            suma = suma + obtenerVehiculos()[i].obtenerValor();
        }
        costoVehiculo = suma;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    public Vehiculo[] obtenerVehiculos(){
        return vehiculos;
    }
    public double obtenerCostoBienesInmuebles(){
        return costoBienesInmuebles;
    }
    public double obtenerCostoVehiculo(){
        return costoVehiculo;
    }
    public double obtenerCostoTotalBienes(){
        return costoTotalBienes;
    }

    @Override
    public String toString() {
        String cadena = "";
        String cadena2 = "";
        for(int i = 0; i < obtenerEdificios().length; i++){
            cadena = String.format("%s%d. %s - (%.2f)\n"
                    ,cadena
                    ,i+1
                    ,obtenerEdificios()[i].obtenerNombre().toUpperCase()
                    ,obtenerEdificios()[i].obtenerCosto()
            );
        }
        for(int i = 0; i <obtenerVehiculo().length;i++){
            cadena2 = String.format(
            );
        }
        String c = String.format("%s\nLista de Edificios\n"
                + "%sTotal de inmueble: %.2f"
                ,obtenerNombre()
                ,cadena
                ,obtenerCostoBienesInmuebles()
        );
        return c;
    }
}
