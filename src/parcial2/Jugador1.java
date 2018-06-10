
package parcial2;

import algo.Cuartels;

/**
 *
 * @author Mery Acevedo
 */
public class Jugador1 {
    private final String nombre;
    private final AbstracfactoriRazas raza;
    private Cuartels cuartel=new Cuartels();

    public Jugador1(UserJugador1 jugador1) {
        this.nombre=jugador1.nombre;
        this.raza=jugador1.raza;
    }
//--------------------------------------------------------------------------------
    public Cuartels getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartels cuartel) {
        this.cuartel = cuartel;
    }
    
   //------------------------------------------------------------------------------- 
    public  String getJugador1() {
        return nombre;
    }

    public AbstracfactoriRazas getRaza() {
        return raza;
    }
    
    
    
    public static class UserJugador1{
        private final String nombre;
        private AbstracfactoriRazas raza;

        public UserJugador1(String nombre) {
            this.nombre = nombre;
        }
        
        public UserJugador1 raza(AbstracfactoriRazas raza){
            this.raza=raza;
            return this;
        }
        
        public Jugador1 jugador1(){
            return new Jugador1(this);
        }
    }
   
    
    
}
