public class Survivor{
    private String name;
        private int Experiencia;
        private Carta[] mano = new Carta [2];
        private Carta[] mochila = new Carta[3];
        private int vida;

        public Survivor(){
          this.vida = 0;
          this.Experiencia = 0;
        }
        public Survivor(String name){
          this.vida = 0;
          this.Experiencia = 0;
          this.name = name;
        }
        public String getName(){return this.name;}
        public int getExperiencia(){return this.Experiencia;}
        public Carta[] getMano(){return this.mano;}
        public Carta[] getMochila(){return this.mochila;}
        public int getVida(){return this.vida;}
        public void setName(String name){this.name = name;}
        public void setExperiencia(int xp){this.Experiencia = xp;}
        public void setMano(Carta[] mano){this.mano = mano;}
        public void setMochila(Carta[] mochila){this.mochila = mochila;}
        public void setVida(int vida){this.vida = vida;}
}
