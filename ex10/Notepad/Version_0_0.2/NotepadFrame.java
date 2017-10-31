import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
import javax.imageio.ImageIO;
import java.io.File;
public class NotepadFrame extends JFrame
{
	JTextArea ta=new JTextArea();
	JScrollPane scrollPan=new JScrollPane(ta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	JMenuBar menuBar=new JMenuBar();
	JMenu fileMenu,editMenu,helpMenu,fontMenu;
	JMenuItem fontSizeMI,fontStyleMI;
	JMenuItem newMI,openMI,saveMI;
	JMenuItem copyMI,cutMI,findMI;
	JMenuItem aboutMI;
	JCheckBoxMenuItem offlineMI;
	JRadioButtonMenuItem redMI,greenMI;
	ButtonGroup themeGroup;
	NotepadFrame()
	{
		setVisible(true);
		setSize(1000,700);
		setResizable(true);
		setTitle("Notepad");
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
		fileMenu.add(newMI);
		fileMenu.add(openMI);
		fileMenu.addSeparator();
		fileMenu.add(saveMI);
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
				System.out.println("Clicked open");
			}
		});
		saveMI.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println("Clicked save");
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
				f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f1.setExtendedState(f1.getExtendedState()|JFrame.MAXIMIZED_BOTH);
			}
		});
	}
}