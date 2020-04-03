

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageViewerFrame extends JFrame{

	public ImageViewerFrame() {
		// TODO Auto-generated constructor stub
		// set menu bsr 
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar); // to JFrame
		
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		
		JMenuItem openItem = new JMenuItem("Open");
		menu.add(openItem);
		
		// adding external event
		openItem.addActionListener(new  FileOpenListener()); // will it action listener
		
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		
		// adding internal event
		exitItem.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						System.exit(-1);
					}
				});
		
		// label to show image
		label = new JLabel();
		Container contentPane = getContentPane();
		contentPane.add(label,"Center");
		
	}
	
	
	// inner classes
	class FileOpenListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			// setting up file chooser
			JFileChooser chooser = new JFileChooser();
			chooser.setCurrentDirectory(new File("."));
			
			// accept all files ending with .gif
			
			chooser.setFileFilter(new javax.swing.filechooser.FileFilter()
					{

						@Override
						public boolean accept(File f) {
							// TODO Auto-generated method stub
							return f.getName().toLowerCase().endsWith(".gif") || f.isDirectory();
						}

						@Override
						public String getDescription() {
							// TODO Auto-generated method stub
							return "Gif Image";
						}

					});
			
			// show file chooser dialog
			int r = chooser.showOpenDialog(ImageViewerFrame.this);
			
			// if accepted
			if(r == JFileChooser.APPROVE_OPTION)
			{
				String name = chooser.getSelectedFile().getPath();
				label.setIcon(new ImageIcon(name));
			}

		}

	}
	
	private JLabel label;
	
}



