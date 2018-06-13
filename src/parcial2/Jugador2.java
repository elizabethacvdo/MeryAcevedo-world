/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import Raza1.Edificacion;
import Raza1.Milicia;
import Raza1.RAZA1;
import Raza1.Vehiculo;
import Raza2.RAZA2;
import Raza3.RAZA3;

/**
 *
 * @author Mery Acevedo
 */
public class Jugador2 {
    private final String nombre;
   private  AbstracfactoriRazas raza;
   private RAZA1 milicia;
   private RAZA1 edificacion;
   private RAZA1 vehiculo;
   private RAZA2 milicia2;
   private RAZA2 edificacion2;
   private RAZA2 vehiculo2;
   private RAZA3 milicia3;
   private RAZA3 edificacion3;
   private RAZA3 vehiculo3;

    public String getNombre() {
        return nombre;
    }

    public RAZA1 getMilicia() {
        return milicia;
    }

    public RAZA1 getEdificacion() {
        return edificacion;
    }

    public RAZA1 getVehiculo() {
        return vehiculo;
    }

    public RAZA2 getMilicia2() {
        return milicia2;
    }

    public RAZA2 getEdificacion2() {
        return edificacion2;
    }

    public RAZA2 getVehiculo2() {
        return vehiculo2;
    }

    public RAZA3 getMilicia3() {
        return milicia3;
    }

    public RAZA3 getEdificacion3() {
        return edificacion3;
    }

    public RAZA3 getVehiculo3() {
        return vehiculo3;
    }

    public void setRaza(AbstracfactoriRazas raza) {
        this.raza = raza;
    }

    public void setMilicia2(RAZA2 milicia2) {
        this.milicia2 = milicia2;
    }

    public void setEdificacion2(RAZA2 edificacion2) {
        this.edificacion2 = edificacion2;
    }

    public void setVehiculo2(RAZA2 vehiculo2) {
        this.vehiculo2 = vehiculo2;
    }

    public void setMilicia3(RAZA3 milicia3) {
        this.milicia3 = milicia3;
    }

    public void setEdificacion3(RAZA3 edificacion3) {
        this.edificacion3 = edificacion3;
    }

    public void setVehiculo3(RAZA3 vehiculo3) {
        this.vehiculo3 = vehiculo3;
    }

   
   
    public Jugador2(String nombre, AbstracfactoriRazas raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
   

    public  String getnombre2() {
        return nombre;
    }

    public AbstracfactoriRazas getRaza() {
        return raza;
    }

    void setMilicia(RAZA1 milicia) {
        this.milicia=milicia;
    }

    void setEdificacion(RAZA1 edificacion) {
        this.edificacion=edificacion;   }

    void setVehiculo(RAZA1 vehiculo) {
        this.vehiculo=vehiculo;    }
    
    

   
    
}
