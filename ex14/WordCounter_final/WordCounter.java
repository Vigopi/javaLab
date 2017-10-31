import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Vinothgopi
 */
public class WordCounter 
{
    /**
     * @param args the command line arguments
     */
		public static void main(String[] args) 
		{
        // TODO code application logic here
        HashSet <String> wordSet = null;
        String dirName;
        Scanner sin=new Scanner(System.in);
        System.out.print("\nEnter a directory name : ");
        dirName=sin.next();
        File dir=new File(dirName);
        if(dir.isDirectory())
        {
          File []files=dir.listFiles();
          ArrayList <HashMap<String,Integer>> maps=new ArrayList <HashMap<String,Integer>>();
          for(int i=0;i<files.length;i++)
          {
            try 
						{
              HashMap<String,Integer> map=new HashMap<String,Integer>();
              Scanner fin=new Scanner(files[i]);
              while(fin.hasNext())
              {
                String word=fin.next();
                if(map.containsKey(word))
                {
									Integer count=map.get(word)+1;
						//System.out.println("The count for "+word+" is "+count);
                       // map.replace(word,count);
									map.put(word,count);
                }
                else
                  map.put(word,1);
              }
							maps.add(map); 
            }   
            catch (FileNotFoundException ex) 
						{
              System.out.println("File not found");
						}
					}
					wordSet=new HashSet<String>();
          for(int j=0;j<maps.size();j++)
          {
            HashMap<String,Integer> map1=maps.get(j);
            Set <String> hs= map1.keySet();
            for(String str:hs)
							wordSet.add(str);
          }
					System.out.println("\n");
          //System.out.print(" | File name |\t");
          ArrayList <String>words=new ArrayList<String>();
          for(String str:wordSet)
          {
                //System.out.print(str+"\t");
                words.add(str);
          }
          System.out.println("\n\t");
          for(int i=0;i<files.length;i++)
          {
						System.out.print(files[i].getName()+"  ");
					}
					System.out.print("\n");
					for(int k=0;k<words.size();k++)
            {
							System.out.print(words.get(k)+"\t");
					for(int i=0;i<files.length;i++)
          {
						//System.out.print(" | "+files[i].getName()+" |\t");
            HashMap<String,Integer> map1=maps.get(i);
						
              Integer val=0;
              if(map1.containsKey(words.get(k)))
                val=map1.get(words.get(k));
              System.out.print(val+"\t");   
           }   
						System.out.println("\n"); 
          }      
					}			
				else
					System.out.println(dirName+" is not a directory name.\n"); 
	}
}