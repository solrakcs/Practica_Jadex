package ontology.acciones;


import ontology.Accion;
import ontology.conceptos.zombies.*;

public class Atacar extends Accion{
    private Zombie a;
    public  Atacar(){}
    public Zombie getA() {
    return this.a;
    }
    public void setA(Zombie zombie){
    this.a = zombie}
  }
