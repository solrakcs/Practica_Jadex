public class Zombie {
    private int MaxAccionesTurno;
    private int Prioridad;
    private int PuntosExperiencia;
    private int Vida;

    public Zombie(){}

public void setMaxAccionesTurno(int max){
    this.MaxAccionesTurno = max;
}
public void setPrioridad(int prioridad){
    this.Prioridad = prioridad;
}
public void setPuntosExperiencia(int xp){
    this.PuntosExperiencia = xp;
}
public void setVida(int vida){
    this.Vida = vida;
}

public int getMaxAccionesTurno(){
    return this.MaxAccionesTurno;
}

public int getPrioridad(){
    return this.Prioridad;
}

public int getPuntosExperiencia(){
    return this.PuntosExperiencia;
}
public int getVida(){
    return this.Vida;
}


}
