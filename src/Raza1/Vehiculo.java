/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza1;

import algo.Aviones;
import algo.Tanque;
import algo.misil;
import java.util.ArrayList;

/**
 *
 * @author Mery Acevedo
 */
public class Vehiculo implements RAZA1{
    
    private ArrayList<Tanque> tanques=new ArrayList<>();
    private ArrayList<Aviones> aviones=new ArrayList<>();
    private ArrayList<misil> misiles=new ArrayList<>();
    @Override
    public Object crear(int opcion) {
        switch(opcion){
            case 1:
                Tanque e=new Tanque();
                tanques.add(e);
                return e;
            case 2:
                Aviones a=new Aviones();
                aviones.add(a);
                return a;
            case 3:
                misil m=new misil();
                misiles.add(m);
                return m;
            default:
                return null;
        }
    }

    @Override
    public String atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int recolectar() {
        return 0;   
    }

    @Override
    public void ver() {
        
        System.out.println("hay: "+tanques.size()+" ejercitos");
        System.out.println("hay: "+aviones.size()+" soldados especiales");
        System.out.println("hay: "+misiles.size()+" misiles");
    }
    
}
