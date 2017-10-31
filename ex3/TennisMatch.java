import java.util.*;
import java.io.*;
import java.lang.*;
class TennisMatch
{
	public static void main(String[] z) throws Exception
	{
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter the input file name : ");
		File f1=new File(sin.next());
		Scanner fin=new Scanner(f1);
		StringTokenizer str=new StringTokenizer(fin.nextLine(),"$%");
		int n=Integer.parseInt(str.nextToken());
		int [][]a=new int[n][6];
		String[] name=new String[n];
		for(int i=0;i<name.length;i++)
			name[i]=str.nextToken();
		int first=0,second=0;
		int p1=0,p2=0;
		while(fin.hasNext())
		{   
	        String st=fin.nextLine();
			StringTokenizer strn=new StringTokenizer(st,":");
			String s=strn.nextToken();
			String s2=strn.nextToken();
			String s3=strn.nextToken();
			int count1=0,count2=0;
			for(int i=0;i<n;i++)
			{
				if(s.equals(name[i]))
					first=i;
				if(s2.equals(name[i]))
					second=i;
			}
			StringTokenizer str0=new StringTokenizer(s3,",");
			int x=str0.countTokens();
			if(x<4)
		    {
				StringTokenizer str1=new StringTokenizer(s3,"-,");
				for(int i=0;i<str0.countTokens();i++)
				{
				    p1=Integer.parseInt(str1.nextToken());
					p2=Integer.parseInt(str1.nextToken());
					a[first][3]=a[first][3]+p1; //gameswon
					a[first][5]=a[first][5]+p2; //gameslost
					a[second][3]=a[second][3]+p2;
					a[second][5]=a[second][5]+p1;
					if(p1<p2)
					  count2++;
				    else
					  count1++;
				}
				p1=0;
				p2=0;
				a[first][2]=a[first][2]+count1;//sets won
				a[second][2]=a[second][2]+count2;//sets won
				a[first][4]=a[first][4]+count2;//sets lost
				a[second][4]=a[second][4]+count1;//sets lost
				if(count1<count2)
					a[second][1]=a[second][1]+1; //matches won
				else
					a[first][1]=a[first][1]+1; //matches won
				count1=0;
				count2=0;
			}
			else
			{
				StringTokenizer str2=new StringTokenizer(s3,"-,");

				for(int i=0;i<str0.countTokens();i++)
				{
					p1=Integer.parseInt(str2.nextToken());
					p2=Integer.parseInt(str2.nextToken());
					a[first][3]=a[first][3]+p1; //gameswon
					a[first][5]=a[first][5]+p2; //gameslost
					a[second][3]=a[second][3]+p2;
					a[second][5]=a[second][5]+p1;
					if(p1<p2)
					  count2++;
				    else
					  count1++;
				}
				p1=0;
				p2=0;
				a[first][2]=a[first][2]+count1;//sets won
				a[second][2]=a[second][2]+count2;//sets won
				a[first][4]=a[first][4]+count2;//sets lost
				a[second][4]=a[second][4]+count1;//sets lost
				if(count1<count2)
					a[second][0]=a[second][0]+1;//matches won
				else
					a[first][0]=a[first][0]+1;//matches won
				count1=0;
				count2=0;
			}
		}
		System.out.println("\t\t**********************OUTPUT**********************\t\t");
		System.out.println("NAME\t      5 sets won  |  3 sets won  |  total sets won  |  total games won | total sets won | total games won");
		for(int i=0;i<n;i++)
			  System.out.println(name[i]+"\t\t"+a[i][0]+"\t"+a[i][1]+"\t"+a[i][2]+"\t"+a[i][3]+"\t"+a[i][4]+"\t"+a[i][5]);
	}
}
