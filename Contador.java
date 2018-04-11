/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_clock;

/**
 *
 * @author Vitor Augusto Mendes Monteiro
 */

public class Contador {
    
    private int mostrador;
    
    public Contador(){
        this.mostrador=0;
    }
    
    public void Contar(){
        mostrador=(mostrador+1)%100;
    }
    
    public void setMostrador(int valor){
        this.mostrador=valor;
    }
    
    public int getMostrador(){
        return this.mostrador;
    }
}
