package Customer;

import device.Mobile;
import providers.Idea;

public class Customer {

	public static void main(String[] args) 
	{
		Mobile mobile=new Mobile();
		mobile.insertSIM(new Idea());
	}

}
