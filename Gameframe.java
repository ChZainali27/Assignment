
import javax.swing.*;

public class GameFrame extends JFrame {
	/**
	 * 
	 */
	public GameFrame(){
		GamePanel panel=new GamePanel();
		this.add(panel);
		this.setTitle("SnAKE");
	    this.setDefaultCloseOperation(3);
	    this.setResizable(false);
	    this.pack();
	    this.setVisible(true);
	    this.setLocationRelativeTo(null);
		
	}

}
