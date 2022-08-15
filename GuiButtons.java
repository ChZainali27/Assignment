import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;


class GuiButtons implements ActionListener
{
    JButton btn2;
    JLabel l;
    JButton btn;
    JTextField t;
    public void actionPerformed(ActionEvent e)
    {
        e.getActionCommand();
        t.setText("1");
        
        l.setText("Answer is 1");

    }
    public static void main(String zoro[])
    {
        GuiButtons g=new GuiButtons();
    }
    GuiButtons()
    {
        
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setSize(600,600);
     
        f.setTitle("GUIBUTTons");
        Container c=f.getContentPane();
        FlowLayout fl=new FlowLayout();
        c.setLayout(fl);

        btn=new JButton("1");
        c.add(btn);

        t=new JTextField("          ");
        c.add(t);
        l=new JLabel("Answer is");
        c.add(l);
        btn2=new JButton("2");
        c.add(btn2);
        
       
        btn.addActionListener(this); 
        btn2.addActionListener(this);
        f.setDefaultCloseOperation(3);


    }
}