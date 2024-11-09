package providers;

import sim.SIM;

public class Idea implements SIM {

	@Override
	public void call() 
	{
		System.out.println("Calling using Idea SIM");
	}

	@Override
	public void sms() 
	{
		System.out.println("Messaging using Idea SIM");

	}
}
