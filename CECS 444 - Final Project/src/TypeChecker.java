import java.util.ArrayList;
import java.util.ListIterator;

public class TypeChecker 
{
	boolean endLoop = false;
	
	public TypeChecker()
	{
		
	}
	
	public void intChecker(ArrayList<String> input)
	{
		try
		{
			ListIterator<String> iterator = input.listIterator();
			String object;
			while(iterator.hasNext())
			{
				object = iterator.next();
				if (object.equals("int"))
				{
					object = iterator.next();
					if(object.equals("main()"))
					{
				
					}
					else
					{
						if(object instanceof String)
						{
							object = iterator.next();
							object = iterator.next();
							Integer.parseInt(object);
						}
					}
				}
			}
		}
		catch(NumberFormatException n)
		{
			System.out.println("Not a valid integer.");
		}
	}
	
	public void stringChecker(ArrayList<String> input)
	{
		try
		{
			ListIterator<String> iterator = input.listIterator();
			while(iterator.hasNext())
			{
				String object = iterator.next();
				if (object.equals("string"))
				{
					object = iterator.next();
					if(object instanceof String)
					{
						object = iterator.next();
						object = iterator.next();
					}
				}
			}
		}
		catch(NumberFormatException n)
		{
			System.out.println("Not a valid string.");
		}
	}
	
	public void doubleChecker(ArrayList<String> input)
	{
		try
		{
			ListIterator<String> iterator = input.listIterator();
			while(iterator.hasNext())
			{
				String object = iterator.next();
				if(object.equals("double"))
				{
					object = iterator.next();
					if(object instanceof String)
					{
						object = iterator.next();
						object = iterator.next();
						Double.parseDouble(object);
					}
				}
			}
		}
		catch(NumberFormatException n)
		{
			System.out.println("Not a valid double.");
		}
	}
	
	public void longChecker(ArrayList<String> input)
	{
		try
		{
			ListIterator<String> iterator = input.listIterator();
			while(iterator.hasNext())
			{
				String object = iterator.next();
				if(object.equals("long"))
				{
					object = iterator.next();
					if(object instanceof String)
					{
						object = iterator.next();
						object = iterator.next();
						Long.parseLong(object);
					}
				}
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Not a valid long number.");
		}
	}
	
	public void charChecker(ArrayList<String> input)
	{
		ListIterator<String> iterator = input.listIterator();
		while(iterator.hasNext())
		{
			String object = iterator.next();
			if(object.equals("char"))
			{
				object = iterator.next();
				if(object instanceof String)
				{
					object = iterator.next();
					object = iterator.next();
					if(object.toCharArray().length > 1)
					{
						System.out.println("Not a valid character.");
					}
				}
			}
		}
	}
	
	public void booleanChecker(ArrayList<String> input)
	{
		ListIterator<String> iterator = input.listIterator();
		while(iterator.hasNext())
		{
			String object = iterator.next();
			if(object.equals("boolean"))
			{
				object = iterator.next();
				if(object instanceof String)
				{
					object = iterator.next();
					object = iterator.next();
					if (object.equals("true") || object.equals("false"))
					{
						
					}
					else
					{
						System.out.println("Not a valid boolean value.");
					}
				}
			}
		}
	}
}
