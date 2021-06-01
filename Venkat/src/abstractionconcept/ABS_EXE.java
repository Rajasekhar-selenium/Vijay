package abstractionconcept;

public  class ABS_EXE extends ABS
{

	@Override
	public void water() 
	{
		System.out.println("20 lorry");
	}

	@Override
	public void cement() 
    {
		System.out.println("10 cement");
	}
	
	public static void main(String[] args) 
	{
		ABS_EXE  a = new ABS_EXE();
		
		a.land();
		
		a.water();
		
		a.cement();
		
		
	}
	

}
