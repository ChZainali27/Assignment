
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hello extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	String firstnumber = "";
	String secondnumber = "" ;
	String thirdnumber = "" ;
	String forthnumber = "" ;
	String fifthnumber = "" ;
	String sixthnumber = "" ;
	String operator;
	int inp1;
	int inp2;
	int inp3;
	int opr;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hello frame = new hello();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public hello() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 358);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.GREEN);
		setTitle("Calculator");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      
				String s= textField.getText() + btn1.getText();
				textField.setText(s);
				//there are two methods of adding text in the text field
				//textField.setText(textField.getText() + btn1.getText());
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn1.setBackground(new Color(0, 0, 0));
		btn1.setForeground(Color.GREEN);
		btn1.setBounds(82, 53, 89, 47);
		contentPane.add(btn1);

		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn2.getText());
			}
		});
		btn2.setBackground(new Color(0, 0, 0));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn2.setForeground(Color.GREEN);
		btn2.setBounds(181, 53, 89, 47);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn3.getText());
			}
		});
		btn3.setBackground(new Color(0, 0, 0));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn3.setForeground(Color.GREEN);
		btn3.setBounds(280, 53, 89, 47);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn4.getText());
			}
		});
		btn4.setBackground(new Color(0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn4.setForeground(Color.GREEN);
		btn4.setBounds(82, 111, 89, 43);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn5.getText());
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn5.setBackground(new Color(0, 0, 0));
		btn5.setForeground(Color.GREEN);
		btn5.setBounds(181, 111, 89, 43);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn6.getText());
			}
		});
		btn6.setBackground(new Color(0, 0, 0));
		btn6.setForeground(Color.GREEN);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn6.setBounds(280, 111, 89, 43);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn7.getText());
			}
		});
		btn7.setBackground(new Color(0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn7.setForeground(Color.GREEN);
		btn7.setBounds(82, 163, 89, 47);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn8.getText());
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn8.setBackground(new Color(0, 0, 0));
		btn8.setForeground(Color.GREEN);
		btn8.setBounds(181, 165, 89, 47);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btn9.getText());
			}
		});
		btn9.setBackground(new Color(0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn9.setForeground(Color.GREEN);
		btn9.setBounds(280, 165, 89, 47);
		contentPane.add(btn9);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBackground(new Color(0, 0, 0));
		textField.setForeground(new Color(240, 255, 240));
		textField.setBounds(82, 11, 344, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btndot = new JButton(".");
		btndot.setBackground(new Color(211, 211, 211));
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + btndot.getText());
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndot.setForeground(new Color(255, 0, 0));
		btndot.setBounds(379, 53, 47, 47);
		contentPane.add(btndot);
		
		JButton btndiv = new JButton("/");
		btndiv.setBackground(new Color(211, 211, 211));
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = textField.getText();
				operator = btndiv.getText();
				textField.setText("");
			}
		});
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 19));
		btndiv.setForeground(new Color(255, 0, 0));
		btndiv.setBounds(379, 111, 47, 47);
	
		contentPane.add(btndiv);
		
		JButton btnplus = new JButton("+");
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnplus.setForeground(new Color(255, 0, 0));
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = textField.getText();
				operator = btnplus.getText();
				textField.setText("");
			}
		});
		btnplus.setBounds(379, 223, 47, 85);
		contentPane.add(btnplus);
		
		JButton btnper = new JButton("%");
		btnper.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnper.setForeground(new Color(255, 0, 0));
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				firstnumber = textField.getText();
				operator = btnper.getText();
				secondnumber = textField.getText();
				operator = btnper.getText();
				textField.setText("");
			}
		});
		btnper.setBounds(82, 276, 89, 32);
		contentPane.add(btnper);
		
		JButton btne = new JButton("=");
		btne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnumber = textField.getText();
				thirdnumber = textField.getText();
				Double result;
				
				//for Plus
				if(operator.equals("+"))
				{		
					result = Double.parseDouble(firstnumber) + Double.parseDouble(secondnumber);
					textField.setText(result.toString());
				}
			
				//for Divide
				if(operator.equals("/"))
				{		
					result = Double.parseDouble(firstnumber) / Double.parseDouble(secondnumber);
					textField.setText(result.toString());
				}
				
				//for minus
				if(operator.equals("-"))
				{
					result = Double.parseDouble(firstnumber) - Double.parseDouble(secondnumber);
					textField.setText(result.toString());
				}
				
				//for multiply
				if(operator.equals("*"))
				{
					result = Double.parseDouble(firstnumber) * Double.parseDouble(secondnumber);
					textField.setText(result.toString());
				}
				
				//for percentage
				if(operator.equals("%"))
				{
					result = Double.parseDouble(firstnumber) * Double.parseDouble(secondnumber) / Double.parseDouble(secondnumber);
					textField.setText(result.toString());
				}
				
			}
		});
		btne.setFont(new Font("Tahoma", Font.BOLD, 25));
		btne.setForeground(new Color(255, 0, 0));
		btne.setBounds(181, 276, 89, 32);
		contentPane.add(btne);
		
		JButton btnmin = new JButton("-");
		btnmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = textField.getText();
				operator = btnmin.getText();
				textField.setText("");
				
			}
		});
		btnmin.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnmin.setForeground(new Color(255, 0, 0));
		btnmin.setBounds(280, 276, 89, 32);
		contentPane.add(btnmin);
		
		JButton btnmulti = new JButton("*");
		btnmulti.setBackground(new Color(211, 211, 211));
		btnmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = textField.getText();
				operator = btnmulti.getText();
				textField.setText("");
			}
		});
		btnmulti.setForeground(Color.RED);
		btnmulti.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnmulti.setBounds(379, 165, 47, 47);
		contentPane.add(btnmulti);
		
		
		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnc.setForeground(new Color(255, 0, 0));
		btnc.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnc.setBackground(Color.BLACK);
		btnc.setBounds(82, 221, 89, 47);
		contentPane.add(btnc);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//	firstnumber = textField.getText();
				textField.setText(textField.getText().concat(btn0.getText()));
			}
		});
		btn0.setForeground(Color.GREEN);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 25));
		btn0.setBackground(Color.BLACK);
		btn0.setBounds(181, 221, 89, 47);
		contentPane.add(btn0);
		
		JButton btnd = new JButton("Del");
		btnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s  = textField.getText();
				if(s.length() > 0)
					textField.setText(s.substring(0, s.length()-1));
			}
		});
		btnd.setForeground(new Color(255, 0, 0));
		btnd.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnd.setBackground(Color.BLACK);
		btnd.setBounds(280, 221, 89, 47);
		contentPane.add(btnd);
	}
}
