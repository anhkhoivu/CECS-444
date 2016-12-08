import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileInputStream in = null;
	    FileOutputStream out = null;
	    Scanner fileInput = new Scanner(new File("444demo.txt"));
	    ArrayList<String> program = new ArrayList<String>();
	    String s;
	    
	    TypeChecker tc;
	     
	    try
	    {
	    	in = new FileInputStream("444demo.txt");
	    	out = new FileOutputStream("output.txt");
	    	tc = new TypeChecker();
	    	
	    	int c;
	    	while((c = in.read()) != -1)
	    	{
	    		out.write(c);
	    		if (fileInput.hasNext())
	    		{
		    		s = fileInput.next();
		    		program.add(s);
	    		}
	    	}
	    	
	    	tc.intChecker(program);
	    	tc.booleanChecker(program);
	    	tc.charChecker(program);
	    	tc.doubleChecker(program);
	    	tc.longChecker(program);
	    	tc.stringChecker(program);
	    }
	    catch(NoSuchElementException n)
	    {
	    	System.err.println("Element does not exist.");
	    }
	    finally
	    {
	    	if(in != null)
	    	{
	    		in.close();
	    		fileInput.close();
	    	}
	    	if(out != null)
	    	{
	    		out.close();
	    		fileInput.close();
	    	}
	    }
	}
}