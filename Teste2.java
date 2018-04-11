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
import java.util.Scanner;

public class Teste2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Relogio A=new Relogio();
        Scanner input=new Scanner(System.in);
        
        System.out.println(" Qual o formato da hora? ( 1 = 24h  |  0 = 12a.m./12p.m.): ");
        double aux=input.nextDouble();
        if(aux==0){
            A.setFormato(false);
        }
        
        System.out.println("");
        
        for(int i=0; i<1440; i++){
                System.out.println(""+A.Exibir());
                A.TicTac();
            }
        System.out.println("");
    }
}

/*
        if(A.getFormato()==true){
            for(int i=0; i<1440; i++){
                System.out.println(""+A.Exibir()+"\n");
            }
        }
        else{
            for(int j=0; j<1440; j++){
                System.out.println(""+A.Exibir()+"\n");
            }
        }
        */
