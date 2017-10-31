import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.util.Scanner;
import java.io.*;
public class NotepadFrame extends JFrame
{
	FontViewerFrame f11;
	String path;
	public static int padCount=0;
	public JTextArea ta=new JTextArea();
	JScrollPane scrollPan=new JScrollPane(ta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	JMenuBar menuBar=new JMenuBar();
	JMenu fileMenu,editMenu,helpMenu,fontMenu;
	JMenuItem fontSizeMI,fontStyleMI;
	JMenuItem newMI,openMI,saveMI,saveAsMI;
	JMenuItem copyMI,cutMI,findMI;
	JMenuItem aboutMI;
	JCheckBoxMenuItem offlineMI;
	JRadioButtonMenuItem redMI,greenMI;
	ButtonGroup themeGroup;
	
	JPopupMenu popup=new JPopupMenu();
	
	NotepadFrame()
	{
		padCount++;
		setVisible(true);
		setSize(1000,700);
		setResizable(true);
		setTitle("Untitled "+padCount+".txt");
		add(scrollPan);
		try {
			setIconImage(ImageIO.read(new File("E:\\EducationDrive\\SemFive\\Java\\java lab\\ex11\\index.jpg")));
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		//menuBar
		fileMenu=new JMenu("File");
		editMenu=new JMenu("Edit");
		helpMenu=new JMenu("Help");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		setJMenuBar(menuBar);
		//menu items
		newMI=new JMenuItem("New",'N');
		openMI=new JMenuItem("Open",'O');
		saveMI=new JMenuItem("Save",'S');
		saveAsMI=new JMenuItem("Save as");
		fileMenu.add(newMI);
		fileMenu.add(openMI);
		fileMenu.addSeparator();
		fileMenu.add(saveMI);
		fileMenu.add(saveAsMI);
		offlineMI=new JCheckBoxMenuItem("Offline");
		fileMenu.add(offlineMI);
		
		fontMenu=new JMenu("font");
		fontStyleMI=new JMenuItem("font style");
		fontSizeMI=new JMenuItem("font size");
		copyMI=new JMenuItem("Copy");
		cutMI=new JMenuItem("Cut");
		findMI=new JMenuItem("find");
		
		fontMenu.add(fontSizeMI);
		fontMenu.add(fontStyleMI);
		
		editMenu.add(copyMI);
		editMenu.add(cutMI);
		editMenu.add(fontMenu);
		editMenu.add(findMI);
		
		aboutMI=new JMenuItem("About notepad");
		helpMenu.add(aboutMI);
		//Menu event handler
		newMI.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println("Clicked new");
			}
		});
		openMI.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				//System.out.println("Clicked open");
				try
				{
					JFileChooser openFileChooser=new JFileChooser();
					openFileChooser.setCurrentDirectory(new File("."));
					openFileChooser.showOpenDialog(null);
					File f1=openFileChooser.getSelectedFile();
					path=openFileChooser.getSelectedFile().getAbsolutePath();
					if(ta.getText().length()!=0)
					{
						NotepadFrame np=new NotepadFrame();
						Scanner fin=new Scanner(f1);
						np.setTitle(f1.getName());
						while(fin.hasNext())
						{
							String x=fin.nextLine();
							np.ta.append(x);
							np.ta.append("\n");
						}
						fin.close();
					}
					else
					{
						setTitle(f1.getName());
						Scanner fin=new Scanner(f1);
					while(fin.hasNext())
					{
						String x=fin.nextLine();
						ta.append(x);
						ta.append("\n");
					}
					fin.close();
					}
					
				}
				catch(Exception e)
				{}
			}
		});
		saveMI.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				String filename=getTitle();
				try
				{
					/*path+=filename;
					StringBuilder filename1=new StringBuilder();
					for(int i=0;i<path.length();i++)
					{
						char c=path.charAt(i);
						if(c=='\\')
							filename1.append("\\");
						filename1.append(Character.toString(c));
					}
					System.out.println(filename1.toString());*/
					File f2=new File(getTitle());
					PrintWriter pw=new PrintWriter(f2);
					pw.append(ta.getText());
					pw.close();
					JOptionPane.showMessageDialog(null,f2.getName()+" is saved");
				}
				catch(Exception e)
				{}
			}
		});
		saveAsMI.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				//System.out.println("Clicked save");
				JFileChooser saveFileChooser=new JFileChooser();
				
				saveFileChooser.showSaveDialog(null);
				try
				{
				int val=JOptionPane.showConfirmDialog(null,"Do you want to save it");
				if(val==0)
				{
				File f1=saveFileChooser.getSelectedFile();
				setTitle(f1.getName());
				PrintWriter pw=new PrintWriter(f1);
				pw.write(ta.getText());
				pw.close();
				JOptionPane.showMessageDialog(null,f1.getName()+" is saved");
				}
				else
					JOptionPane.showMessageDialog(null,"file is not saved");
				
				}
				catch(Exception e)
				{}
			}
		});
		//mnemoni
		fileMenu.setMnemonic('F');
		editMenu.setMnemonic('E');
		helpMenu.setMnemonic('H');
		
		//accelerator
		openMI.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		newMI.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
		saveMI.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
		
		copyMI.setAccelerator(KeyStroke.getKeyStroke("ctrl C"));
		cutMI.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		findMI.setAccelerator(KeyStroke.getKeyStroke("ctrl F"));
		
		fileMenu.setToolTipText("This is file menu");
		editMenu.setToolTipText("This is edit menu");
		helpMenu.setToolTipText("This is help menu");
		newMI.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				NotepadFrame f1=new NotepadFrame();
				//f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//f1.setExtendedState(f1.getExtendedState()|JFrame.MAXIMIZED_BOTH);
			}
		});
		findMI.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				JOptionPane.showInputDialog("Find");
				ta.setFont(f11.welcomeLabel.getFont());
			}
		});
		fontStyleMI.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				f11=new FontViewerFrame();
				
			}
		});
		
		popup.add(cutMI);
		popup.add(copyMI);
		popup.add(fontStyleMI);
		ta.addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent me)
			{
				if(me.isPopupTrigger())
					popup.show(me.getComponent(),me.getX(),me.getY());
			}
		});
		
	}
}