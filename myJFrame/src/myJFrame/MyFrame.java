package myJFrame;

import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class MyFrame extends JFrame {

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}

	MyFrame() {
		setTitle("Backgroung Changing");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();
		contentPane.setBackground(Color.blue);
		this.getContentPane().setBackground(Color.pink);

	}

}
