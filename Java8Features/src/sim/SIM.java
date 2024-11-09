package sim;

public interface SIM 
{
	public abstract void call();
	public abstract void sms();
	public default void video() {System.out.println("Video calling not available in this network");}
}
