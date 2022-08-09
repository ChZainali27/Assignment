import java.awt.*;
import javax.swing.*;
class ChangeTextOnClick
{
	public static void main (String zoro[])
	{
		
		//mageIcon img=new ImageIcon("CarinaNebula.jpg");
		
		//JLabel l=new JLabel();
		//l.setText("change text on Click");
		//l.setIcon(img);
		
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(500,500);
		f.setLayout(null);
		Container c=f.getContentPane();
		JButton btn=new JButton(" red ");
		c.add(btn);
		btn.setBounds(30,40,60,30);
		f.setDefaultCloseOperation(3);
		//f.add(l);
	}
}