/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza1;

import Raza1.RAZA1;
import algo.Ejercito;
import algo.Ejercito;
import algo.FuerzasEspeciale;
import algo.FuerzasEspeciale;
import algo.Soldadoespacial;
import algo.Soldadoespacial;

/**
 *
 * @author Mery Acevedo
 */
public class Milicia implements RAZA1{

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
        }
    }

    @Override
    public String atacar() {
        return null;
    }

    @Override
    public int recolectar() {
return 0;    }
    
}
