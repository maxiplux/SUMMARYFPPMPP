package myJFrame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1 = new JButton("Red"), b2 = new JButton("Green"), b3 = new JButton("Blue"), b4 = new JButton("Yellow"),
			b5 = new JButton("Pink");

	public FlowLayoutTest1() {
		setTitle("FlowLayout Test");
		setBounds(0, 0, 400, 100);
		b1.setSize(110, 120);
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		FlowLayoutTest1 f = new FlowLayoutTest1();
		f.setVisible(true);
	}
}
