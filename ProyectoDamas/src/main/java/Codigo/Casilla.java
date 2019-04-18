package Codigo;

public class Casilla {
    private Dama dama;
    private int posicionFila;
    private int posicionColumna;
    
    public Casilla(Dama dama, int pPosicionFila, int pPosicionColumna){
        this.dama = dama;
        this.posicionFila = pPosicionFila;
        this.posicionColumna = pPosicionColumna;
    }
        
    public Dama getDama(){
        return this.dama;
    }
        
    public void setDama(Dama dama){
        this.dama = dama;
    }
        
    public String mirarCasilla(){
        String casilla;
        if (this.dama == null){
            if (this.posicionFila % 2 == this.posicionColumna % 2){
                casilla = " ■";
            }else{ 
                casilla = "   ";
            }
        }else{
            casilla = this.dama.colorDama();
        }
        return casilla;
    }



}



























