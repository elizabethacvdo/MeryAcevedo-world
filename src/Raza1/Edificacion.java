/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza1;

import Raza1.RAZA1;
import algo.Cuartel;
import algo.Cuartel;
import algo.Cuartels;
import algo.Mina;
import algo.Mina;
import algo.Silo;
import algo.Silo;
import algo.mina2;

/**
 *
 * @author Mery Acevedo
 */
public class Edificacion implements RAZA1{
    private  Cuartels cuartelcentral =new Cuartels();
    

    @Override
    public Object crear(int opcion) {
        switch(opcion){
            case 1:
                return new Mina();
            case 2:
                return new Cuartel();
            case 3:
                return new Silo();
                case 4:
                return new mina2();
            default:
                return null;
        }
    }

    @Override
    public String atacar() {
return null;    }

    @Override
    public int recolectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
