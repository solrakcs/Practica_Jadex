public class Arma extends Carta {
        private boolean AbrePuerta;
        private int Dados;
        private int Daño;
        private int Distancia;
        private int NumeroMin;
        private boolean Ruido;

        public Arma() {}

public Arma (Boolean abrePuerta, int dados, int daño, int distancia, int numeroMin, boolean Ruido) {
            this.AbrePuerta = abrePuerta;
            this.Dados = dados;
            this.Daño = daño;
            this.Distancia = distancia;
            this.NumeroMin = numeroMin;
            this.Ruido = ruido;
        }


        public void setAbrePuerta (Boolean x) {
            this.AbrePuerta = x;
          }

        public void setDados (int d) {
            this.Dados = d;
          }

        public void setDistancia (int dist) {
            this.Distancia = dist;
          }

        public void setNumeroMin (int n) {
            this.NumeroMin = n;
          }

        public void setRuido (int r) {
            this.Ruido = r;
          }

        public boolean getAbrePuerta () {
          return this.AbrePuerta;
          }

        public int getDados () {
          return this.Dados;
          }

        public int getDaño () {
          return this.Daño;
          }

        public int getDistancia () {
          return this.Distancia;
          }

        public int getNumeroMin () {
          return this.NumeroMin;
          }

        public boolean getRuido () {
          return this.Ruido;
          }

}
