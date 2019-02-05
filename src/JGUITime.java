/**
 * Text fields for name and number, displays info
 * @author jeremy
 * AP Comp Sci
 * Period 6
 *
 */

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class JGUITime
{
	public static void main(String[] args)
	{
		String name;
		String number;
		
		//window
		JFrame window = new JFrame("Name Number");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setBounds(300, 300, 525, 300);
		
		//fields
		JTextField nameField = new JTextField("Enter your name");
		nameField.setBounds(50, 50, 400, 30);
		JTextField numberField = new JTextField("Enter your phone number");
		numberField.setBounds(50, 90, 400, 30);
		
		//buttons
		JButton setInfoButton = new JButton("Set Info");
		setInfoButton.setBounds(50, 130, 150, 30);
		setInfoButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{	
						name = nameField.getText(); 
						number = numberField.getText();
					}
				}
		);
		
		//labels
		JLabel nameLabel = new JLabel();
		nameLabel.setBounds(50, 180, 150, 30);
		nameLabel.setText("Your name: ");
		
		window.add(nameField);
		window.add(numberField);
		window.add(setInfoButton);
		
		window.setVisible(true);
	}
}