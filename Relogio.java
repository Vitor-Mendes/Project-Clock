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

public class Relogio {
    
    private Contador h=new Contador();
    private Contador min=new Contador();
    private boolean formato;
    
    public Relogio(){
        this.formato=true;
    }
    
    public void setFormato(boolean bin){
        this.formato=bin;
    }
    
    public boolean getFormato(){
        return this.formato;
    }
    
    public void TicTac(){
        min.Contar();
        if(min.getMostrador()==60){
            h.Contar();
            min.setMostrador(0);
        }
        if(h.getMostrador()==24){
            h.setMostrador(0);
        }
    }
    
    public String Exibir(){
        
        if(formato==true){
            if(h.getMostrador()<10){
                if(min.getMostrador()<10){
                    return "0"+h.getMostrador()+":0"+min.getMostrador();
                }
                return "0"+h.getMostrador()+":"+min.getMostrador();
            }
            
            if(min.getMostrador()<10){
                return h.getMostrador()+":0"+min.getMostrador();
            }
            
            return h.getMostrador()+":"+min.getMostrador();
        }
        
        else{
            if(h.getMostrador()<12){
                
                if(h.getMostrador()==0){
                    if(min.getMostrador()<10){
                        return "12:0"+min.getMostrador()+" a.m.";
                    }
                    return "12:"+min.getMostrador()+" a.m.";
                }
                
                if(h.getMostrador()<10){
                    if(min.getMostrador()<10){
                        return "0"+h.getMostrador()+":0"+min.getMostrador()+" a.m.";
                    }
                    return "0"+h.getMostrador()+":"+min.getMostrador()+" a.m.";
                }
                
                if(min.getMostrador()<10){
                    return h.getMostrador()+":0"+min.getMostrador()+" a.m.";
                }

                return h.getMostrador()+":"+min.getMostrador()+" a.m.";
            }
            
            if(h.getMostrador()==12){
                if(min.getMostrador()<10){
                    return h.getMostrador()+":0"+min.getMostrador()+" p.m.";
                }
                return h.getMostrador()+":"+min.getMostrador()+" p.m.";
            }
            
            if(h.getMostrador()>12){
                if((h.getMostrador()-12)<10){
                    if(min.getMostrador()<10){
                        return "0"+(h.getMostrador()-12)+":0"+min.getMostrador()+" p.m.";
                    }
                    return "0"+(h.getMostrador()-12)+":"+min.getMostrador()+" p.m.";
                }
                
                if(min.getMostrador()<10){
                return (h.getMostrador()-12)+":0"+min.getMostrador()+" p.m.";
            }
                
                return (h.getMostrador()-12)+":"+min.getMostrador()+" p.m.";
            } 
        }
        return "teste";
    }
}

//return h.getMostrador()+":"+min.getMostrador()+"a.m.";

//return h.getMostrador()+":"+min.getMostrador()+"p.m.";