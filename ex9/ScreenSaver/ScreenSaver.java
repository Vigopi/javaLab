import javax.swing.*;
import java.awt.*;
public class ScreenSaver
{
	public static void main(String []args)
	{
		ScreenSaverFrame f1=new ScreenSaverFrame();
		//setPreferredSize(dim);
		//f1.setSize(dim.getWidth(),dim.getHeight());
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setExtendedState(f1.getExtendedState()|JFrame.MAXIMIZED_BOTH);
	}
}