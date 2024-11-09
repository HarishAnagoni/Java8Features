package lambda;

public class Test 
{
	public static int m1(int x,int y)
	{
		System.out.println(x+" m1 called "+y);
		return x+y;
	}
	public static void main(String[] args) 
	{
		I1 i3=(x,y)-> {int u=m1(x,y);System.out.println(u+2);};
		
		i3.addition(1250,1520);
	}
}
