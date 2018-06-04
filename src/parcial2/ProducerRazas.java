
package parcial2;

import Raza1.ProducerRaza1;
import Raza2.ProducerRaza2;
import Raza3.ProducerRaza3;

/**
 *
 * @author Mery Acevedo
 */
public class ProducerRazas {
     
    public static AbstracfactoriRazas getrazas(int raza){
        switch(raza){
            case 1:
                return  new ProducerRaza1();
            case 2:
                return new ProducerRaza2();
            case 3:
                return new ProducerRaza3();
            default:
                return null;
        }
        
        
    }
}
