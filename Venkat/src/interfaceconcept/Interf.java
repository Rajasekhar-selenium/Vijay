package interfaceconcept;

public class Interf implements Inter
{

	@Override
	public void gears() 
	{
		System.out.println("5 gears");
	}

	@Override
	public void color() 
    {
		System.out.println("black");
	}

	@Override
	public void millage()
    {
		System.out.println("60 kmph");
	}
	
	public static void main(String[] args) 
	{
		
		Interf a = new Interf();
		
		a.color();
		
		a.millage();
		
		a.gears();
		
	}
}
