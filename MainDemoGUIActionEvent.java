import java.awt.*;
import javax.swing.*;

class MainDemoGUI
{
	public static void main(String[] arg)
	{
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();//Get Workable area
		FlowLayout flw= new FlowLayout();//create layout object
		con.setLayout(flw);//set the layout of workable area
		//create GUI controls
		JButton btn1=new JButton("Click Me 1");
		JButton btn2=new JButton("Click Me 2");
		//add controls on workable area
		con.add(btn1);
		con.add(btn2);
		//set frame properties
		frm.setSize(200,400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);		


		
		

	}
	
}