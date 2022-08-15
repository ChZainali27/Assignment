import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MainDemoGUIItemListenerRadiobox implements ItemListener
{
	Choice lst;
	Checkbox chk12;
	Checkbox chk15;
	Checkbox chk20;
	Checkbox chkBold;
	Checkbox chkItalic;
	Label lbl;
	
	public void itemStateChanged(ItemEvent e)
	{
		String txtItem=lst.getSelectedItem();			
		int index=lst.getSelectedIndex();
		Font fnt;
		if (chkBold.getState()==true)
		{
			fnt= new Font("Arial",Font.BOLD,20);		
			lbl.setFont(fnt);
		}
		if (chkItalic.getState()==true)
		{
			fnt= new Font("Arial",Font.ITALIC,20);		
			lbl.setFont(fnt);
		}
		if (chkBold.getState()==true && chkItalic.getState()==true)
		{
			fnt= new Font("Arial",Font.BOLD+Font.ITALIC,20);		
			lbl.setFont(fnt);
		}

		if(txtItem=="Red")
		{
			lbl.setForeground(Color.RED);
		}
		else if(txtItem=="Green")
		{
			lbl.setForeground(Color.GREEN);
		}
		else if(txtItem=="Yellow")
		{
			lbl.setForeground(Color.YELLOW);
		}
		else if(txtItem=="Black")
		{
			lbl.setForeground(Color.BLACK);
		}
		else if(txtItem=="Orange")
		{
			lbl.setForeground(Color.ORANGE);
		}
		else if(txtItem=="Blue")
		{
			lbl.setForeground(Color.BLUE);
		}




		lbl.setText(txtItem+ " "+ index);
		
	}
	public static void main(String[] arg)
	{
MainDemoGUIItemListenerRadiobox o = new MainDemoGUIItemListenerRadiobox();
	
	}
	MainDemoGUIItemListenerRadiobox(){
		JFrame frm=new JFrame();
		Container con=frm.getContentPane();//Get Workable area
		GridLayout gl= new GridLayout(0,1);//create layout object
		con.setLayout(gl);//set the layout of workable area
		//create GUI controls
		chkBold =new Checkbox("Bold",true);
		chkItalic =new Checkbox("Italic");
		//RadioButtons
		CheckboxGroup cg=new CheckboxGroup();
		chk12=new Checkbox("12",cg,true);
		chk15=new Checkbox("15",cg,false);
		chk20=new Checkbox("20",cg,false);
		

		lst = new Choice();
		lst.add("Green");
		lst.add("Yellow");
		lst.add("Black");
		lst.add("Red");
		lst.add("Orange");
		lst.add("Blue");
		lbl=new Label("NFC IET");
		//add controls on workable area
		con.add(lbl);
		con.add(lst);
		con.add(chkBold);
		con.add(chkItalic);
		con.add(chk12);
		con.add(chk15);
		con.add(chk20);
		lst.addItemListener(this);
		chkBold.addItemListener(this);
		chkItalic.addItemListener(this);
		chk12.addItemListener(this);
		chk15.addItemListener(this);
		chk20.addItemListener(this);
		//set frame properties
		frm.setSize(200,400);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(3);
	}	
}