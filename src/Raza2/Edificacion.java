/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza2;

import parcial2.Cuartel;
import parcial2.Mina;
import parcial2.Silo;

/**
 *
 * @author Mery Acevedo
 */
public class Edificacion implements RAZA2{

    @Override
    public Object crear(int opcion) {
switch(opcion){
            case 1:
                return new Mina();
            case 2:
                return new Cuartel();
            case 3:
                return new Silo();
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
