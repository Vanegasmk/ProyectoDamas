package Codigo;
public class Tablero {
    private Casilla Mesa[][];
    

    public Tablero(){
        this.Mesa = new Casilla[8][8];
        for (int f = 0; f < this.Mesa.length; f++){
            for (int c = 0; c < this.Mesa.length; c++){
                this.Mesa[f][c] = new Casilla(null,f,c);
            }
        }
        imprimirDamas();
    }


    public void imprimirDamas(){
        for (int i = 0; i < this.Mesa.length; i++) {
            if (i % 2 == 0) {
                this.Mesa[0][i].setDama(new Dama(true));
                this.Mesa[2][i].setDama(new Dama(true));
            } else {
                this.Mesa[1][i].setDama(new Dama(true));
            }


            if (i % 2 == 0) {
                this.Mesa[6][i].setDama(new Dama(false));
            } else {
                this.Mesa[5][i].setDama(new Dama(false));
                this.Mesa[7][i].setDama(new Dama(false));
            }


        }
    }


    public void dibujarTablero(){
         for (int f = 0; f < this.Mesa.length; f++) {
            for (int c = 0; c < this.Mesa.length; c++) {
                System.out.print(this.Mesa[f][c].mirarCasilla());
            }
            System.out.println();
        }
    }

    
    public String moverDama(int pFilaV, int pColumnaV, int pFilaN, int pColumnaN, int pJugador) {
        String alerta = "";
        Dama vieja = this.Mesa[pFilaV][pColumnaV].getDama();
        
        Dama mov1Jugador1 = this.Mesa[pFilaV - 1][pColumnaV + 1].getDama();
        Dama mov2Jugador1 = this.Mesa[pFilaV - 1][pColumnaV - 1].getDama();
        
        Dama mov1Jugador2 = this.Mesa[pFilaV + 1][pColumnaV - 1].getDama();
        Dama mov2Jugador2 = this.Mesa[pFilaV + 1][pColumnaV - 1].getDama();
        
        Dama movJugador = this.Mesa[pFilaN][pColumnaN].getDama();
        
        if ((vieja != null) && (pJugador == 1)){
            if ((pFilaN < pFilaV)&& (pColumnaN >= 0) && (pColumnaN <= 7)) {
                if ((movJugador == mov1Jugador1) || (movJugador == mov2Jugador1)){
                    this.Mesa[pFilaV][pColumnaV].setDama(null);
                    this.Mesa[pFilaN][pColumnaN].setDama(vieja);
                    dibujarTablero();
                    alerta = "Se hizo la jugada correcta";  
                }else{
                    dibujarTablero();
                    alerta = "No se pudo realizar la jugada, pierde turno";
                }
            }
        }
        
        if ((vieja != null) && (pJugador != 1)) {
            if ((pFilaN < pFilaV)&& (pColumnaN >= 0) && (pColumnaN <= 7)) {
                if ((movJugador == mov1Jugador2) || (movJugador == mov2Jugador2)){
                    this.Mesa[pFilaV][pColumnaV].setDama(null);
                    this.Mesa[pFilaN][pColumnaN].setDama(vieja);
                    alerta = "Se hizo la jugada correcta";
                    dibujarTablero();
                }else{
                    dibujarTablero();
                    alerta = "No se pudo realizar la jugada, pierde turno";
                }
            }
        }
        return alerta;
    }   
    




    


    


}


