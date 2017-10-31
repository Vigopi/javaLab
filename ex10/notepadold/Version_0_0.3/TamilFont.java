
import java.awt.*;
import java.io.*;
import javax.swing.*;
public class TamilFont extends JApplet
{

public void init()
{
String rt="\u0B87\u0BB2\u0BCD\u0BB2\u0BC8";
Container cp=getContentPane();
cp.setLayout(new FlowLayout());
JLabel b=new JLabel();
b.setFont(new Font("Latha",Font.PLAIN,12));
b.setText(rt);
cp.add(b);
}

}
Hello