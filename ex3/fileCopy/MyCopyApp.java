import java.util.*;
import java.io.*;
public class MyCopyApp{
	public static void main(String []args) throws Exception {
			Scanner sin=new Scanner(System.in);
         System.out.print("Enter the File Names to Copy: ");
         File f1=new File(sin.next());
         File f2=new File(sin.next());
         Scanner fin = new Scanner(f1);
         PrintWriter pw = new PrintWriter(f2);
         while(fin.hasNext()){
           String x=fin.nextLine();
           for(int i=0;i<args.length;i++){
            x=x.replace(args[i],args[i].toUpperCase());
           }
           pw.println(x);
         }
         pw.close();
	}
}
