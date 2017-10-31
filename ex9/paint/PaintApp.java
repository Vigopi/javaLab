import javax.swing.*;
import java.awt.*;
public class PaintApp
{
	public static void main(String [] args)
	{
		PaintFrame f1=new PaintFrame();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setExtendedState(f1.getExtendedState()|JFrame.MAXIMIZED_BOTH);
	}
}