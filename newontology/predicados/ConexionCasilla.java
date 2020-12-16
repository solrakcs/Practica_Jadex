public class ConexionCasilla{
        private Casilla casilla1;
        private Casilla casilla2;
        private boolean traspasable;

        public ConexionCasilla(){}

        public ConexionCasilla(Casilla casilla1, Casilla casilla2, boolean traspasable){
            this.casilla1 = casilla1;
            this.casilla2 = casilla2;
            this.traspasable = traspasable;
        }

        public void setCasilla1(Casilla casilla) {
            this.casilla1 = casilla;
          }
        public void setCasilla2(Casilla casilla) {
            this.casilla2 = casilla;
          }
        public Casilla getCasilla1() {
            return this.casilla1;
          }
        public Casilla getCasilla2() {
            return this.casilla2;
          }
        public void settraspasable(boolean traspasable) {
            this.traspasable = traspasable;
          }
        public boolean getTraspasable(){
            return this.traspasable;
          }

}
