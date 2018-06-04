/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza2;

import parcial2.Ejercito;
import parcial2.FuerzasEspeciale;
import parcial2.Soldadoespacial;

/**
 *
 * @author Mery Acevedo
 */
public class Milicia implements RAZA2{

    @Override
    public Object crear(int opcion) {
switch(opcion){
            case 1:
                return new Ejercito();
            case 2:
                return new Soldadoespacial();
            case 3:
                return new FuerzasEspeciale();
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
