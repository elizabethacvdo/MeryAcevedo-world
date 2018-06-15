/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza1;

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
import parcial2.Jugador2;

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
   public void crear(int op,Jugador2 j) {
switch(op){
            case 1:
                Mina e=new Mina();
                e.setFasecreacion(1);
                e.setProduce(200);
                e.setRecurso1(300);
                e.setRecurso2(100);
                e.setRecurso3(50);
                e.setVida(100);
                mina.add(e);
                break;
            case 2:
                Silo s=new Silo();
                silo.add(s);
                break;
            case 3:
                Cuartel c=new Cuartel();
                c.setCapacidad(5);
                c.setFasecreacion(2);
                c.setRecurso1(500);
                c.setRecurso2(300);
                c.setRecurso3(100);
                c.setVida(400);
                cuartel.add(c);
                break;
            case 4:
                mina2 m2=new mina2();
                m2.setFasecreacion(2);
                m2.setProduce(100);
                m2.setRecurso1(500);
                m2.setRecurso2(200);
                m2.setRecurso3(100);
                m2.setVida(100);
                mina2.add(m2);
                break;
            case 5:
                mina3 m3=new mina3();
                m3.setFasecreacion(3);
                m3.setProduce(20);
                m3.setRecurso1(800);
                m3.setRecurso2(300);
                m3.setRecurso3(200);
               m3.setVida(100);
                mina3.add(m3);
                break;
            
        }    }

    @Override
   public void pelear(Jugador2 j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Ejercito> getejercito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Soldadoespacial> getsoldado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<FuerzasEspeciale> getfuerzas() {
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
return cuartel;    }

    @Override
    public ArrayList<Mina> getmina() {
return mina;    }

    @Override
    public ArrayList<mina2> getmina2() {
return mina2;    }

    @Override
    public ArrayList<mina3> getmina3() {
return mina3;    }

    @Override
    public ArrayList<Silo> getsilo() {
return silo;    }

    @Override
    public void ver() {
        System.out.println("tiene: "+mina.size()+" mina");
        System.out.println("tiene: "+silo.size()+" silo");
        System.out.println("tiene: "+cuartel.size()+" cuarteles");
    
    
    }
    
}
