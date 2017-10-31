import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;
import javax.imageio.ImageIO;
import java.io.File;
public class PaintFrame extends JFrame
{
	PaintComponent cmp;
	public PaintFrame()
	{
		setVisible(true);
		setTitle(" Paint ");
		setLocation(0,0);
		try {
			setIconImage(ImageIO.read(new File("paintIcon.jpg")));
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension dim=kit.getScreenSize();
		setPreferredSize(dim);
		cmp=new PaintComponent();
		add(cmp);
	}
}