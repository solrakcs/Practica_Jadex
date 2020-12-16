/*
 * Curso 17/18
 * GIAA, UC3M
 */

package ontologia.acciones;

import ontologia.conceptos.Libro;
import ontologia.Accion;

public class Estudiar implements Accion {
    
private Libro que;

		public Estudiar()
		{ ; }
      public Libro getQue() {
           return que;
       }
       public void setQue(Libro l) {
           que=l;
       }
}