import java.util.Scanner;
import java.util.Arrays;
class Population
{
	public static void main(String []args)
	{
		int [][][]population;
		int noOfStates,noOfDistricts,noOfCities,noOfPeople;
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter the Total number of States : ");
		noOfStates=sin.nextInt();
		population=new int [noOfStates][][];
		int [][]district=new int[noOfStates][];
		for(int i=0;i<population.length;i++)
		{
			System.out.println("Enter the number of districts in state "+i+" : ");
			noOfDistricts=sin.nextInt();
			population[i]=new int[noOfDistricts][];
			district[i]=new int[noOfDistricts];
			for(int j=0;j<population[i].length;j++)
			{
				System.out.println("Enter the number of cities in state "+i+" district "+j+" : ");
				noOfCities=sin.nextInt();
				population[i][j]=new int[noOfCities];
				for(int k=0;k<population[i][j].length;k++)
				{
					System.out.println("Enter the population in state "+i+" district "+j+" City "+k+" : ");
					noOfPeople=sin.nextInt();
					population[i][j][k]=noOfPeople;
					district[i][j]=district[i][j]+noOfPeople;
				}
			}	
		}
		System.out.println(Arrays.deepToString(population));
		for(int i=0;i<population.length;i++)
		{
			//System.out.println("State : "+i);
			for(int j=0;j<population[i].length;j++)
			{
				//System.out.println("District : "+j);
				for(int k=0;k<population[i][j].length;k++)
				{
					System.out.println("State : "+i+" District : "+j+"City : "+k+" Population : "+population[i][j][k]);
				}
			}	
		}
		int []minimum=new int[noOfStates];
		for(int i=0;i<district.length;i++)
		{
			int min=district[i][0];
			int minindex=0;
			for(int j=1;j<district[i].length;j++)
			{
				if(min>district[i][j])
				{
					min=district[i][j];
					minindex=j;
				}
			}
			minimum[i]=min;
			System.out.println("District with minimum population for state "+i+" is District "+minindex+" with population "+minimum[i]);
		}
		//int []state=new int[noOfStates];
		for(int i=0;i<population.length;i++)
		{
			int state=0;
			for(int j=0;j<population[i].length;j++)
			{
				state=state+district[i][j];
			}
			System.out.println("State "+i+" population is "+state);	
		}
	}
}