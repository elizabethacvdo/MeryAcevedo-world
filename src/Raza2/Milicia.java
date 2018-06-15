/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza2;

import algo.Aviones;
import algo.Cuartel;
import algo.CuartelCentral;
import algo.Ejercito;
import algo.FuerzasEspeciale;
import algo.Mina;
import algo.Silo;
import algo.Soldadoespacial;
import algo.Tanque;
import algo.mina2;
import algo.mina3;
import algo.misil;
import java.util.ArrayList;

/**
 *
 * @author Mery Acevedo
 */
public class Milicia implements RAZA2{
  private ArrayList<Ejercito> ejercitos=new ArrayList<>();
    private ArrayList<Soldadoespacial> soldadosespeciales=new ArrayList<>();
    private ArrayList<FuerzasEspeciale> fuerzasespeciales=new ArrayList<>();
  
  
    @Override
    public ArrayList<Ejercito> getejercito() {
return ejercitos;    }

    @Override
    public ArrayList<Soldadoespacial> getsoldado() {
return soldadosespeciales;    }

    @Override
    public ArrayList<FuerzasEspeciale> getfuerzas() {
return fuerzasespeciales;    }

    @Override
    public void crear(int op) {
        switch(op){
            case 1:
                Ejercito e=new Ejercito();
                e.setVida(200);
                e.setFasecreacion(2);
                e.setAtaque(100);
                e.setRecurso1(100);
                e.setRecurso2(50);
                e.setRecurso3(25);
                ejercitos.add(e);
                break;
                
            case 2:
                Soldadoespacial se=new Soldadoespacial();
                se.setVida(50);
                se.setFasecreacion(3);
                se.setAtaque(100);
                se.setRecurso1(200);
                se.setRecurso2(100);
                se.setRecurso3(75);
                soldadosespeciales.add(se);
                break;
            case 3:
                FuerzasEspeciale fe = new FuerzasEspeciale();
                fe.setVida(100);
                fe.setFasecreacion(3);
                fe.setAtaque(200);
                fe.setRecurso1(500);
                fe.setRecurso2(200);
                fe.setRecurso3(100);
                fuerzasespeciales.add(fe);
                break;
        }
    }

    @Override
    public void pelear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Tanque> gettanque() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Aviones> getavion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<misil> getmisil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cuartel> getcuartel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Mina> getmina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<mina2> getmina2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<mina3> getmina3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Silo> getsilo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ver() {
        System.out.println("tiene: "+ejercitos.size()+" ejercitos");
        System.out.println("tiene: "+soldadosespeciales.size()+" soldados especiales");
        System.out.println("tiene: "+fuerzasespeciales.size()+" fuerzas especiales");
    }

    @Override
    public CuartelCentral getcuartelcentral() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
     
}
