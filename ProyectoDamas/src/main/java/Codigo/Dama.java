package Codigo;
public class Dama {
    private boolean color;
    
    public Dama(boolean pColor){
        this.color = pColor;
    }
    
    public boolean getColor(){
        return color;
    }
    
    public String colorDama(){
        String alerta;
        if (color == true){
            alerta = "O";
        }else{
            alerta = "X";
        }
        return alerta;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
