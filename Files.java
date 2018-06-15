import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class Files {

	public static void main(String[] args) throws IOException
	{
	
    File obj=new File("D:\\Acdview\\xyz.txt");
    FileReader in=null;
    try 
    {
    	int x;
    	in=new FileReader(obj);
    	while((x=in.read())!=-1) 
    	{
		   System.out.print((char)x);

    	}

    }
    catch(Exception e) {
    	 System.out.println("Something wrong");
    }
    finally
    {
 	   		if(in!=null)
 	   in.close();
    }
    }
}