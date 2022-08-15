import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.colorchooser.ColorChooserComponentFactory;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.html.parser.Entity;

import org.w3c.dom.css.RGBColor;

import java.awt.event.*;

class StyleItemListener implements ItemListener
{
	Choice lst;
    choice lst2;
	Label l;
    JTextField t;
    Font fnt;
    int b=7;
    
	public void itemStateChanged(ItemEvent e)
	{
        String ss=lst.getSelectedItem();
        //lst.getSelectedIndex();

    }
	public static void main(String[] arg)
	{
        StyleItemListener o = new StyleItemListener();
	
	}
    StyleItemListener()
    {
		JFrame frm=new JFrame();
		Container c=frm.getContentPane();
        BorderLayout bl=new BorderLayout();
        c.setLayout(bl);

        t=new JTextField();
       
        lst=new Choice();
        lst.add("Calibri");
        lst.add("Comic Sans MS");
        lst.add("Constantia");      
        lst.add("Corbel");  

        lst.setBackground(Color.WHITE);
        c.add(lst,BorderLayout.NORTH);
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