package w3sch;

public class validationtoget {
	
	public static void logoDisplay(boolean logo)
	{
		if(logo)
		{
			System.out.println("logo is display");
		}
		else
		{
			System.out.println("logo is not display");
		}
	}
	
	

	
	public static void valiadteAsSameOrNo(String ex,String act,String msg)
    {
    	if(ex.equals(act))
    	{
    		System.out.println(msg);
    	}
    	else
    	{
    		System.out.println(" not opend" + msg);
    	}
    }

	public static void clickp(boolean status)
	{
		if(status)
		{
			System.out.println("button click");
		}
		else
		{
			System.out.println("not click");
		}
		
	}

}
