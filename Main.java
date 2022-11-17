import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		iPad apple=new iPad("iPad Air");
		iPad specs=new iPad("12MP Ultra Wide front camera");
	
		System.out.println(apple.getModel() + " " +  specs.getModel());

	}
}

