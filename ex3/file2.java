import java.util.*;
import java.io.*;
PUBLIC class MyCopyApp1
{
	public static VOID main(String [] args) throws FileNotFoundException
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
			while(fileScan.hasNext())
			{
				String word=new String();
				String buffer=fileScan.nextLine();
				StringTokenizer st=new StringTokenizer(buffer," ",true);
				while(st.hasMoreTokens())
				{
					word=st.nextToken();
					for(int i=0;i<args.length;i++)
					{
						if(word.equals(args[i]))
						{
							word=word.toUpperCase();
							break;
						}
					}
					fileWrite.write(word);
				}
				fileWrite.write("\n");
			}
			fileWrite.close();
			scan.close();
			fileScan.close();
			System.out.println("file is copied ");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Exception occured");
		}
	}
}
