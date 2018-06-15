package parcial2;

import Raza1.Edificacion;
import Raza1.RAZA1;
import Raza2.RAZA2;
import Raza3.RAZA3;
import java.util.Scanner;

/**
 *
 * @author Mery Acevedo
 */
public class Menu {

    Scanner input = new Scanner(System.in);
    private static Menu menu1;
    
    private Menu(){
    }
    
    public static Menu getInstance(){
        if(menu1==null){
            menu1=new Menu();
        }return menu1;
    }
    private AbstracfactoriRazas raza1, raza2;
    private Jugador2 j1, j2;
    private int opcion11, o1, o2, cont = 0;
    private int contadorfases =0;

    public int getContadorfases() {
        return contadorfases;
    }

    public Jugador2 getJ1() {
        return j1;
    }

    public Jugador2 getJ2() {
        return j2;
    }

    

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
                o1 = opcion11;    //es el tipo de raza
                System.out.println("jugador 2: ");

            } else {
                j2 = new Jugador2(nombre1, raza2 = ProducerRazas.getrazas(opcion11));
                o2 = opcion11;    //es el tipo de raza
                System.out.println(opcion11);
            }

        }
        escoger2(j1, j2, o1, o2);
    }
////----------------------------------------------------------------------------------------------------------------

    private void escogerra1(Jugador2 j, int opcion) {//opcion es el elemento que escogio milicia,eduf.etc..
        switch (opcion) {
            case 1:                         ///milicia--------------------------------------------raza1
                if (null == j.getMilicia()) {
                    if (null != j.getEdificacion()) {
                        j.getEdificacion().ver();
                        if (j.getEdificacion().getcuartel().size() > 0) {

                            RAZA1 mil = j.getRaza().getraza1(opcion);
                            j.setMilicia(mil);
                            j.getMilicia().ver();
                            j.getMilicia().crear(escoger4("ejercito", "soldado especial", "fuerzas especiales"),j);
                        }
                    } else {
                        System.out.println("debes crear un cuartel primero");
                    }      
                } else{
                    j.getMilicia().ver();
                    switch (escoger3()) {
                        case 1:
                            j.getMilicia().crear(escoger4("ejercito", "soldado especial", "fuerzas especiales"),j);
                            break;
                        case 2:
                          //  j.getMilicia().pelear(j);
                            
                            break;
                        case 3:
                            System.out.println("no se puede recolectar con un ejercito");
                            break;
                    }

                }
                break;
            case 2:

                if (null == j.getEdificacion()) {///---------------------------------edificaciones
                    RAZA1 edif = j.getRaza().getraza1(opcion);
                    j.setEdificacion(edif);
                    j.getEdificacion().ver();
                            j.getEdificacion().crear(escoger5("mina", "silo", "cuartel","mina2","mina3"),j);
                } else {
                    j.getEdificacion().ver();
                    switch (escoger3()) {
                        case 1:
                            j.getEdificacion().crear(escoger5("mina", "silo", "cuartel","mina2","mina3"),j);
                            break;
                        case 2:
                            System.out.println("no puedes atacar con un edificio");
                            break;
                        case 3:
                            System.out.println("no puedes recolectar");
                            break;
                    }
                }
                break;
            case 3:
                if (null == j.getVehiculo()) {     //----------------------------vehiculos
                    if (null != j.getEdificacion()) {
                        j.getEdificacion().ver();
                        if (j.getEdificacion().getcuartel().size() > 0) {
                    RAZA1 vehi = j.getRaza().getraza1(opcion);
                    j.setVehiculo(vehi);
                    j.getVehiculo().ver();
                    j.getVehiculo().crear(escoger4("tanque", "aviones", "misil"),j);
                        }else{
                        System.out.println("debes crear antes un cuartel");
                    }
                    }else{
                        System.out.println("debes crear un cuartel primero");
                    }}else {
                    j.getVehiculo().ver();
                    switch (escoger3()) {
                        case 1:
                            j.getVehiculo().crear(escoger4("tanque", "aviones", "misil"),j);
                            break;
                        case 2:
                            //j.getVehiculo().pelear(j);
                            break;
                        case 3:
                            System.out.println("no se puede recolectar con esto");
                            break;
                    }
                }
                break;
        }}
    

     private void escogerra2(Jugador2 j, int opcion) {
        switch (opcion) {
            case 1:                         ///milicia--------------------------------------------raza1
                if (null == j.getMilicia2()) {//esto es para que solo cree una milicia por raza
                    
                       
                    if (null != j.getEdificacion2()) {
                        j.getEdificacion2().ver();
                        if (j.getEdificacion2().getcuartel().size() > 0) {

                            RAZA2 mil = j.getRaza().getraza2(opcion);
                            j.setMilicia2(mil);
                            j.getMilicia2().ver();
                            j.getMilicia2().crear(escoger4("ejercito", "soldado especial", "fuerzas especiales"),j);
                        }
                    } else {
                        System.out.println("debes crear un cuartel primero");
                    }      
                } else{
                    j.getMilicia2().ver();
                    switch (escoger3()) {
                        case 1:
                            j.getMilicia2().crear(escoger4("ejercito", "soldado especial", "fuerzas especiales"),j);
                            break;
                        case 2:
                            //j.getMilicia().pelear(j);
                            
                            break;
                        case 3:
                            System.out.println("no se puede recolectar con un ejercito");
                            break;
                    }

                }
                break;
            case 2:

                if (null == j.getEdificacion2()) {///---------------------------------edificaciones
                    RAZA2 edif = j.getRaza().getraza2(opcion);
                    j.setEdificacion2(edif);
                    j.getEdificacion2().ver();
                    j.getEdificacion2().crear(escoger5("mina", "silo", "cuartel","mina2","mina3"),j);
                } else {
                    j.getEdificacion2().ver();
                    switch (escoger3()) {
                        case 1:
                            j.getEdificacion2().crear(escoger5("mina", "silo", "cuartel","mina2","mina3"),j);
                            break;
                        case 2:
                            System.out.println("no puedes atacar con un edificio");
                            break;
                        case 3:
                            System.out.println("no puedes recolectar");
                            break;
                    }
                }
                break;
            case 3:
                if (null == j.getVehiculo2()) {     //----------------------------vehiculos
                    RAZA2 vehi = j.getRaza().getraza2(opcion);
                    j.setVehiculo2(vehi);
                    j.getVehiculo2().ver();
                    j.getVehiculo2().crear(escoger4("tanque", "aviones", "misil"),j);
                } else {
                    j.getVehiculo2().ver();
                    switch (escoger3()) {
                        case 1:
                            j.getVehiculo2().crear(escoger4("tanque", "aviones", "misil"),j);
                            break;
                        case 2:
                           // j.getVehiculo2().pelear(j);
                            break;
                        case 3:
                            System.out.println("no se puede recolectar con esto");
                            break;
                    }
                }
                break;
        }
    }

    private void escogerra3(Jugador2 j, int opcion) {
        switch (opcion) {
            case 1:                         ///milicia--------------------------------------------raza1
                if (null == j.getMilicia3()) {//esto es para que solo cree una milicia por raza

                    if (null != j.getEdificacion3()) {
                        j.getEdificacion3().ver();
                        if (j.getEdificacion3().getcuartel().size() > 0) {

                            RAZA3 mil = j.getRaza().getraza3(opcion);
                            j.setMilicia3(mil);
                            j.getMilicia3().ver();
                            j.getMilicia3().crear(escoger4("ejercito", "soldado especial", "fuerzas especiales"),j);
                        }
                    } else {
                        System.out.println("debes crear un cuartel primero");
                    }
                } else {
                    j.getMilicia3().ver();
                    switch (escoger3()) {
                        case 1:
                            j.getMilicia3().crear(escoger4("ejercito", "soldado especial", "fuerzas especiales"),j);
                            break;
                        case 2:
                            j.getMilicia3().pelear(j);
                            
                            break;
                        case 3:
                            System.out.println("no se puede recolectar nada");
                            break;
                    }

                }
                break;
            case 2:

                if (null == j.getEdificacion3()) {///---------------------------------edificaciones
                    RAZA3 edif = j.getRaza().getraza3(opcion);
                    j.setEdificacion3(edif);
                    j.getEdificacion3().ver();
                    j.getEdificacion3().crear(escoger4("mina", "silo", "cuartel"),j);
                } else {
                    j.getEdificacion3().ver();
                    switch (escoger3()) {
                        case 1:
                            j.getEdificacion3().crear(escoger5("mina", "silo", "cuartel","mina2","mina3"),j);
                            break;
                        case 2:
                            System.out.println("no puedes atacar con un edificio");
                            break;
                        case 3:
                            System.out.println("no puedes recolectar");
                            break;
                    }
                }
                break;
            case 3:
                if (null == j.getVehiculo3()) {     //----------------------------vehiculos
                    RAZA3 vehi = j.getRaza().getraza3(opcion);
                    j.setVehiculo3(vehi);
                    j.getVehiculo3().ver();
                    j.getVehiculo3().crear(escoger4("tanque", "aviones", "misil"),j);
                } else {
                    j.getVehiculo3().ver();
                    switch (escoger3()) {
                        case 1:
                            j.getVehiculo3().crear(escoger4("tanque", "aviones", "misil"),j);
                            break;
                        case 2:
                           // j.getVehiculo3().pelear(j);
                            break;
                        case 3:
                            System.out.println("no se puede recolectar con esto");
                            break;
                    }
                }
                break;
        }
    }

    //----------------------------------------------------------------------------------------------------------    
    private void escoger2(Jugador2 j, Jugador2 j2, int o1, int o2) {///ambos jugadores y sus tipos de raza
        String opcion1;
        System.out.println("inicio de juego ******************************");
        while (true) {
            
            for (int i = 0; i < 2; i++) {
                if(i==0){
                    System.out.println("jugador1*****************************************");
                }else{
                    System.out.println("jugador 2**************************************");
                }
                while(true){
                    
                    if(i==0){//------------------------------------------------------------------------
                       if( j.getCuartelcentral().getVida()<=0){
                           break;
                       }else{
                           System.out.println("desea aumentar nivel");
                           String o =input.nextLine();
                           if(o=="si"){
                               j.getCuartelcentral().comprarmejora();
                           }
                       }
                    }else{
                       if( j2.getCuartelcentral().getVida()<=0){
                           break;
                       }else{
                           System.out.println("desea aumentar nivel");
                           String o =input.nextLine();
                           if(o=="si"){
                               j2.getCuartelcentral().comprarmejora();
                           } 
                       }
                    }//----------------------------------------------------------------------------------------------

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
                if (i == 0) {
                  
                    switch (o1) {//o1 es la raza que escogio anteriormente
                        case 1:
                            escogerra1(j, opcion11);
                            break;
                        case 2:
                            escogerra2(j, opcion11);
                            break;
                        default:
                            escogerra3(j, opcion11);
                            break;
                    }
                    //System.out.println("jugador2");
                } else {
                    //System.out.println("jugador2");
                    switch (o2) {
                        case 1:
                            escogerra1(j2, opcion11);
                            break;
                        case 2:
                            escogerra2(j2, opcion11);
                            break;
                        default:
                            escogerra3(j2, opcion11);
                            break;
                    }
                    
                }
                    System.out.println("terminar turno si/no:");
                    String ll=input.nextLine();
                    if("si".equals(ll)){
                        break;
                    }
                
                
                }////aqui va un wuile   
            }///aqui termina el for
            if(j1.getCuartelcentral().getVida()<=0){
                break;
            }else if(j2.getCuartelcentral().getVida()<=0){
                break;
            }
        }/////aqui termina el while
    }

    private int escoger3() {
        System.out.println("que desea hacer");
        int a;
        String opcion;
        while (true) {
            System.out.println("a. crear");
            System.out.println("b. pelear /////no valida para las minas");
            System.out.println("c.recolectar //////solo valida para las minas");
            opcion = input.nextLine();
            if (null == opcion) {
                System.out.println("ingrese una opcion valida");
            } else {
                switch (opcion) {
                    case "a":
                        a = 1;
                        return a;
                    case "b":
                        a = 2;
                        return a;
                    case "c":
                        a = 3;
                        return a;
                    default:
                        System.out.println("ingrese una opcion valida");
                        break;
                }
            }

        }

    }

    private int escoger4(String b, String c, String d) {
        int a;
        String opcion;
        System.out.println("escoge uno **********************************");
        while (true) {
            System.out.println("a. " + b);
            System.out.println("b. " + c);
            System.out.println("c. " + d);
            opcion = input.nextLine();
            if ("a".equals(opcion)) {
                a = 1;
                return a;
            } else if ("b".equals(opcion)) {
                a = 2;
                return a;
            } else if ("c".equals(opcion)) {
                a = 3;
                return a;
            } else {
                System.out.println("ingrese una opcion valida");
            }

        }

    }
private int escoger5 (String b, String c, String d,String e,String h) {
        int a;
        String opcion;
        System.out.println("escoge uno **********************************");
        while (true) {
            System.out.println("a. " + b);
            System.out.println("b. " + c);
            System.out.println("c. " + d);
            System.out.println("d. "+ e);
            System.out.println("e. "+h);
            opcion = input.nextLine();
            if ("a".equals(opcion)) {
                a = 1;
                return a;
            } else if ("b".equals(opcion)) {
                a = 2;
                return a;
            } else if ("c".equals(opcion)) {
                a = 3;
                return a;
            } 
            else if ("d".equals(opcion)) {
                a = 4;
                return a;
            }
            else if ("e".equals(opcion)) {
                a = 5;
                return a;
            }else {
                System.out.println("ingrese una opcion valida");
            }
         
        }
        
}
    }

