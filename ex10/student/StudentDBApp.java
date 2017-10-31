import javax.swing.*;
import java.awt.*;
public class StudentDBApp
{
	public static void main(String [] args)
	{
		StudentDBFrame f1=new StudentDBFrame();
		f1.setSize(600,450);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//f1.setExtendedState(f1.getExtendedState()|JFrame.MAXIMIZED_BOTH);
	}
}
