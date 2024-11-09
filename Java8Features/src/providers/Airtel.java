package providers;
import sim.SIM;
public class Airtel implements SIM 
{
	@Override
	public void call() 
	{
		System.out.println("Calling using Airtel SIM");
	}

	@Override
	public void sms() 
	{
		System.out.println("Messaging using Airtel SIM");
	}

	@Override
	public void video() 
	{
		System.out.println("VideoCalling using Airtel SIM");	
	}
}
