package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class fortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");

		JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 JOptionPane.showMessageDialog(null, "Woohoo");
		 int rand = new Random().nextInt(5);
		 if (rand==0) {
			 JOptionPane.showMessageDialog(null, "You will live at least a few more minutes");
		 }
		 if (rand==1) {
			 JOptionPane.showMessageDialog(null, "You will loose at least a few grams of weight over your life");
		 }
		 if (rand==2) {
			 JOptionPane.showMessageDialog(null, "You will ace your next test");
		 }
		 if (rand==3) {
			 JOptionPane.showMessageDialog(null, "You are good");
		 }
		 if (rand==4) {
			 JOptionPane.showMessageDialog(null, "You will get off this computer eventually.");
		 }
	}}

