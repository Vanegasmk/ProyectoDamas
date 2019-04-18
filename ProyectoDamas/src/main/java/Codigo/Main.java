package Codigo;

public class Main {
        public static void main(String[] args) {
            Tablero Tablero = new Tablero();
            int x = 1;
            while (true) {                
                if (x == 1){
                    Tablero.dibujarTablero();
                    int filaVieja = com.utn.utilitarios.Utilitarios.capturaValorEntero("Digite la fila vieja");
                    int columnaVieja = com.utn.utilitarios.Utilitarios.capturaValorEntero("Digite la columna vieja");
                    int filaNueva = com.utn.utilitarios.Utilitarios.capturaValorEntero("Digite la fila nueva");
                    int columnaNueva = com.utn.utilitarios.Utilitarios.capturaValorEntero("Digite la columna vieja");
                    System.out.println(Tablero.moverDama(filaVieja,columnaVieja,filaNueva,columnaNueva,1));
    
        
                }
                
                if (x == 1){
                    Tablero.dibujarTablero();
                    int filaVieja = com.utn.utilitarios.Utilitarios.capturaValorEntero("Digite la fila vieja");
                    int columnaVieja = com.utn.utilitarios.Utilitarios.capturaValorEntero("Digite la columna vieja");
                    int filaNueva = com.utn.utilitarios.Utilitarios.capturaValorEntero("Digite la fila nueva");
                    int columnaNueva = com.utn.utilitarios.Utilitarios.capturaValorEntero("Digite la columna vieja");
                    System.out.println(Tablero.moverDama(filaVieja,columnaVieja,filaNueva,columnaNueva,x + 1));
    
        
                }
            
            
            
            
            
            
            }
            
            
            
            
            
            
            
            
            
    
        
        
        
        
        
        
        
        
        
    }
}
