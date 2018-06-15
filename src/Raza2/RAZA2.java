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
public interface RAZA2 {
    ArrayList<Ejercito> getejercito();
    ArrayList<Soldadoespacial> getsoldado();
    ArrayList<FuerzasEspeciale>getfuerzas();
    void crear(int op);
    void pelear();
    ArrayList<Tanque> gettanque();
    ArrayList<Aviones> getavion();
    ArrayList<misil> getmisil();
    ArrayList<Cuartel> getcuartel();
    ArrayList<Mina> getmina();
    ArrayList<mina2> getmina2();
    ArrayList<mina3> getmina3();
    ArrayList<Silo> getsilo();
    void ver();
    
}
