package basics;

public class First 
{
	
	public int i  = 1; 
	public String str = "testing";

	
	
	public void test()
	{
		System.out.println("This is a First class");
	}
	
	
	public static void main(String[] args) 
	{
		First obj = new First();
		
		obj.test();
		
		System.out.println("Value of i is:"+" "+obj.i);
		
		System.out.println("Value of str is: "+obj.str);
		
	}
	
	
	
}
