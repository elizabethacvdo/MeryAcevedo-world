/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza3;

import Raza1.RAZA1;
import Raza2.RAZA2;
import parcial2.AbstracfactoriRazas;

/**
 *
 * @author Mery Acevedo
 */
public class ProducerRaza3 implements AbstracfactoriRazas{

    @Override
    public RAZA1 getraza1(int opcion) {
return null;    }

    @Override
    public RAZA2 getraza2(int opcion) {
return null;    }

    @Override
    public RAZA3 getraza3(int opcion) {
switch(opcion){
            case 1:
                return new Milicia();
            case 2:
                return new Vehiculo();
            case 3:
                return new Edificacion();
            default:
                return null;
        }    }

 


    
}
