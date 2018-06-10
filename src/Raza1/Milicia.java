/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza1;

import algo.Ejercito;
import algo.FuerzasEspeciale;
import algo.Soldadoespacial;
import java.util.ArrayList;

/**
 *
 * @author Mery Acevedo
 */
public class Milicia implements RAZA1{
    private ArrayList<Ejercito> ejercitos;
    private ArrayList<Soldadoespacial> soldadosespeciales;
    private ArrayList<FuerzasEspeciale> fuerzasespeciales;
    
    
    public Milicia() {
        ejercitos = new ArrayList<>();
        soldadosespeciales = new ArrayList<>();
        fuerzasespeciales= new ArrayList<>();
    }

    @Override
    public Object crear(int opcion) {
        switch(opcion){
            case 1:
                Ejercito e=new Ejercito();
                ejercitos.add(e);
                return e;
            case 2:
                Soldadoespacial se=new Soldadoespacial();
                soldadosespeciales.add(se);
                return se;
            case 3:
                FuerzasEspeciale fe = new FuerzasEspeciale();
                fuerzasespeciales.add(fe);
                return fe;
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
    
    /**
     *
     * @return
     */
    public  int verejercitos(){
        return ejercitos.size();
    }
    
     public int versoldados(){
        return soldadosespeciales.size();
    }
     
     
      public int verfuerzas(){
        return fuerzasespeciales.size();
    }
    
    
}
