package problem2;

import java.awt.*;

import javax.swing.*;

import problem1.Util;

public class Problem2 extends JFrame {
	String  database[][] = {{"red", "“Red signifies passion, vitality, enthusiasm and security"},
			{"orange", "The color orange is a combination of red and yellow. It is a bright and warm color. \n It represents fire, sun, fun, warmth and tropical surroundings. Orange is considered a fun, light color with appetizing and delicious qualities. It also increases the oxygen supply to the brain and stimulates mental activity."},
			{"green", "“Green is the color of nature and health. It represents growth, nature, money, fertility and safety. \nThe color green is a relaxing color that is pleasing to the eye and is said to have healing powers. It is often used to represent anything that has to do with health. "},
			{"blue", "Blue is a cool and calming color that shows creativity and intelligence. The color blue is a popular color among large companies, \nhospitals and airlines. It is a color that symbolizes loyalty, strength, wisdom and trust. Blue color meaning is also known to have a calming effect on the psyche. Blue is the color of the sky and the sea and is often used to represent these images. "},
			{"yellow", "It is the brightest color that the human eye can see. Yellow color meaning represents youth, fun, joy, \n sunshine and other happy feelings. It is a cheerful and energetic color. The color yellow is often used for children’s toys and clothes"},
			{"purple", "purple combines the stability of the blue color and the energy of the red. Through the ages, \n purple has always been associated with royalty, nobility and prestige. The color purple can symbolize mystery, magic, power and luxury. Purple color meaning is often used to portray rich powerful kings, leaders, magicians and even sorcerers. Purple combined with gold can be flashy and portray wealth and extravagance."},
			{"darkorchid", "this is  like purple combines the stability of the blue color and the energy of the red.  \n Through the ages, purple has always been associated with royalty, nobility and prestige. The color purple can symbolize mystery, magic, power and luxury. Purple color meaning is often used to portray rich powerful kings, leaders, magicians and even sorcerers. Purple combined with gold can be flashy and portray wealth and extravagance."},								
			}; 

	public String  getMessage(String name) 
	{
		for (String[] strings : database) 
		{
			String code=strings[0];
			if (code.equals(name))
			{
				return strings[1];				
			}
			
			
		}
		return "";
	}
	public Color getColor(String name) {
		switch (name) {
		case "red":
			return Color.RED;
		case "orange":
			return Color.ORANGE;
		case "green":
			return Color.GREEN;

		case "blue":
			return Color.BLUE;

		case "yellow":
			return Color.YELLOW;

		case "purple":
			return new Color(128, 0, 128);

		case "darkorchid":
			return new Color(153, 50, 204);

		default:
			return Color.WHITE;
		}

	}

	public Problem2() {

		setTitle("Rainbown Color Frame");
		setBounds(0, 0, 700, 100);
		
		

		setLayout(new FlowLayout(FlowLayout.CENTER));
		for (String[] strings : database) 
		{
			String name=strings[0];
			JButton  button = new JButton(name);
			button.setBackground(this.getColor(name));
			button.setForeground(this.getColor(name));
			
			
			
			button.setBorderPainted(false);
			button.setFocusPainted(false);

			button.setContentAreaFilled(false);
			button.setOpaque(true);
	        
			this.add(button);
			
			
			button.addActionListener(e ->
			  {
				  JButton  tmp_button = (JButton) e.getSource();
				  String value =tmp_button.getText(); 			
				  
				  
				  
				  
				  
					  
				  JOptionPane.showMessageDialog(null,getMessage(value) , "", 1);

			   
			  } );
			
			
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Problem2 f = new Problem2();
		f.setVisible(true);
	}
}
