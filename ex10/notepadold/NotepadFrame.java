import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import javax.imageio.ImageIO;
import java.io.File;
public class NotepadFrame extends JFrame
{
	NotepadFrame()
	{
		setVisible(true);
		setSize(1000,700);
		setResizable(true);
		setTitle("Notepad");
		try {
			setIconImage(ImageIO.read(new File("E:\\EducationDrive\\SemFive\\Java\\java lab\\ex9\\FontViewer\\icon.png")));
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}