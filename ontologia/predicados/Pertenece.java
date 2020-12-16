/*
 * Curso 17/18
 * GIAA, UC3M
 */

package ontologia.predicados;

import ontologia.Predicado;
import ontologia.conceptos.Universidad;
import ontologia.conceptos.Profesor;

public class Pertenece implements Predicado {
    
private Universidad a;
private Profesor quien;

	  public Pertenece()
	  { ; }
      public Universidad getA() {
           return a;
       }
       public void setA(Universidad u) {
           a=u;
       }
      public Profesor getQuien() {
           return quien;
       }
       public void setQuien(Profesor p) {
           quien=p;
       }
}