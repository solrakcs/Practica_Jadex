import jadex.runtime.*;
import ontology.predicates.*;
import jadex.adapter.fipa.AgentIdentifier;
import jadex.adapter.fipa.SFipa;

public class inicioTurno{
  public void body(){
    IMessageEvent msgrec = (IMessageEvent) getInitialEvent();
    HayAcciones predicado = (HayAcciones) msgrec.getContent();
    AgentIdentifier sender = (AgentIdentifier) msgrec.getParameter("sender").getValue();
 	int acciones = (int) getBeliefbase().getBelief("accionesRestantes").getFact();
    System.out.println("Jugador mirando posibles acciones");
		if (acciones>0)
		{
			getBeliefbase().getBelief("acciones").setFact(acciones-1);
			System.out.println("El jugador informa que tiene acciones disponibles");
			// comunicamos que si tenemos cervezas
			IMessageEvent msgsend = createMessageEvent("InformHayAccionesDisponiblesMsg");
			msgsend.setContent(predicado);
			msgsend.getParameterSet(SFipa.RECEIVERS).addValue(sender);
			sendMessage(msgsend);
		}
		else
		{
			// comunicamos que no nos quedan cervezas
			System.out.println("El jugador confirma que no tiene acciones disponibles");
			IMessageEvent msgsend = createMessageEvent("InformNoHayAccionesDisponiblesMsg");
			NoHayAcciones predicado2= new NoHayAcciones();
			msgsend.setContent(predicado2);
			msgsend.getParameterSet(SFipa.RECEIVERS).addValue(sender);
			sendMessage(msgsend);
		}
  }
}
