import jadex.runtime.IMessageEvent;
import jadex.runtime.Plan;
import jadex.runtime.IGoal;
import jadex.runtime.IBelief;
import ontology.actions.BeberCerveza;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;
import jadex.adapter.fipa.AgentDescription;
import jadex.adapter.fipa.SearchConstraints;
import jadex.adapter.fipa.ServiceDescription;
import java.util.Random;

public class IniciarTurno{
  public body(){

    System.out.println ("Toca cambiar de turno")
    //Hemos acabado el turno que se estaba realizando
    //buscamos en el DF al survivor
    ServiceDescription sd = new ServiceDescription();
    sd.setType("Registrarse");
    sd.setName("Survivor")
    AgentDescription dfadesc = new AgentDescription();
    dfadesc.addService(sd);
    SearchConstraints	sc	= new SearchConstraints();
		sc.setMaxResults(1); //MIRAR LINEAS 24 Y 25
    IGoal ft = createGoal("df_search");
    ft.getParameter("description").setValue(dfadesc);
    ft.getParameter("constraints").setValue(sc);
    dispatchSubgoalAndWait(ft);
    System.out.println ("El tablero está buscando al jugador al que le toca actuar");
    AgentDescription[] result	= (AgentDescription[])ft.getParameterSet("result").getValues();
    Thread.sleep(1000);
    if (result.length>0){
      System.out.println ("El tablero comunica al jugador que es su turno");
      AgentIdentifier survivor = result[0].getName();
      IMessageEvent msgsend = createMessageEvent("InformarEstadoTablero");
      HayAcciones accion= new HayAcciones();
      msgsend.setContent(accion);
  		msgsend.getParameterSet(SFipa.RECEIVERS).addValue(survivor);
  		sendMessage(msgsend);
    } else{
        	System.out.println("survivor no encontrado");

    }
  }
}
