/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

/**
 *
 * @author Mery Acevedo
 */
public class CuartelCentral {
    private int vida=2000;
    private int recurso1=1000;
    private int recurso2=500;
    private int recurso3=300;
    private int maxrecurso1=10000;
    private int maxrecurso2=5000;
    private int maxrecurso3=3000;
    private int nivel=0;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(int recurso1) {
        this.recurso1 = recurso1;
    }

    public int getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(int recurso2) {
        this.recurso2 = recurso2;
    }

    public int getRecurso3() {
        return recurso3;
    }

    public void setRecurso3(int recurso3) {
        this.recurso3 = recurso3;
    }
    
    public void aumentarcapacidad(int a){
        this.maxrecurso1+=(this.maxrecurso1/100)*a;
        this.maxrecurso2+=(this.maxrecurso2/100)*a;
        this.maxrecurso3+=(this.maxrecurso3/100)*a;
    }
    
    public void comprarmejora(){
        switch (this.nivel) {
            case 0:
                {
                    int a=(((this.maxrecurso1/100)*10)+this.maxrecurso1)+(((this.maxrecurso2/100)*10)+this.maxrecurso2)+(((this.maxrecurso3/100)*10)+this.maxrecurso3);
                    a = a/3;
                    break;
                }
            case 1:
                {  
                    int a=(((this.maxrecurso1/100)*30)+this.maxrecurso1)+(((this.maxrecurso2/100)*30)+this.maxrecurso2)+(((this.maxrecurso3/100)*30)+this.maxrecurso3);
                    a = a/3;
                    break;
                }
            default:
                {
                    int a=(((this.maxrecurso1/100)*50)+this.maxrecurso1)+(((this.maxrecurso2/100)*50)+this.maxrecurso2)+(((this.maxrecurso3/100)*50)+this.maxrecurso3);
                    a = a/3;
                    break;
                }
        }
    }
    
    
    
}
