import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
public class ScreenSaverFrame extends JFrame
{
	ScreenSaverComponent cmp;
	ScreenSaverFrame()
	{
		setVisible(true);
		setTitle(" Screen Saver ");
		setLocation(0,0);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension dim=kit.getScreenSize();
		//setPreferredSize(dim);
		setSize((int)dim.getWidth(),(int)dim.getHeight());
		try {
			setIconImage(ImageIO.read(new File("icon.jpg")));
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		//setLocationByPlatform(true);
		//Image img=kit.getImage("E:\\Images\626.jpg");
		//setIconImage(img);
		cmp=new ScreenSaverComponent();
		add(cmp);
	}
}