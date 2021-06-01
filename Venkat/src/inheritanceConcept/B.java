package inheritanceConcept;

public class B extends A
{
	public void gold()
	{
		System.out.println("gold");
	}
	
	public void silver()
	{
		System.out.println("silver");
	}
	
	public void bronze()
	{
		System.out.println("bronze");
	}
	
	public static void main(String[] args) 
	{
		B b = new B();
		
		b.land();
		
		b.gold();
		
		b.house();
		
		b.car();
		
		b.silver();
		
		b.bronze();
		
		b.gold();
		
	}

}
