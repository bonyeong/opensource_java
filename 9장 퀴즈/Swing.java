import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel{
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		this.setLayout(new FlowLayout());
		this.add(new JButton("Open"));
		this.add(new JButton("Read"));
		this.add(new JButton("Close"));
	}	
}

class CenterPanel extends JPanel{
	public CenterPanel() {
		
	 this.setLayout(null);
	 
	 JLabel la = new JLabel("Love");
	 la.setLocation(30, 50);
	 la.setSize(200,20);
	 this.add(la);
	 
	 JLabel la2 = new JLabel("Hello");
	 la2.setLocation(100, 70);
	 la2.setSize(150, 30);
	 this.add(la2);
	 
	 JLabel la3 = new JLabel("Java");
	 la3.setLocation(70, 150);
	 la3.setSize(100, 70);
	 this.add(la3);
	}
}

public class Swing extends JFrame {
	public Swing(){
		setTitle("Opne Challenge 9");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30, 20));
		
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new NorthPanel(), BorderLayout.NORTH);
		
		setSize(500, 500); 
		setVisible(true); 

	}
	
	public static void main(String[] args) {
		new Swing();
		}

}
