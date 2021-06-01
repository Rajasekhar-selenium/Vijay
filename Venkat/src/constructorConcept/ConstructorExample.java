package constructorConcept;

public class ConstructorExample 
{
	int i ; String n ;
	
	ConstructorExample(String n, int i)
	{
		System.out.println("Constructor example");
		
		this.i = i; 
		this.n = n;
	}
	
	public static void main(String[] args) 
	{
		
		ConstructorExample a = new ConstructorExample("hyd", 100);
		
		System.out.println(a.i);
		
		System.out.println(a.n);
	}

}
