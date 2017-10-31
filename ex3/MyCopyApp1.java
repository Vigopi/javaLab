import java.util.*;
import java.io.*;
public class MyCopyApp1
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
				String word=new String();
				String buffer=fileScan.nextLine();
				lineCount++;
				StringTokenizer st=new StringTokenizer(buffer," ",true);
				String []str=buffer.split(" ");
				//while(st.hasMoreTokens())
				System.out.print("Line count : "+lineCount+"\t");
				for(int j=0;j<str.length;j++)
				{
					//word=st.nextToken();
					word=str[j];
					for(int i=0;i<args.length;i++)
					{
						if(word.equals(args[i]))
						{
							System.out.print(word+"\t"+args[i]+"\n");
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
