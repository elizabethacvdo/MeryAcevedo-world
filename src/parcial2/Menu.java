package parcial2;

import Raza1.Edificacion;
import Raza1.Milicia;
import Raza1.RAZA1;
import Raza1.Vehiculo;
import Raza2.RAZA2;
import Raza3.RAZA3;
import java.util.Scanner;

/**
 *
 * @author Mery Acevedo
 */
public class Menu {

    Scanner input = new Scanner(System.in);
    private AbstracfactoriRazas raza1;
    private AbstracfactoriRazas raza2;
    private Jugador2 j1 = null;
    private Jugador2 j2 = null;
    private int opcion11,o1,o2,cont=0;

   
    

    public void iniciar() {
        System.out.println("iniciar partida");
        System.out.println("jugador 1: ");
        for (int i = 0; i < 2; i++) {

            System.out.println("ingrese su nombre: ");
            String nombre1 = input.nextLine();
            OUTER:
            while (true) {
                System.out.println("elija una raza: ");
                System.out.println("a. raza1");
                System.out.println("b. raza2");
                System.out.println("c. raza3");
                String opcion1 = input.nextLine();
                if (null == opcion1) {
                    System.out.println("ingrese una opcion valida");
                } else {
                    switch (opcion1) {
                        case "a":
                            opcion11 = 1;
                            break OUTER;
                        case "b":
                            opcion11 = 2;
                            break OUTER;
                        case "c":
                            opcion11 = 3;
                            break OUTER;
                        default:
                            System.out.println("ingrese una opcion valida");
                            break;
                    }
                }
            }
            if (i == 0) {
                j1 = new Jugador2(nombre1, raza1 = ProducerRazas.getrazas(opcion11));
                o1=opcion11;    //es el tipo de raza
                System.out.println("jugador 2: ");

            } else {
                j2 = new Jugador2(nombre1, raza2 = ProducerRazas.getrazas(opcion11));
                o2=opcion11;    //es el tipo de raza
                System.out.println(opcion11);
            }

        }
        escoger2(j1, j2,o1,o2);
    }
////----------------------------------------------------------------------------------------------------------------
    public void escogerra1(Jugador2 j, int opcion) {//opcion es el elemento que escogio milicia,eduf.etc..
        switch (opcion) {
            case 1:
                 if(null==j.getMilicia()){
                RAZA1 mil = j.getRaza().getraza1(opcion);
                 j.setMilicia(mil);
                 j.getMilicia().ver();
                 j.getMilicia().crear(escoger4("ejercito","soldado especial","fuerzas especiales"));
                 }else{
                     j.getMilicia().ver();
                     j.getMilicia().crear(escoger4("ejercito","soldado especial","fuerzas especiales"));
                 }
                break;
            case 2:
                
                if(null==j.getEdificacion()){
                RAZA1 edif = j.getRaza().getraza1(opcion);
                 j.setEdificacion(edif);
                 j.getEdificacion().ver();
                 j.getEdificacion().crear(escoger4("mina","cuartel","silo(misiles)"));
                 }else{
                     j.getEdificacion().ver();
                     j.getEdificacion().crear(escoger4("mina","cuartel","silo(misiles)"));
                 }
                break;
            case 3:
                if(null==j.getVehiculo()){
                RAZA1 vehi = j.getRaza().getraza1(opcion);
                 j.setVehiculo(vehi);
                    System.out.println("ola1");
                 j.getVehiculo().ver();
                 j.getVehiculo().crear(escoger4("tanque","aviones","misil"));
                 }else{
                   j.getVehiculo().ver();
                     j.getVehiculo().crear(escoger4("tanque","aviones","misil"));
                 }
                break;
        }
    }

    public void escogerra2(Jugador2 j, int opcion) {
           switch (opcion) {
            case 1:
                 if(null==j.getMilicia()){
                     RAZA2  milicia =j.getRaza().getraza2(opcion);
                //RAZA2 milicia = (RAZA2) j.getRaza().getraza1(opcion);
                 j.setMilicia2(milicia);
                 j.getMilicia2();
                 j.getMilicia2().crear(escoger4("ejercito","soldado especial","fuerzas especiales"));
                 }else{
                     j.getMilicia().ver();
                     j.getMilicia().crear(escoger4("ejercito","soldado especial","fuerzas especiales"));
                 }
                break;
            case 2:
                
                if(null==j.getEdificacion()){
                RAZA2 edif = (RAZA2) j.getRaza().getraza2(opcion);
                 j.setEdificacion((Edificacion) edif);
                 j.getEdificacion().ver();
                 j.getEdificacion().crear(escoger4("mina","cuartel","silo(misiles)"));
                 }else{
                     j.getEdificacion().ver();
                     j.getEdificacion().crear(escoger4("mina","cuartel","silo(misiles)"));
                 }
                break;
            default:
                if(null==j.getVehiculo()){
                RAZA2 vehi = (RAZA2) j.getRaza().getraza2(opcion);
                 j.setVehiculo((Vehiculo) vehi);
                 j.getVehiculo().ver();
                 j.getVehiculo().crear(escoger4("tanque","aviones","misil"));
                 }else{
                   j.getVehiculo().ver();
                     j.getVehiculo().crear(escoger4("tanque","aviones","misil"));
                 }
                break;
        }
    }

    public void escogerra3(Jugador2 j, int opcion) {
           switch (opcion) {
            case 1:
                 if(null==j.getMilicia()){
                RAZA3 milicia = (RAZA3) j.getRaza().getraza3(opcion);
                 j.setMilicia((Milicia) milicia);
                 j.getMilicia().ver();
                 j.getMilicia().crear(escoger4("ejercito","soldado especial","fuerzas especiales"));
                 }else{
                     j.getMilicia().ver();
                     j.getMilicia().crear(escoger4("ejercito","soldado especial","fuerzas especiales"));
                 }
                break;
            case 2:
                
                if(null==j.getEdificacion()){
                RAZA3 edif = (RAZA3) j.getRaza().getraza3(opcion);
                 j.setEdificacion((Edificacion) edif);
                 j.getEdificacion().ver();
                 j.getEdificacion().crear(escoger4("mina","cuartel","silo(misiles)"));
                 }else{
                     j.getEdificacion().ver();
                     j.getEdificacion().crear(escoger4("mina","cuartel","silo(misiles)"));
                 }
                break;
            default:
                if(null==j.getVehiculo()){
                RAZA3 vehi = (RAZA3) j.getRaza().getraza3(opcion);
                 j.setVehiculo((Vehiculo) vehi);
                 j.getVehiculo().ver();
                 j.getVehiculo().crear(escoger4("tanque","aviones","misil"));
                 }else{
                   j.getVehiculo().ver();
                     j.getVehiculo().crear(escoger4("tanque","aviones","misil"));
                 }
                break;
        }
    }

    //----------------------------------------------------------------------------------------------------------    
    public void escoger2(Jugador2 j,Jugador2 j2,int o1,int o2){///ambos jugadores y sus tipos de raza
        String opcion1;
        while(true){
        System.out.println("jugador1");
        for(int i=0;i<2;i++){
            OUTER:
            while (true) {
                System.out.println("escoja una opcion: ");
                System.out.println("a. milicia");
                System.out.println("b. edificaciones");
                System.out.println("c. vehiculos");
                opcion1 = input.nextLine();
                if (null == opcion1) {
                    System.out.println("ingrese una opcion valida");
                } else {
                    switch (opcion1) {
                        case "a":
                            opcion11 = 1;
                            break OUTER;
                        case "b":
                            opcion11 = 2;
                            break OUTER;
                        case "c":
                            opcion11 = 3;
                            break OUTER;
                        default:
                            System.out.println("ingrese una opcion valida");
                            break;
                    }
                }
            }
            if(i==0){
                switch (o1) {//o1 es la raza que escogio anteriormente
                    case 1:
                        escogerra1(j,opcion11);
                        break;
                    case 2:
                        escogerra2(j,opcion11);
                        break;
                    default:
                        escogerra3(j,opcion11);
                        break;
                }
                    System.out.println("jugador2");
            }else{
                switch (o2) {
                    case 1:
                        escogerra1(j2,opcion11);
                        break;
                    case 2:
                        escogerra2(j2,opcion11);
                        break;
                    default:
                        escogerra3(j2,opcion11);
                        break;
                }
                System.out.println(opcion1);
            }
        }
        }
 }
    
    public int escoger3(){
        System.out.println("que desea hacer");
        int a;
        String opcion;
        while(true){
        System.out.println("a. crear");
        System.out.println("b. pelear /////no valida para las minas");
        System.out.println("c.recolectar //////solo valida para las minas");
        opcion=input.nextLine();
        if( null == opcion){
            System.out.println("ingrese una opcion valida");
        }else switch (opcion) {
                case "a":
                    a=1;
                    return a;
                case "b":
                    a=2;
                    return a;
                case "c":
                    a=3;
                    return a;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
        
        }
        
    }
    
    public int escoger4(String b,String c,String d){
        int a;
        String opcion;
        while(true){
            System.out.println("a. "+b);
        System.out.println("b. "+c);
        System.out.println("c. "+d);
        opcion=input.nextLine();
        if("a".equals(opcion)){
            a=1;
            return a;
        }else if("b".equals(opcion)){
            a=2;
            return a;
        }else if("c".equals(opcion)){
            a=3;
            return a;
        }else{
            System.out.println("ingrese una opcion valida");
        }
            
        }
        
    }
    
    
    
}





