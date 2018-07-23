package problem1;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class View extends JFrame {

	//// Defining JTextField
	private JTextField jtInput;
	private JTextField jtOutput;

	private JButton btnCountLetters;
	private JButton btnReverseLetters;
	private JButton btnRemoveDuplicates;

	public static final int DEFAULT_WIDTH = 450;
	public static final int DEFAULT_HEIGHT = 200;

	public View() {
		super("String Uitility");
		this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		this.getContentPane().setLayout(null);
		int factoX=30;
		int factoY=5;
		
		jtInput = new JTextField("");
		jtInput.setBounds(10*factoX, 10*factoY, 100, 20);
		
		
		
		jtOutput = new JTextField("");
		jtOutput.setBounds(10*factoX, 20*factoY, 100, 20);
		
		
		btnCountLetters = new JButton("Count Letters");
		btnCountLetters.setBounds(135, 10, 160, 25);
		
		btnReverseLetters = new JButton("Reverse Letters");
		btnReverseLetters.setBounds(135, 70, 160, 25);
		
		btnRemoveDuplicates = new JButton("Remove Duplicates");
		btnRemoveDuplicates.setBounds(135, 130, 160, 25);
		

		add(jtInput);
		add(jtOutput);		
		//////////////////
		add(btnCountLetters);
		add(btnReverseLetters);
		add(btnRemoveDuplicates);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnCountLetters.addActionListener(e ->
		  {
			  
			  String value=jtInput.getText();
			  jtOutput.setText(String.valueOf( Util.countLetters(value)));
		   
		  } );
		
		btnReverseLetters.addActionListener(e ->
		  {
		   
			  String value=jtInput.getText();
			  jtOutput.setText(String.valueOf( Util.reverseLetters(value)));
		  } );
		
		btnRemoveDuplicates.addActionListener(e ->
		  {
		   
			  String value=jtInput.getText();
			  jtOutput.setText(String.valueOf( Util.removeDuplicates(value)));
			  
		  } );


	}
	
	public static void main(String[] args) {
		View view = new View();
		view.show();

		 
		
	}


}
