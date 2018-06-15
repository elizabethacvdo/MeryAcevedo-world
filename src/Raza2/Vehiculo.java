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
import parcial2.Jugador2;

/**
 *
 * @author Mery Acevedo
 */
public class Vehiculo implements RAZA2{
 
    private ArrayList<Tanque> tanques = new ArrayList<>();
    private ArrayList<Aviones> aviones = new ArrayList<>();
    private ArrayList<misil> misiles = new ArrayList<>();

  
    @Override
   public void crear(int op,Jugador2 j) {
        switch (op) {
            case 1:
                Tanque e = new Tanque();
                e.setAtaque(100);
                e.setFasecreacion(5);
                e.setRecurso1(500);
                e.setRecurso2(300);
                e.setRecurso3(100);
                e.setVida(200);
                tanques.add(e);
                break;
            case 2:
                Aviones a = new Aviones();
                a.setAtaque(100);
                a.setFasecreacion(3);
                a.setRecurso1(500);
                a.setRecurso2(300);
                a.setRecurso3(100);
                a.setVida(50);
                aviones.add(a);
                break;
            case 3:
                misil m = new misil();
                m.setFasecreacion(5);
                m.setRecurso1(800);
                m.setRecurso2(200);
                m.setRecurso3(100);
                
                misiles.add(m);
                break;
        }
    }

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
        return tanques;
    }

    @Override
    public ArrayList<Aviones> getavion() {
        return aviones;
    }

    @Override
    public ArrayList<misil> getmisil() {
        return misiles;
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

        System.out.println("tiene: " + tanques.size() + " tanques");
        System.out.println("tiene: " + aviones.size() + " aviones");
        System.out.println("tiene: " + misiles.size() + " misiles");
    }

}
