/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza1;

import Raza2.RAZA2;
import Raza3.RAZA3;
import parcial2.AbstracfactoriRazas;

/**
 *
 * @author Mery Acevedo
 */
public class ProducerRaza1 implements AbstracfactoriRazas{

    @Override
    public RAZA1 getraza1(int opcion) {//escogeria una opcion vehicul milicia o edif
        switch(opcion){
            case 1:
                return new Milicia();
            case 2:
                return new Vehiculo();
            case 3:
                return new Edificacion();
            default:
                return null;
        }
    }


    @Override
    public RAZA2 getraza2(int opcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RAZA3 getraza3(int opcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
