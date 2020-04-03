package Menu;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyNotepad extends Frame implements WindowListener{
	
	MenuBar MB; 
	
	// Like button
	Menu MFile,MEdit,MHelp,MSubMenu; 
	
	// Like button
	MenuItem MINew,MIOpen,MISave,MISaveAs,MISaveAll,MIPrint,MIImport,MIExport,MIQuit; // for Mfile Menu 
	MenuItem MIUndo,MIRedo,MICut,MICopy,MIPaste,MIDelete,MISelect,MISelectAll; // for MEdit Menu
	MenuItem MIWelcome,MIHelpContents,MISearch,MITip,MITricks,MICheetSheet,MIContribute; // for Mhelp Menu
	MenuItem MISub1,MISub2; // for MSubmenu Menu
	
	
	public MyNotepad()
	{
		setVisible(true);
		setSize(500, 500);
		setLayout(new FlowLayout()); // as default of Frame is BorderLayout
		
		// Menu items for menu file
		MINew = new MenuItem("New"); 
		
		
		// Making shortcut keys for menuitems if already created
		MINew.setShortcut(new MenuShortcut(KeyEvent.VK_N));  // default shift is false
		
		// Making shortcut keys for menuitems if during creation
		MIOpen = new MenuItem("Open", new MenuShortcut(KeyEvent.VK_O)); 
		
	
		MISave = new MenuItem();
		MISave.setLabel("Save"); // another way of intialising menuitem

		
		MISaveAs = new MenuItem("Save As");
		MISaveAll = new MenuItem("Save All");
		MIPrint = new MenuItem("Print");
		MIImport = new MenuItem("Import");
		MIExport = new MenuItem("Export");
		MIQuit = new MenuItem("Quit");

		// Menu items for menu edit
		MIUndo = new MenuItem("Undo");
		MIRedo = new MenuItem("Redo");
		MICut = new MenuItem("Cut");
		MICopy = new MenuItem("Copy");
		MIPaste = new MenuItem("Paste");
		MIDelete = new MenuItem("Delete");
		MISelect = new MenuItem("Select");
		MISelectAll = new MenuItem("Select All");
		
		// Menu items for menu help
		MIWelcome = new MenuItem("Welcome");
		MIHelpContents = new MenuItem("Help Contents");
		MISearch = new MenuItem("Search");
		MITip = new MenuItem("Tip Of The Day");
		MITricks = new MenuItem("Tricks And Tips");
		MICheetSheet = new MenuItem("Cheet Sheet");
		MIContribute = new MenuItem("Contribute");
		
		// Menu items for submenu 
		
		MISub1 = new MenuItem("Sub1");
		MISub2 = new MenuItem("Sub2");
		// creating sub menus
		MSubMenu = new Menu("SubMenu");
		
		MSubMenu.add(MISub1);
		MSubMenu.add(MISub2);
		
		
		MFile = new Menu("File");
		MEdit = new Menu("Edit");
		MHelp = new Menu("Help");

		
		
		
		MFile.add(MINew);
		MFile.add(MIOpen);
		MFile.addSeparator(); // adding line menu.addSeparator
		MFile.add(MISave);
		MFile.add(MISaveAs);
		MFile.add(MISaveAll);
		
		MFile.add(MSubMenu); // adding submenu
		
		MFile.addSeparator();
		MFile.add(MIPrint);
		MFile.addSeparator();
		MFile.add(MIImport);
		MFile.add(MIExport);
		MFile.addSeparator();
		MFile.add(MIQuit);
		
		
		MEdit.add(MIUndo);
		MEdit.add(MIRedo);
		MEdit.addSeparator();
		MEdit.add(MICut);
		MEdit.add(MICopy);
		MEdit.add(MIPaste);
		MEdit.addSeparator();
		MEdit.add(MIDelete);
		MEdit.add(MISelect);
		MEdit.add(MISelectAll);
		
		
		MHelp.add(MIWelcome);
		MHelp.addSeparator();
		MHelp.add(MIHelpContents);
		MHelp.add(MISearch);
		MHelp.addSeparator();
		MHelp.add(MITip);
		MHelp.add(MITricks);
		MHelp.add(MICheetSheet);
		MHelp.addSeparator();
		MHelp.add(MIContribute);
		
		
		
		MB = new MenuBar();
		MB.add(MFile);
		MB.add(MEdit);
		MB.add(MHelp);
		
		
		setMenuBar(MB);
		
		// Set ShortCut
		MISave.setShortcut(new MenuShortcut(KeyEvent.VK_S));
		MISaveAs.setShortcut(new MenuShortcut(KeyEvent.VK_S, true));
		MIPrint.setShortcut(new MenuShortcut(KeyEvent.VK_P));
		MIImport.setShortcut(new MenuShortcut(KeyEvent.VK_I));
		MIExport.setShortcut(new MenuShortcut(KeyEvent.VK_E));
		MIQuit.setShortcut(new MenuShortcut(KeyEvent.VK_W));
		
		
		MIUndo.setShortcut(new MenuShortcut(KeyEvent.VK_Z));
		MIRedo.setShortcut(new MenuShortcut(KeyEvent.VK_Y));
		MICut.setShortcut(new MenuShortcut(KeyEvent.VK_X));
		MICopy.setShortcut(new MenuShortcut(KeyEvent.VK_C));
		MIPaste.setShortcut(new MenuShortcut(KeyEvent.VK_V));
		MIDelete.setShortcut(new MenuShortcut(KeyEvent.VK_D));
		MISelectAll.setShortcut(new MenuShortcut(KeyEvent.VK_A));
		
		MITip.setShortcut(new MenuShortcut(KeyEvent.VK_T));
		MITricks.setShortcut(new MenuShortcut(KeyEvent.VK_T,true));
		
		validate();
		
		this.addWindowListener(this);

	}
	
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(-1);
		 // this.dispose();
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
