import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.*;
public class PaintComponent extends JComponent implements MouseMotionListener
{
	ArrayList <Point> plist;
	public PaintComponent()
	{
		addMouseMotionListener(this);
		plist=new ArrayList <Point>();
	}
	public void mouseDragged(MouseEvent me)
	{
		plist.add(me.getPoint());
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2d=(Graphics2D)g;
		Rectangle2D.Double rect;
		g2d.setColor(Color.BLACK);
		for(int i=0;i<plist.size();i++)
		{
			rect=new Rectangle2D.Double(plist.get(i).getX(),plist.get(i).getY(),5,5);
			g2d.fill(rect);
			g2d.draw(rect);
		}
	}
}