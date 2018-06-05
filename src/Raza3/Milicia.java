/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza3;

import algo.Ejercito;
import algo.FuerzasEspeciale;
import algo.Soldadoespacial;



/**
 *
 * @author Mery Acevedo
 */
public class Milicia implements RAZA3{
    Ejercito m;

    @Override
    public Object crear(int opcion) {
switch(opcion){
            case 1:
                m=new Ejercito();
                m.imprimir();
                return m;
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
