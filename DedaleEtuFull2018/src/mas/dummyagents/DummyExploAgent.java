package mas.dummyagents;


import env.EntityType;
import env.Environment;

import mas.abstractAgent;
import mas.uselessbehaviours.RandomWalkBehaviour;


public class DummyExploAgent extends abstractAgent{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1784844593772918359L;



	/**
	 * This method is automatically called when "agent".start() is executed.
	 * Consider that Agent is launched for the first time. 
	 * 			1) set the agent attributes 
	 *	 		2) add the behaviours
	 *          
	 */
	protected void setup(){

		super.setup();

		//get the parameters given into the object[]. In the current case, the environment where the agent will evolve
		final Object[] args = getArguments();


		if(args!=null && args[0]!=null && args[1]!=null){
			//deployAgent((Environment) args[0]);
			deployAgent((Environment) args[0],(EntityType)args[1]);
		}else{
			System.err.println("Malfunction during parameter's loading of agent"+ this.getClass().getName());
			System.exit(-1);
		}

		//Add the behaviours
		addBehaviour(new RandomWalkBehaviour(this));
		//addBehaviour(new SayHello(this));

		System.out.println("the agent "+this.getLocalName()+ "of type"+ ((EntityType)args[1]).toString()+" is started");

	}

	/**
	 * This method is automatically called after doDelete()
	 */
	protected void takeDown(){

	}
}
