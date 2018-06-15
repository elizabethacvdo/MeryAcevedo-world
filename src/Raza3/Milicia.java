/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza3;

import algo.Aviones;
import algo.Cuartel;
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
public class Milicia implements RAZA3{
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
   public void crear(int op,Jugador2 j) {
        switch(op){
            case 1:
                int a =j.getEdificacion3().getcuartel().size();
                if(j.getEdificacion3().getcuartel().get(a-1).getCapacidad()>0){
                Ejercito e=new Ejercito();
                e.setVida(200);
                e.setFasecreacion(2);
                e.setAtaque(100);
                e.setRecurso1(100);
                e.setRecurso2(50);
                e.setRecurso3(25);
                ejercitos.add(e);
                j.getEdificacion3().getcuartel().get(0).setCapacidad(-1);
                }else{
                    System.out.println("no tienes mas espacio en este cuartel crea mas");
                }
                break;
                
            case 2:
                int b =j.getEdificacion3().getcuartel().size();
                if(j.getEdificacion3().getcuartel().get(b-1).getCapacidad()>0){
                Soldadoespacial se=new Soldadoespacial();
                se.setVida(50);
                se.setFasecreacion(3);
                se.setAtaque(100);
                se.setRecurso1(200);
                se.setRecurso2(100);
                se.setRecurso3(75);
                soldadosespeciales.add(se);
                j.getEdificacion3().getcuartel().get(0).setCapacidad(-1);
                }else{
                    System.out.println("no tienes mas espacio en este cuartel crea mas");
                }
                break;
            case 3:
                int c =j.getEdificacion3().getcuartel().size();
                if(j.getEdificacion3().getcuartel().get(c-1).getCapacidad()>0){
                FuerzasEspeciale fe = new FuerzasEspeciale();
                fe.setVida(100);
                fe.setFasecreacion(3);
                fe.setAtaque(200);
                fe.setRecurso1(500);
                fe.setRecurso2(200);
                fe.setRecurso3(100);
                fuerzasespeciales.add(fe);
                j.getEdificacion3().getcuartel().get(0).setCapacidad(-1);
                }else{
                    System.out.println("no tienes mas espacio en este cuartel crea mas");
                }
                break;
        }
    }

    @Override
    public void pelear(Jugador2 j) {
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


 
    
    
}
