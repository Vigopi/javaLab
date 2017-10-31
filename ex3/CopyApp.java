import java.util.*;
import java.io.*;
public class CopyApp
{
	public static void main(String [] args) throws FileNotFoundException
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter source file name : ");
		String source=scan.next();
		System.out.println("Enter destination file name : ");
		String destination=scan.next();
		try
		{
			File sourceFile=new File(source);
			Scanner fileScan=new Scanner(sourceFile);
			File destinationFile=new File(destination);
			PrintWriter fileWrite=new PrintWriter(destinationFile);
			int lineCount=0;
			while(fileScan.hasNext())
			{
				String buffer=fileScan.next();
					fileWrite.write(buffer);
				fileWrite.write("\n");
			}
			fileWrite.close();
			System.out.println("file is copied ");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception occured");
		}
	}
}
