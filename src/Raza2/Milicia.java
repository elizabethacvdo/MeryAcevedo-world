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
import static java.awt.SystemColor.menu;
import java.util.ArrayList;
import java.util.Scanner;
import parcial2.Jugador2;
import parcial2.Menu;

/**
 *
 * @author Mery Acevedo
 */
public class Milicia implements RAZA2{
  private ArrayList<Ejercito> ejercitos=new ArrayList<>();
    private ArrayList<Soldadoespacial> soldadosespeciales=new ArrayList<>();
    private ArrayList<FuerzasEspeciale> fuerzasespeciales=new ArrayList<>();
  Menu menu1=Menu.getInstance();
  Scanner input = new Scanner(System.in);
  
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
                int a =j.getEdificacion2().getcuartel().size();
                if(j.getEdificacion2().getcuartel().get(a-1).getCapacidad()>0){
                Ejercito e=new Ejercito();
                e.setVida(200);
                e.setFasecreacion(2);
                e.setAtaque(100);
                e.setRecurso1(100);
                e.setRecurso2(50);
                e.setRecurso3(25);
                int fase=e.getFasecreacion();
                int cf =menu1.getContadorfases();
                int oo=fase+cf;
                ejercitos.add(e);
                j.getEdificacion2().getcuartel().get(0).setCapacidad(-1);
                }else{
                    System.out.println("no tienes mas espacio en este cuartel crea mas");
                }
                break;
                
            case 2:
                int b =j.getEdificacion2().getcuartel().size();
                if(j.getEdificacion2().getcuartel().get(b-1).getCapacidad()>0){
                Soldadoespacial se=new Soldadoespacial();
                se.setVida(50);
                se.setFasecreacion(3);
                se.setAtaque(100);
                se.setRecurso1(200);
                se.setRecurso2(100);
                se.setRecurso3(75);
                soldadosespeciales.add(se);
                j.getEdificacion2().getcuartel().get(0).setCapacidad(-1);
                }else{
                    System.out.println("no tienes mas espacio en este cuartel crea mas");
                }
                break;
            case 3:
                int c =j.getEdificacion2().getcuartel().size();
                if(j.getEdificacion2().getcuartel().get(c-1).getCapacidad()>0){
                FuerzasEspeciale fe = new FuerzasEspeciale();
                fe.setVida(100);
                fe.setFasecreacion(3);
                fe.setAtaque(200);
                fe.setRecurso1(500);
                fe.setRecurso2(200);
                fe.setRecurso3(100);
                fuerzasespeciales.add(fe);
                j.getEdificacion2().getcuartel().get(0).setCapacidad(-1);
                }else{
                    System.out.println("no tienes mas espacio en este cuartel crea mas");
                }
                break;
        }
    }

    @Override
    public void pelear(Jugador2 j) {
        if(j==menu1.getJ1()){
        int a;
        String opcion;
        System.out.println("escoge uno **********************************");
        j.getMilicia().ver();
        while (true) {
            System.out.println("a. ejercito");
            System.out.println("b. soldado especial" );
            System.out.println("c. fuerzas especiales");
            opcion = input.nextLine();
            if ("a".equals(opcion)) {
                a =j.getMilicia().getejercito().get(0).getAtaque();
                break;
            } else if ("b".equals(opcion)) {
                a =j.getMilicia().getsoldado().get(0).getAtaque();
                break;
            } else if ("c".equals(opcion)) {
                a =j.getMilicia().getfuerzas().get(0).getAtaque();
                break;
            } else {
                System.out.println("ingrese una opcion valida");
            }

        }while (true) {
            menu1.getJ2().getEdificacion().ver();
            System.out.println("que quiere atacar:******************************************");
            System.out.println("a. mina1");
            System.out.println("b. mina2" );
            System.out.println("c. mina3");
            System.out.println("d. cuartel");
            System.out.println("e. silo" );
            System.out.println("f. cuatel_central");
            opcion = input.nextLine();
            if ("a".equals(opcion)) {
                menu1.getJ2().getEdificacion().getmina().get(0).setVida(-a);
                if(menu1.getJ2().getEdificacion().getmina().get(0).getRecurso1()<=0){
                menu1.getJ2().getEdificacion().getmina().remove(0);}
                break;
            } else if ("b".equals(opcion)) {
                menu1.getJ2().getEdificacion().getmina2().get(0).setVida(-a);
                if(menu1.getJ2().getEdificacion().getmina2().get(0).getRecurso1()<=0){
                menu1.getJ2().getEdificacion().getmina2().remove(0);}
                break;
            } else if ("c".equals(opcion)) {
                menu1.getJ2().getEdificacion().getmina3().get(0).setVida(-a);
                if(menu1.getJ2().getEdificacion().getmina3().get(0).getRecurso1()<=0){
                menu1.getJ2().getEdificacion().getmina3().remove(0);}
                break;
            }
            if ("d".equals(opcion)) {
                menu1.getJ2().getEdificacion().getcuartel().get(0).setVida(-a);
                if(menu1.getJ2().getEdificacion().getcuartel().get(0).getRecurso1()<=0){
                menu1.getJ2().getEdificacion().getcuartel().remove(0);}
                break;
            } else if ("e".equals(opcion)) 
            {menu1.getJ2().getEdificacion().getsilo().get(0).setVida(-a);
                if(menu1.getJ2().getEdificacion().getsilo().get(0).getRecurso1()<=0){
                menu1.getJ2().getEdificacion().getsilo().remove(0);}
               
                break;
            } 
            
            else if ("f".equals(opcion)) {
               if(menu1.getJ2().getEdificacion().getcuartel().size()<=0 && menu1.getJ2().getEdificacion().getmina().size()<=0 && menu1.getJ2().getEdificacion().getmina2().size()<=0 && menu1.getJ2().getEdificacion().getmina3().size()<=0 && menu1.getJ2().getEdificacion().getsilo().size()<=0 )
               {
                menu1.getJ2().getCuartelcentral().setVida(-a);
            }else{
               }
               
            } 
               else {
                System.out.println("ingrese una opcion valida");
            

        
         
        
    }
        
        
        }
        }
        
    
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
