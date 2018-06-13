/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza1;

import algo.Cuartel;
import algo.Cuartels;
import algo.Ejercito;
import algo.FuerzasEspeciale;
import algo.Mina;
import algo.Silo;
import algo.Soldadoespacial;
import algo.mina2;
import algo.mina3;
import java.util.ArrayList;

/**
 *
 * @author Mery Acevedo
 */
public class Edificacion implements RAZA1{
    
    private ArrayList<Mina> mina=new ArrayList<>();  
    private ArrayList<mina2> mina2=new ArrayList<>();
    private ArrayList<mina3> mina3=new ArrayList<>();
    private ArrayList<Silo> silo=new ArrayList<>();
    private ArrayList<Cuartel> cuartel=new ArrayList<>();
    

    @Override
    public Object crear(int opcion) {
        switch(opcion){
            case 1:
                Mina e=new Mina();
                mina.add(e);
                return e;
            case 2:
                Silo s=new Silo();
                silo.add(s);
                return s;
            case 3:
                Cuartel c=new Cuartel();
                cuartel.add(c);
                return c;
            case 4:
                mina2 m2=new mina2();
                mina2.add(m2);
                return m2;
            case 5:
                mina3 m3=new mina3();
                mina3.add(m3);
                return m3;
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

    @Override
    public void ver() {
        System.out.println("hay: "+mina.size()+" mina");
        System.out.println("hay: "+silo.size()+"silo");
        System.out.println("hay "+cuartel.size()+"cuarteles");
        
    }
    
}
