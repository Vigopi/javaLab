import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import javax.imageio.ImageIO;
import java.io.File;
public class StudentDBFrame extends JFrame
{
	String url = "jdbc:mysql://localhost:3306/student";
	String user = "root";
	String password = "admin123";
	Connection conn1 = null;
	JButton next,previous,first,last,selectButton1;
	JTabbedPane Tab;
	JPanel insertPanel,updatePanel,deletePanel,selectPanel,selectPanel1,p1,p2,p3;
	JTextField roll,name,year,department,roll1,name1,year1,department1,roll2,name2,year2,department2,roll3,name3,year3,department3,roll4,name4,year4,department4;
	JLabel rollLabel,nameLabel,yearLabel,departmentLabel,rollLabel1,nameLabel1,yearLabel1,departmentLabel1;
	JButton selectButton,insertButton,updateButton,deleteButton;
	JButton clearButton1,clearButton2,clearButton3,clearButton4,clearButton5;
	JPanel p10;
	JPanel p11,p12;
	ResultSet rs1;
	public void initialize()
	{
		setVisible(true);
		setSize(1000,700);
		setResizable(true);
		setTitle("Student Database");
		Tab=new JTabbedPane();
		
	}
	public void addSelectpanel()
	{
		selectPanel=new JPanel(new BorderLayout());
		rollLabel=new JLabel("Roll");
		nameLabel=new JLabel("Name");
		yearLabel=new JLabel("Year");
		departmentLabel=new JLabel("Department");
		roll=new JTextField(15);
		name=new JTextField(15);
		year=new JTextField(15);
		department=new JTextField(15);
		name.setEditable(false);
		year.setEditable(false);
		department.setEditable(false);
		selectButton=new JButton("Get Details");
		p1=new JPanel(new GridLayout(4,2));
		p10=new JPanel();
		p10.add(rollLabel);
		p1.add(p10);
		p10=new JPanel();
		p10.add(roll);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(nameLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(name);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(yearLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(year);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(departmentLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(department);
		p1.add(p10);
		
		clearButton1=new JButton("Clear All");
		p12=new JPanel();
		p12.add(selectButton);
		p12.add(clearButton1);
		selectPanel.add(p1,BorderLayout.CENTER);
		selectPanel.add(p12,BorderLayout.SOUTH);
		Tab.addTab("Search",selectPanel);
	}
	public void addSelectpanel1()
	{
		selectPanel1=new JPanel(new BorderLayout());
		p11=new JPanel(new GridLayout(1,4));
		first=new JButton("First");
		last=new JButton("Last");
		previous=new JButton("Previous");
		next=new JButton("Next");
		selectButton1=new JButton("Get");
		rollLabel=new JLabel("Roll");
		nameLabel=new JLabel("Name");
		yearLabel=new JLabel("Year");
		departmentLabel=new JLabel("Department");
		roll1=new JTextField(15);
		name1=new JTextField(15);
		year1=new JTextField(15);
		department1=new JTextField(15);
		
		roll1.setEditable(false);
		name1.setEditable(false);
		year1.setEditable(false);
		department1.setEditable(false);
		
		p1=new JPanel(new GridLayout(4,2));
		p10=new JPanel();
		p10.add(rollLabel);
		p1.add(p10);
		p10=new JPanel();
		p10.add(roll1);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(nameLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(name1);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(yearLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(year1);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(departmentLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(department1);
		p1.add(p10);
		
		p11.add(first);
		p11.add(previous);
		p11.add(next);
		p11.add(last);
		p11.add(selectButton1);
		clearButton2=new JButton("Clear All");
		p11.add(clearButton2);
		selectPanel1.add(p1,BorderLayout.CENTER);
		selectPanel1.add(p11,BorderLayout.SOUTH);
		
		Tab.addTab("Select",selectPanel1);
	}
	public void addInsertPanel()
	{
		insertPanel=new JPanel(new BorderLayout());
		
		rollLabel=new JLabel("Roll");
		nameLabel=new JLabel("Name");
		yearLabel=new JLabel("Year");
		departmentLabel=new JLabel("Department");
		roll2=new JTextField(15);
		name2=new JTextField(15);
		year2=new JTextField(15);
		department2=new JTextField(15);
		insertButton=new JButton("Insert");
		
		p1=new JPanel(new GridLayout(4,2));
		p10=new JPanel();
		p10.add(rollLabel);
		p1.add(p10);
		p10=new JPanel();
		p10.add(roll2);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(nameLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(name2);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(yearLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(year2);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(departmentLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(department2);
		p1.add(p10);
		
		clearButton3=new JButton("Clear All");
		p12=new JPanel();
		p12.add(insertButton);
		p12.add(clearButton3);
		
		insertPanel.add(p1,BorderLayout.CENTER);
		insertPanel.add(p12,BorderLayout.SOUTH);
		Tab.addTab("Insert",insertPanel);
		
	}
	public void addUpdateTab()
	{
		updatePanel=new JPanel(new BorderLayout());
		
		rollLabel=new JLabel("Roll");
		nameLabel=new JLabel("Name");
		yearLabel=new JLabel("Year");
		departmentLabel=new JLabel("Department");
		roll3=new JTextField(15);
		name3=new JTextField(15);
		year3=new JTextField(15);
		department3=new JTextField(15);
		updateButton=new JButton("Update");
		
		p1=new JPanel(new GridLayout(4,2));
		p10=new JPanel();
		p10.add(rollLabel);
		p1.add(p10);
		p10=new JPanel();
		p10.add(roll3);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(nameLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(name3);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(yearLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(year3);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(departmentLabel);
		p1.add(p10);
		
		p10=new JPanel();
		p10.add(department3);
		p1.add(p10);
		
		clearButton4=new JButton("Clear All");
		p12=new JPanel();
		p12.add(updateButton);
		p12.add(clearButton4);
		
		updatePanel.add(p1,BorderLayout.CENTER);
		updatePanel.add(p12,BorderLayout.SOUTH);
		
		Tab.addTab("Update",updatePanel);
		
	}
	public void addDeleteTab()
	{
		deletePanel=new JPanel(new BorderLayout());
		
		rollLabel=new JLabel("Roll");
		nameLabel=new JLabel("Name");
		yearLabel=new JLabel("Year");
		departmentLabel=new JLabel("Department");
		roll4=new JTextField(15);
		name4=new JTextField(15);
		year4=new JTextField(15);
		department4=new JTextField(15);
		deleteButton=new JButton("Delete");
		
		p1=new JPanel(new GridLayout(1,2));
		p10=new JPanel();
		p10.add(rollLabel);
		p1.add(p10);
		p10=new JPanel();
		p10.add(roll4);
		p1.add(p10);
		
		clearButton5=new JButton("Clear All");
		p12=new JPanel();
		p12.add(deleteButton);
		p12.add(clearButton5);
		
		deletePanel.add(p1,BorderLayout.CENTER);
		deletePanel.add(p12,BorderLayout.SOUTH);
		
		Tab.addTab("Delete",deletePanel);
	}
	public void addSelectPanelListeners()
	{
		selectButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					conn1 = DriverManager.getConnection(url, user, password);
					if (conn1 != null) {
						Statement st=conn1.createStatement();
						ResultSet rs=st.executeQuery("select * from students where id='"+roll.getText()+"'");
						if(rs.next())
						{
							name.setText(rs.getString(2));
							year.setText(rs.getString(3));
							department.setText(rs.getString(4));
						}
						else
							JOptionPane.showMessageDialog(null,"Roll number not found");
					}
					conn1.close();
					
				} catch (Exception ex) {
					System.out.println("An error occurred. Maybe user/password is invalid");
					ex.printStackTrace();
				}
			}
		});
		clearButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				roll.setText("");
				name.setText("");
				year.setText("");
				department.setText("");
			}
		});
	}
	public void addSelectPanel1Listeners()
	{
		clearButton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				roll1.setText("");
				name1.setText("");
				year1.setText("");
				department1.setText("");
			}
		});
		selectButton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					conn1 = DriverManager.getConnection(url, user, password);
					if (conn1 != null) {
						Statement st=conn1.createStatement();
						rs1=st.executeQuery("select * from students");
						if(rs1.next())
						{
							roll1.setText(rs1.getString(1));
							name1.setText(rs1.getString(2));
							year1.setText(rs1.getString(3));
							department1.setText(rs1.getString(4));
						}
						else
							JOptionPane.showMessageDialog(null,"No record found");
					}
					//conn1.close();
					
				} catch (Exception ex) {
					System.out.println("An error occurred. Maybe user/password is invalid");
					ex.printStackTrace();
				}
			}
		});
		first.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					conn1 = DriverManager.getConnection(url, user, password);
					if (conn1 != null) {
						//Statement st=conn1.createStatement();
						//rs1=st.executeQuery("select * from students where id='"+roll.getText()+"'");
						if(rs1.first())
						{
							roll1.setText(rs1.getString(1));
							name1.setText(rs1.getString(2));
							year1.setText(rs1.getString(3));
							department1.setText(rs1.getString(4));
						}
					}
					//conn1.close();
					
				} catch (Exception ex) {
					System.out.println("An error occurred. Maybe user/password is invalid");
					ex.printStackTrace();
				}
			}
		});
		
		next.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					conn1 = DriverManager.getConnection(url, user, password);
					if (conn1 != null) {
						//Statement st=conn1.createStatement();
						//rs1=st.executeQuery("select * from students where id='"+roll.getText()+"'");
						if(rs1.next())
						{
							roll1.setText(rs1.getString(1));
							name1.setText(rs1.getString(2));
							year1.setText(rs1.getString(3));
							department1.setText(rs1.getString(4));
						}
						else
						{
							JOptionPane.showMessageDialog(null,"This is the last record");
							System.out.println("This is the last record");
							rs1.previous();
						}
					}
					//conn1.close();
					
				} catch (Exception ex) {
					System.out.println("An error occurred. Maybe user/password is invalid");
					ex.printStackTrace();
				}
			}
		});
		previous.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					conn1 = DriverManager.getConnection(url, user, password);
					if (conn1 != null) {
						//Statement st=conn1.createStatement();
						//rs1=st.executeQuery("select * from students where id='"+roll.getText()+"'");
						if(rs1.previous())
						{
							roll1.setText(rs1.getString(1));
							name1.setText(rs1.getString(2));
							year1.setText(rs1.getString(3));
							department1.setText(rs1.getString(4));
						}
						else
						{
							JOptionPane.showMessageDialog(null,"This is the first record");
							System.out.println("This is the first record");
							rs1.next();
						}
					}
					//conn1.close();
					
				} catch (Exception ex) {
					System.out.println("An error occurred. Maybe user/password is invalid");
					ex.printStackTrace();
				}
			}
		});
		last.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					conn1 = DriverManager.getConnection(url, user, password);
					if (conn1 != null) {
						Statement st=conn1.createStatement();
						//rs1=st.executeQuery("select * from students where id='"+roll.getText()+"'");
						if(rs1.last())
						{
							roll1.setText(rs1.getString(1));
							name1.setText(rs1.getString(2));
							year1.setText(rs1.getString(3));
							department1.setText(rs1.getString(4));
						}
					}
					//conn1.close();
					
				} catch (Exception ex) {
					System.out.println("An error occurred. Maybe user/password is invalid");
					ex.printStackTrace();
				}
			}
		});
	}
	public void addInsertPanelListeners()
	{
		clearButton3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				roll2.setText("");
				name2.setText("");
				year2.setText("");
				department2.setText("");
			}
		});
		insertButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					conn1 = DriverManager.getConnection(url, user, password);
					if (conn1 != null) {
						Statement st=conn1.createStatement();
						String insertQuery="insert into students values ('"+roll2.getText()+"','"+name2.getText()+"',"+year2.getText()+",'"+department2.getText()+"')";
						if(st.executeUpdate(insertQuery)>0)
						{
							System.out.println("Updated Successfully");
							JOptionPane.showMessageDialog(null,"Inserted Successfully");
						}
						else
						{
							System.out.println("Roll number already found");
							JOptionPane.showMessageDialog(null,"Roll number already found");
						}
					}
					conn1.close();
					
				} catch (Exception ex) {
					System.out.println("An error occurred. Maybe user/password is invalid");
					ex.printStackTrace();
				}
			}
		});
	}
	public void addUpdatePanelListeners()
	{
		clearButton4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				roll3.setText("");
				name3.setText("");
				year3.setText("");
				department3.setText("");
			}
		});
		updateButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					conn1 = DriverManager.getConnection(url, user, password);
					if (conn1 != null) {
						Statement st=conn1.createStatement();
						String updateQuery="update students set name='"+name3.getText()+"',year="+year3.getText()+",department='"+department3.getText()+"' where id='"+roll3.getText()+"'";
						if(st.executeUpdate(updateQuery)>0)
						{
							System.out.println("Updated Successfully");
							JOptionPane.showMessageDialog(null,"Updated Successfully");
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Roll number Not found");
							System.out.println("Roll number Not found");
						}
					}
					conn1.close();
					
				} catch (Exception ex) {
					System.out.println("An error occurred. Maybe user/password is invalid");
					ex.printStackTrace();
				}
			}
		});
	}
	public void addDeletePanelListeners()
	{
		clearButton5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				roll4.setText("");
			}
		});
		deleteButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");  
					conn1 = DriverManager.getConnection(url, user, password);
					if (conn1 != null) {
						Statement st=conn1.createStatement();
						String updateQuery="delete from students where id='"+roll4.getText()+"'";
						if(st.executeUpdate(updateQuery)>0)
						{
							System.out.println("deleted Successfully");
							JOptionPane.showMessageDialog(null,"deleted Successfully");
						}
						else
						{
							System.out.println("Roll number Not found");
							JOptionPane.showMessageDialog(null,"Roll number Not found");
						}
					}
					conn1.close();
					
				} catch (Exception ex) {
					System.out.println("An error occurred. Maybe user/password is invalid");
					ex.printStackTrace();
				}
			}
		});
	}
	StudentDBFrame()
	{
		initialize();
		addSelectpanel();
		addSelectpanel1();
		addInsertPanel();
		addUpdateTab();
		addDeleteTab();
		Tab.addTab("Delete",deletePanel);
		add(Tab);
		addSelectPanelListeners();
		addSelectPanel1Listeners();
		addInsertPanelListeners();
		addUpdatePanelListeners();
		addDeletePanelListeners();
	}
}