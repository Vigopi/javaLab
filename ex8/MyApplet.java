import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=MyApplet width=400 height=400>
</applet>*/
public class MyApplet extends Applet implements ActionListener,ItemListener,TextListener,MouseListener
{
  double ans=0.0;
  Button b1;
  TextField t1,t2,t3;
  Label l1,l2,l3,l4,l5;
  CheckboxGroup cg;
  Checkbox cb1,cb2,cb3;
  Choice ch1,ch2;
  public void init()
  {
	  b1=new Button("Calculate");
	  l1=new Label("Currency Changer");
	  l2=new Label("Money ");
	  l3=new Label("Password ");
	  l4=new Label("Password is ");
	  l5=new Label("I agree the terms and conditions");
	  t1=new TextField(8);
	  t2=new TextField(8);
	  t3=new TextField(8);
	  cg=new CheckboxGroup();
	  cb1=new Checkbox("Red",false,cg);
	  cb2=new Checkbox("Green",false,cg);
	  cb3=new Checkbox("I agree terms and conditions");
	  ch1=new Choice();
	  ch1.add("Doller");
	  ch1.add("Euro");
	  ch1.add("Indian Rupee");
	  ch2=new Choice();
	  ch2.add("Doller");
	  ch2.add("Euro");
	  ch2.add("Indian Rupee");
	  t2.setEchoCharacter('#');
	  b1.setEnabled(false);
	  add(l1);
	  add(l2);
	  add(t1);
	  add(l3);
	  add(t2);
	  add(l4);
	  add(t3);
	  add(cb1);
	  add(cb2);
	  add(ch1);
	  add(ch2);
	  add(cb3);
	  add(b1);
	  b1.addActionListener(this);
	  cb1.addItemListener(this);
	  cb2.addItemListener(this);
	  cb3.addItemListener(this);
	  t2.addTextListener(this);
	  b1.addMouseListener(this);
  }
  public void paint(Graphics g)
  {
	  g.drawString("Your Answer is "+Double.toString(ans),100,300);
  }
  @Override
  public void actionPerformed(ActionEvent ae)
  {
	  if(!t1.getText().equals(""))
	  {
	  int a=Integer.parseInt(t1.getText());
	  if(ch1.getSelectedItem()!=ch2.getSelectedItem())
	  {
	  if(ch1.getSelectedItem()=="Doller")
	  {
		if(ch2.getSelectedItem()=="Indian Rupee")
		{
		  ans=a*63.94;
		}
		if(ch2.getSelectedItem()=="Euro")
		{
		  ans=a*0.83;
		}
	  }
	  if(ch1.getSelectedItem()=="Indian Rupee")
	  {
		if(ch2.getSelectedItem()=="Doller")
		{
		  ans=a*0.016;
		}
		if(ch2.getSelectedItem()=="Euro")
		{
		  ans=a*0.013;
		}
	  }
	  if(ch1.getSelectedItem()=="Euro")
	  {
		if(ch2.getSelectedItem()=="Doller")
		{
		  ans=a*1.20;
		}
		if(ch2.getSelectedItem()=="Indian Rupee")
		{
		  ans=a*76.94;
		}
	  }
	  }
	  else
	  {
		  ans=a;
		  System.out.println("Both currency are same");
	  }
	  repaint();
	  }
	  else
		  System.out.println("Please enter the amount");
	 
  }
  @Override
  public void itemStateChanged(ItemEvent ie)
  {
	  if(ie.getSource()==cb1)
		  setBackground(Color.RED);
	  if(ie.getSource()==cb2)
		  setBackground(Color.GREEN);
	  if(ie.getSource()==cb3)
	  {
		  if(cb3.getState())
			  b1.setEnabled(true);
		  else
			 b1.setEnabled(false); 
	  }
  }
  @Override
  public void textValueChanged(TextEvent te)
  {
	  t3.setText(t2.getText());
  }
  @Override
  public void mouseExited(MouseEvent me)
  {
	  b1.setBackground(Color.YELLOW);
  }
  @Override
  public void mouseEntered(MouseEvent me)
  {
	  b1.setBackground(Color.BLUE);
  }
  @Override
  public void mouseClicked(MouseEvent me)
  {
	  
  }
  @Override
  public void mousePressed(MouseEvent me)
  {
	  
  }
  @Override
  public void mouseReleased(MouseEvent me)
  {
	  
  }
}
