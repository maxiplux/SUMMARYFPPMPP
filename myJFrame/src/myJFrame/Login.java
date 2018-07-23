package myJFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
public class Login extends JFrame {
	
	JButton btnLogin = new JButton("Login");
	JButton	btnRegister = new JButton("Register");
	
	JLabel userName = new JLabel("Username");	
	JPasswordField Password = new JPasswordField(8);
 

	
	public Login() 
	{
		setTitle("Login Window");
		setBounds(0,  0,150, 150);
		btnLogin.setSize(50, 50);
		btnRegister.setSize(50, 50);
		
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		
		
		
		
		 pane.add(userName);
		 pane.add(Password);
		 
		 pane.add(btnLogin);
		 pane.add(btnRegister);
		 
		 pane.setLayout(null);  
		 
		 this.setSize(300,300);  
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
			


	public static void main(String args[]) 
	{
		Login f = new Login();
		f.setVisible(true);
	}
	

}
