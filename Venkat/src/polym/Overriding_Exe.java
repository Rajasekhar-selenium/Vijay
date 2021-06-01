package polym;

public class Overriding_Exe extends Overriding
{
	public void add()
	{
		int i = 1000; int j = 2000; 
		
		int c = i+j; 
		
		System.out.println(c);
	}
	
	public void sub()
	{
		System.out.println("methods will over ride and execute only child methods if parent child have same method names");
	}
	
	public static void main(String[] args) 
	{
		Overriding_Exe obj = new Overriding_Exe();
		
		obj.add();
		
		obj.add();
		
		obj.sub();
		
		obj.sub();
		
	}
	
	

}
