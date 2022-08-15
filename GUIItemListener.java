import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.colorchooser.ColorChooserComponentFactory;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.html.parser.Entity;

import org.w3c.dom.css.RGBColor;

import java.awt.event.*;

class GUIItemListener implements ItemListener
{
	Choice lst;
	Label l;
    Checkbox ckbold;
    JTextField t;
    Font fnt;
    JPanel p;
    Choice lisi;
    
	public void itemStateChanged(ItemEvent e)
	{
        String ss=lst.getSelectedItem();
        //lst.getSelectedIndex();

    



        if (ss == "Green")
        {
            t.setForeground(Color.GREEN);
        }
        else if(ss == "Black")
        {
            t.setForeground(Color.BLACK);
        }
        else if(ss == "Orange")
        {
            t.setForeground(Color.ORANGE);
        }
        else if(ss == "Pink")
        {
            t.setForeground(Color.PINK);
        }
        else if(ss == "Blue")
        {
            t.setForeground(Color.BLUE);
        }
        else if(ss == "Gray")
        {
            t.setForeground(Color.GRAY);
        }
        else if(ss == "Yellow")
        {
            t.setForeground(Color.YELLOW);
        }
        Font ft=new Font("Arial",Font.ITALIC+Font.BOLD, 30);
        t.setFont(ft);
       // l.setText("H__E__L__L__O   IN  "+ ss);
    }
	public static void main(String[] arg)
	{
    GUIItemListener o = new GUIItemListener();
	
	}
    GUIItemListener()
    {
		JFrame frm=new JFrame();
		Container c=frm.getContentPane();
        BorderLayout bl=new BorderLayout();
        c.setLayout(bl);
        p=new JPanel();
        p.setLayout(new FlowLayout());
        
       // GridLayout gl= new GridLayout(0,1);
		//c.setLayout(gl);

       // ckbox =new Checkbox("BOLD",true);
        //CheckboxGroup cg=new CheckboxGroup();
        //lst=new List( 7,  false);

        //con.add(btn[0],BorderLayout.NORTH);	
		//con.add(btn[1],"South");
		//con.add(btn[2],"East");
		//con.add(btn[3],BorderLayout.WEST);
		//con.add(btn[4],BorderLayout.CENTER);



        lst=new Choice();
        lst.add("Font Colors");
        lst.add("Green");
        lst.add("Black");
        lst.add("Orange");
        lst.add("Pink");
        lst.add("Blue");
        lst.add("Gray");
        lst.add("Yellow");
        lst.addItemListener(this);

        lisi=new Choice();
        lisi.add("Font Size");
        lisi.add("18");
        lisi.add("22");
        lisi.add("25");
        lisi.add("30");
        lisi.add("35");
        lisi.add("40");
        lisi.add("45");
        lisi.add("48");
        lisi.add("52");
        lisi.addItemListener(this);


        t=new JTextField();
        t.setBackground(Color.cyan);
        c.add(lst);
        lst.setBackground(Color.LIGHT_GRAY);
        c.add(t);
     //   t.setWrapStyleWord(true);
      //  t.setLineWrap(true);
        //c.add(ckbox);
        
       // l.addItemListener(this);


       JScrollPane j = new JScrollPane(t, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      // f.setJMenuBar();
       p.add(lst);
       p.add(lisi);
     //p.add();
     //p.add();
        frm.setSize(400,600);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);
	}	
}