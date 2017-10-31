import javax.swing.*;
import java.awt.*;
public class FontViewerApp
{
	public static void main(String [] args)
	{
		FontViewerFrame f1=new FontViewerFrame();
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f1.setExtendedState(f1.getExtendedState()|JFrame.MAXIMIZED_BOTH);
		/*for(int i=0;i<1000;i++)
		{
			System.out.println(f1.getSize());
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
			}
		}*/
	}
}
