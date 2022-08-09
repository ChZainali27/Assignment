/****import java.awt.*;
import javax.swing.*;
class Quiz
{
	//Label lb;
	//JButton b;
	public static void main (String zoro[])
	{
		JFrame fr=new JFrame();
		fr.setVisible(true);
		fr.setTitle("GUI_Quiz");
		Container c= fr.getContentPane();
		fr.setSize(400,300);
		//fr.setBounds(500,100,500,300);
		//c.setLayout(null);
		FlowLayout fl=new FlowLayout();
		c.setLayout(fl);
		JLabel l=new JLabel("NFC_and_IET");
		c.add(l);
		//l.setBounds(90,5,200,80);
		JButton b=new JButton("SEnd");
		c.add(b);
		JTextField t=new JTextField();
		c.add(t);
		t.setSize(100,50);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}**/





import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MainDemoGUIActionEvent1 implements Actionlistener
{
	JButton b;
	Label l;
	int count=0;
	public void AP(ActionEvent e)
	{
		String strCaption = e.getActionCommand();
		count++;
		Font f=new Font("Arial",Font.BOLD,20);
		l.setFont(f);
		l.setText(strCaption + count);
	}
	public static void main(String zoro[])
	{
		MainDemoGUIActionEvent1 0=new MainDemoGUIActionEvent1();
	}
	
	mainDemoGUIActionEvent1()
	{
		JFrame fr=new JFrame();
		Container c= fr.getContentPane();
		FlowLayout fl=new FlowLayout();
		c.setLayout(fl);
		b=new JButton("Click me");
		l=new Label("NFC_and_IET");
		c.add(l);
		c.add(b);
		b.addActionListener(this);
		fr.setSize(200,400);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(3);
	}		
}
