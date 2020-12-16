public class Moverse extends Accion{
        private Casilla a;
        public Mover() { }
        public Casilla getCasillaFinal() {
        return this.a;
        }
        public void setCasillaFinal(Casilla casilla) {
            this.a = casilla;
        }
}
