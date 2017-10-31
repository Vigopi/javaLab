import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Random;
public class ScreenSaverComponent extends JComponent
{
	GraphicsEnvironment local;
	Random rand;
	String []fonts;
	String font;
	Font f1;
	Color c1;
	Toolkit kit;
	Dimension dim;
	Graphics2D g2d;
	int r,g,b;
	int x,y,a,c;
	ScreenSaverComponent()
	{
		rand=new Random();
		local=GraphicsEnvironment.getLocalGraphicsEnvironment();
		fonts=local.getAvailableFontFamilyNames();
		kit=Toolkit.getDefaultToolkit();
		dim=kit.getScreenSize();
	}
	public void setRandomXY()
	{
		x=rand.nextInt((int)dim.getWidth()-20);
		y=rand.nextInt((int)dim.getHeight()-20);
	}
	public void setRandomFont()
	{
		font=fonts[rand.nextInt(fonts.length)];
		f1=new Font(font,Font.BOLD,rand.nextInt(50)+30);
		g2d.setFont(f1);
	}
	public void setRandomColor()
	{
		r=rand.nextInt(255);
		g=rand.nextInt(255);
		b=rand.nextInt(255);
		c1=new Color(r,g,b);
		g2d.setColor(c1);
	}
	public void setRandomAC()
	{
		a=rand.nextInt(500);
		c=rand.nextInt(500);
	}
	public void drawRandomRectangle(Graphics2D g2d)
	{
		setRandomAC();
		setRandomXY();
		setRandomColor();
		Rectangle2D.Float rect=new Rectangle2D.Float(x,y,a,c);
		g2d.fill(rect);
		g2d.draw(rect);
	}
	public void drawRandomEllipse(Graphics2D g2d)
	{
		setRandomColor();
		setRandomXY();
		setRandomAC();
		Ellipse2D.Float ellipse=new Ellipse2D.Float(x,y,a,c);
		g2d.fill(ellipse);
		g2d.draw(ellipse);
	}
	public void drawRandomString(Graphics2D g2d,String str)
	{
		setRandomColor();
		setRandomFont();
		setRandomXY();
		g2d.drawString(str,x,y);
	}
	@Override
	public void paintComponent(Graphics grp)
	{
		g2d=(Graphics2D)grp;
		drawRandomString(g2d,"G.VINOTHGOPI");
		drawRandomEllipse(g2d);
		drawRandomRectangle(g2d);
		try
		{
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
		repaint();
	}
}