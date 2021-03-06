/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package toturial;

/**
 *
 * @author Zagadka
 */
import jade.core.Agent; 
import jade.lang.acl.ACLMessage; 
import jade.lang.acl.MessageTemplate; 
import jade.core.behaviours.SimpleBehaviour; 
 
public class ResponderBehaviour extends SimpleBehaviour { 
 
private static final MessageTemplate mt = 
MessageTemplate.MatchPerformative(ACLMessage.REQUEST); 
 
  public ResponderBehaviour(Agent agent) { 
    super(agent); 
  } 
 
  public void action() { 
    ACLMessage aclMessage = myAgent.receive(mt); 
     
    if (aclMessage!=null) { 
        System.out.println(myAgent.getLocalName()+": I receive message.\n"+aclMessage.getContent()); 
    } else { 
        this.block(); 
      }    
  } 
 
  public boolean done() { 
    return false; 
  } 
} 
