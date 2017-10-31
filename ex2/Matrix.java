import java.util.Scanner;
import java.util.Arrays;
class Matrix
{
	public static void main(String []args)
	{
		int m, n, c, d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of matrix");
		m = in.nextInt();
		n  = in.nextInt();
		int [][]matrix = new int[m][n];
		for (  c = 0 ; c < m ; c++ )
			for ( d = 0 ; d < n ; d++ )
			{
				System.out.print("Enter the element "+c+" "+d+" : ");
				matrix[c][d] = in.nextInt();
			}
		System.out.println("\n");
		System.out.println("Matrix Display using deepToString ");
	  	System.out.println(Arrays.deepToString(matrix));
		System.out.println("\n");
		System.out.println("Matrix Display using for each loop ");
		System.out.println("\n");
		for(int []ele:matrix)
		{
			for(int ele1:ele)
				System.out.print(ele1);
			System.out.println("\n");
		}
		int []sum=new int[m];
		for (  c = 0 ; c < m ; c++ )
		{
			for ( d = 0 ; d < n ; d++ )
			{
				sum[c]=sum[c]+matrix[c][d];
			}
		}
		int maxIndex=0;
		for (  c = 1 ; c < m ; c++ )
		{
			if(sum[maxIndex]<sum[c])
			{
				maxIndex=c;
			}	
		}
		System.out.println("The row with maximum sum is row "+maxIndex+" with sum : "+sum[maxIndex]);
	}
}