package device;
import sim.SIM;
public class Mobile 
{
	public void insertSIM(SIM sim)
	{
		sim.call();
		sim.sms();
		sim.video();
	}
}
