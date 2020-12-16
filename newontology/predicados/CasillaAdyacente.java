public class CasillaAdyacente{
    private Casilla casilla1;
    private Casilla casilla2;

    public CasillaAdyacente () {}

    public CasillaAdyacente(Casilla casilla1, Casilla casilla2){
        this.casilla1 = casilla1;
        this.casilla2 = casilla2;
    }

    public void setCasilla1(Casilla casilla){
      this.casilla1 = casilla;
    }

    public void setCasilla2(Casilla casilla) {
      this.casilla2 = casilla;
    }
    public Casilla getCasilla1(){
      return this.casilla1;
    }
    public Casilla getCasilla2(){
      return this.casilla2;
    }
}
