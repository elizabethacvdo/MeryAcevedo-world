/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza3;

import parcial2.Aviones;
import parcial2.Tanque;
import parcial2.misil;

/**
 *
 * @author Mery Acevedo
 */
public class Vehiculo implements RAZA3{

    @Override
    public Object crear(int opcion) {
switch(opcion){
            case 1:
                return new Tanque();
            case 2:
                return new Aviones();
            case 3:
                return new misil();
            default:
                return null;
        }    }

    @Override
    public String atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int recolectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
