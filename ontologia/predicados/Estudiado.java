/*
 * Curso 17/18
 * GIAA, UC3M
 */

package ontologia.predicados;

import onotologia.Predicate;
import ontologia.conceptos.Libro;

public class Estudiado implements Predicate {
    
private Libro que;

	  public Libro()
	  { ; }
	  
      public Libro getQue() {
           return que;
       }
       public void setQue(Libro book) {
           que=book;
       }
}