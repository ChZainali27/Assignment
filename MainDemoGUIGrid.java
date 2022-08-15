import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

class MainDemoGUIGrid
{
	public static void main(String[] arg)
	{
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();//Get Workable area
		BorderLayout bl=new BorderLayout();
		//GridLayout gl= new GridLayout(5,4,8,15);//create layout object
		con.setLayout(bl);//set the layout of workable area
		//create GUI controls
		/**
		JButton[] btn= new JButton[20];
		for(int i=0;i<btn.length;i++)
		{
			btn[i]=new JButton((i+1)+"");
			con.add(btn[i],BorderLayout.CENTER);
		}
		 */
		JTextField t=new JTextField();
		con.add(t, BorderLayout.NORTH);
		frm.setSize(400,600);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);		
	}

}