

import java.awt.Dimension;
import javax.swing.JFrame;

public class ImageViewer {
	public static void main(String[] args) {
		JFrame frame = new ImageViewerFrame();
		frame.setTitle("Imager Viewer");
		frame.setSize(300, 400);
		frame.setSize(new Dimension(300, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// so that we dont need WindowListener to close JFrame
		frame.show();
	}
}
