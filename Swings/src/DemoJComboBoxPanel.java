import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JApplet;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class DemoJComboBoxPanel extends JPanel implements ItemListener{ 

	JComboBox cb;

	
	public DemoJComboBoxPanel()
	{
		setLayout(new FlowLayout());
		cb = new JComboBox();

		cb.addItem("C");
		cb.addItem("C++");
		cb.addItem("Java");
		 
		// in place of add()
		// cb.setSelectedIndex(anIndex); in place of cb.select(index)
		add(cb);
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
