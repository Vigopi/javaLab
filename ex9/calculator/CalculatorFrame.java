import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.lang.String;
public class CalculatorFrame extends JFrame
{
	JPanel textPanel,buttonPanel,temp;
	JButton []button;
	JButton clearButton,backSpace;
	String []str;
	JTextField text;
	boolean flag=false;
	CalculatorFrame()
	{
		str=new String[]{"7","8","9","/",
					"4","5","6","*",
					"1","2","3","-",
					".","0","=","+"};
		button=new JButton[16];
		clearButton=new JButton("c");
		backSpace=new JButton("Backspace");
		setVisible(true);
		setTitle("Calculator");
		setLocation(0,0);
		setResizable(false);
		try {
			setIconImage(ImageIO.read(new File("E:\\EducationDrive\\SemFive\\Java\\java lab\\ex9\\calculator\\calculator.png")));
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		setSize(367,391);
		buttonPanel=new JPanel(new GridLayout(4,4));
		text=new JTextField(20);
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		text.setFont(font1);	
		text.setPreferredSize(new Dimension(30,60));
		text.setHorizontalAlignment(JTextField.RIGHT);
		textPanel=new JPanel(new GridLayout(2,1));
		textPanel.setPreferredSize(new Dimension(40,100));
		textPanel.add(text);
		temp=new JPanel(new GridLayout(1,2));
		temp.add(clearButton);
		temp.add(backSpace);
		textPanel.add(temp);
		add(textPanel,BorderLayout.NORTH);
		
		clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				text.setText("");
			}
		});
		backSpace.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				String txt=text.getText();
				if(txt.length()>0)
					text.setText(txt.substring(0,txt.length()-1));
			}
		});
		for(int i=0;i<button.length;i++)
		{
			final int j=i;
			temp=new JPanel(new GridLayout(1,1));
			button[i]=new JButton(str[i]);
			if(!str[i].equals("="))
			{
				button[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae)
				{
					if(flag) 
					{
					if(!str[j].equals("+") && !str[j].equals("-")&&!str[j].equals("*")&&!str[j].equals("/"))
						text.setText("");
					flag=false;
					}
				text.setText(text.getText()+str[j]);
				}
			});
			}
			else
			{
				button[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae)
				{
					String exp=text.getText();	
					text.setText(Double.toString(calculateExpression(exp)));
					flag=true;
				}
				});
			}
			temp.add(button[i]);
			buttonPanel.add(temp);
		}
		buttonPanel.setPreferredSize(new Dimension(100,300));
		add(buttonPanel,BorderLayout.CENTER);
	}
		public double calculateExpression(String exp)
	{
		Stack<Integer> op  = new Stack<Integer>();
		Stack<Double> val = new Stack<Double>();
		/* Create temporary stacks for operators and operands */
		Stack<Integer> optmp  = new Stack<Integer>();
		Stack<Double> valtmp = new Stack<Double>();
		/* Accept expression */
		String input = exp;
		input = "0" + input;
		input = input.replaceAll("-","+-");
		/* Store operands and operators in respective stacks */
		String temp = "";
		for (int i = 0;i < input.length();i++)
		{
			char ch = input.charAt(i);
			if (ch == '-')
				temp = "-" + temp;
			else if (ch != '+' &&  ch != '*' && ch != '/')
				temp = temp + ch;
			else
			{
				val.push(Double.parseDouble(temp));
				op.push((int)ch);
				temp = "";
			}
		}
		val.push(Double.parseDouble(temp));
		/* Create char array of operators as per precedence */
		/* -ve sign is already taken care of while storing */
		char operators[] = {'/','*','+'};
		/* Evaluation of expression */
		for (int i = 0; i < 3; i++)
		{
			boolean it = false;
			while (!op.isEmpty())
			{
				int optr = op.pop();			
				double v1 = val.pop();
				double v2 = val.pop();
				if (optr == operators[i])
				{
					/* if operator matches evaluate and store in temporary stack */
					if (i == 0)
					{
						valtmp.push(v2 / v1);
						it = true;
						break;
					}
					else if (i == 1)
					{
						valtmp.push(v2 * v1);
						it = true;
						break;
					}
					else if (i == 2)
					{
						valtmp.push(v2 + v1);
						it = true;
						break;
					}                                        
				}
				else
				{
					valtmp.push(v1);
					val.push(v2);
					optmp.push(optr);
				}                
			}    
			/* Push back all elements from temporary stacks to main stacks */            
			while (!valtmp.isEmpty())
				val.push(valtmp.pop());
			while (!optmp.isEmpty())
				op.push(optmp.pop());
			/* Iterate again for same operator */
			if (it)
				i--;                            
		}
		return val.pop();
	}
}