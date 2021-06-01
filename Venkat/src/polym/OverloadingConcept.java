package polym;

public class OverloadingConcept 
{
	public void sample()
	{
		System.out.println("This is over loading concept");
	}
	
	public void sample(int i)
	{
		System.out.println("Value of i is: "+i);
	}
	
	public void sample(String m)
	{
		System.out.println("Value of i is: "+m);
	}
	
	public void sample(String m, int i)
	{
		System.out.println("Value of i is: "+m+i);
	}
	
	public void sample(String m, String n)
	{
		System.out.println("Value of i is: "+m+" "+n);
	}
	
	public void sample(int i, int j)
	{
		System.out.println("Value of i is: "+(i+j));
	}
	
	public static void main(String[] args) 
	{
		
		OverloadingConcept a = new OverloadingConcept();
		
		a.sample();
		
		a.sample(1000);
		
		a.sample("Testing");
		
		a.sample(100, 100);
		
		a.sample("MindQ", 123);
		
		a.sample("HYd", "Madhapur");
	}


}
