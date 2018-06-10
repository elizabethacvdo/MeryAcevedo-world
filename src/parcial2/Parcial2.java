
package parcial2;

import Raza1.RAZA1;
import algo.Ejercito;
import java.util.Scanner;


/**
 *
 * @author Mery Acevedo
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       AbstracfactoriRazas raza1=null;
       AbstracfactoriRazas raza2=null;
        int opcion11;
        System.out.println("iniciar partida");
        System.out.println("ingrese su nombre: ");
        String nombre1=input.nextLine();
        while(true){
        System.out.println("elija una raza: ");
        System.out.println("a. raza1");
        System.out.println("b. raza2");
        System.out.println("c. raza3");
        String opcion1=input.nextLine();
        if("a".equals(opcion1)){
            opcion11=1;
            break;
        }else if("b".equals(opcion1)){
            opcion11=2;
            break;
        }else if("c".equals(opcion1)){
            opcion11=3;
            break;
        }else{
            System.out.println("ingrese una opcion valida");
        }
        }
        
        Jugador1 j=new Jugador1.UserJugador1(nombre1).raza(raza1=ProducerRazas.getrazas(opcion11)).jugador1();
        while(true){
            System.out.println("escoja una opcion: ");
            System.out.println("a. milicia");
            System.out.println("b. edificaciones");
            System.out.println("c. vehiculos");
            String opcion1=input.nextLine();
        if("a".equals(opcion1)){
            opcion11=1;
            RAZA1 milicia=j.getRaza().getraza1(opcion11);
            //milicia.
            System.out.println("que deseea hacer");
            break;
        }else if("b".equals(opcion1)){
            opcion11=2;
            break;
        }else if("c".equals(opcion1)){
            opcion11=3;
            break;
        }else{
            System.out.println("ingrese una opcion valida");
        }
        
        }
        Ejercito e;
        RAZA1 milicia;
        milicia=(RAZA1) j.getRaza().getraza1(1);
        e =(Ejercito) milicia.crear(1);
        e.imprimir();
        
        Jugador2 j2=new Jugador2("ola",raza1=ProducerRazas.getrazas(1));
        
    }
    
}
