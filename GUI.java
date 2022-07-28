/**import javax.swing.*;
class DemoGUI
{
	public static void main (String []zain)
	{
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();
		FlowLayout flw=new FlowLayout();
		con.setLayout(flw);
		JButton btn1=new JButton("Click me");
		JButton btn2=new JButton("Click me");
		con.add(btn1);
		con.add(btn2);
		frm.setSize(200,400);
		frm.setVisible(true);
		frm.setDafaultCloseOperation(3);
	}
}***/

/****
import java.awt.*;
import javax.swing.*;
class GUI
{
	public static void main(String arg[])
	{
		JFrame f=new JFrame();
		f.setVisible(true);
		Container c=f.getContentPane();
		//BorderLayout b1=new BorderLayout();
		//c.setLayout(b1);	
		//FlowLayout fl=new FlowLayout();
		//c.setLayout(fl);
		GridLayout gl=new GridLayout(4,6,9,14);
		c.setLayout(gl);
		//f.setSize(500,400);
		//f.setLocation(100,100);
		f.setBounds(100,100,500,400);
		f.setTitle("First GUI");
		//String[] strDirection=("NORTH","SOUTH","EASt","WEST","CENTER");
		JButton[] btn=new JButton[5];
		for(int i=0; i<btn.length; i++)
		{
			btn[i]=new JButton((1+i)+"");
		}
		c.add(btn[0],BorderLayout.NORTH);
		c.add(btn[1],BorderLayout.SOUTH);
		c.add(btn[2],BorderLayout.EAST);
		c.add(btn[3],BorderLayout.WEST);
		c.add(btn[4],BorderLayout.CENTER);
		//f.setResizeable(false);
		f.setDafaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
***/




import java.awt.*;
import javax.swing.*;
class GUI
{
	public static void main(String arg[])
	{
		//JPanel pp=new JPanel();
		//pp.setBackground(Color.red);
		//pp.setBounds(0,0,250,250);
		JFrame f=new JFrame("login");
		f.setVisible(true);
		f.setTitle("GUI");
	
		Container c=f.getContentPane();
		BorderLayout b1=new BorderLayout();
		c.setLayout(b1);
		f.setLocation(140,90);
		f.setSize(500,400);
		GridLayout gl=new GridLayout(4,4,16,18);
		c.setLayout(gl);
		JLabel ll=new JLabel("Hello Welcome to Graphic User Interface");
		JTextField usernamet=new JTextField();
		JTextField passwordt=new JTextField();
		JLabel usernamel=new JLabel("user Name");
		JLabel passwordl=new JLabel("password");
		c.add(ll);
		c.add(usernamel);
		c.add(usernamet);
		c.add(passwordl);
		c.add(passwordt);
		
		JButton[] btn=new JButton[10];
		for(int i=0; i<btn.length; i++)
		{
			btn[i]=new JButton("Sign up");
			c.add(btn[i]);
		}
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}