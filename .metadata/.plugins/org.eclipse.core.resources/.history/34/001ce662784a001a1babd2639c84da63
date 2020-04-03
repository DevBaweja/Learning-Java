import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ChessBoard extends JFrame
{
	int width,height;
	
	public ChessBoard() {
		// TODO Auto-generated constructor stub
		setVisible(true); // for visibility
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // for closing
		setLocationRelativeTo(this); // center of window
		setTitle("Chess Game"); // for title
		width = 1000;
		height = 1000;
		setSize(width,height);
		
		//setResizable(false); // for no resize
		Chess chess = new Chess();
		add(chess);
	}
}
