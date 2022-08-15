import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.colorchooser.ColorChooserComponentFactory;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.html.parser.Entity;

import org.w3c.dom.css.RGBColor;

import java.awt.event.*;

class FontStyleItemListener implements ItemListener
{
	Choice lst;
	Label l;
    JTextField t;
    Font fnt;
    int b=7;
    
	public void itemStateChanged(ItemEvent e)
	{
        String ss=lst.getSelectedItem();
        //lst.getSelectedIndex();

    


        if (ss == "8")
        {
            fnt=new Font("Arial", Font.PLAIN,56);
            t.set(fnt);
        }
        else if(ss == "9")
        {
            t.setSize(9);
        }
        /*else if(ss == "Orange")
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
        t.setFont(ft);**/
         
       // l.setText("H__E__L__L__O   IN  "+ ss);
    }
	public static void main(String[] arg)
	{
        FontStyleItemListener o = new FontStyleItemListener();
	
	}
    FontStyleItemListener()
    {
		JFrame frm=new JFrame();
		Container c=frm.getContentPane();
        BorderLayout bl=new BorderLayout();
        c.setLayout(bl);

        //Font ft=new Font("Arial", Font.PLAIN,56);
        lst=new Choice();
        lst.add("Font Size");
        lst.add("8");
        lst.add("9");
        lst.add("10");
        lst.add("11");
        lst.add("12");
        lst.add("14");
        lst.add("16");
        lst.add("18");
        lst.add("20");
        lst.add("22");
        lst.add("24");
        lst.add("26");
        lst.add("28");
        lst.add("30");
        lst.add("32");
        lst.add("34");
        lst.add("36");
        lst.add("38");
        lst.add("40");
        lst.add("42");
        lst.add("44");
        lst.add("46");
        lst.add("48");
        lst.add("50");
        lst.add("52");
        lst.add("54");
        lst.add("56");
        lst.add("58");
        lst.add("60");
        lst.add("62");
        lst.add("64");
        lst.add("66");
        lst.add("68");
        lst.add("70");
        lst.add("72");

        

   
        t=new JTextField();
        
        t.setBackground(Color.cyan);
        c.add(lst,BorderLayout.NORTH);
        lst.setBackground(Color.WHITE);
        
        //Font ft=new Font("Arial",Font.ITALIC,10);
        //lst.add(fnt);
        c.add(t, BorderLayout.CENTER);
        //c.add(ckbox);
        lst.addItemListener(this);
       // l.addItemListener(this);
        frm.setSize(400,600);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);
	}	
}