package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {

JButton button1 = new JButton();

JButton button2 = new JButton();

JButton button3 = new JButton();

JButton button4 = new JButton();

JButton button5 = new JButton();

JButton button6 = new JButton();

JButton button7 = new JButton();

JButton button8 = new JButton();

JButton button9 = new JButton();

JButton button10 = new JButton();
JPanel panel = new JPanel();
	public void showButton() {
		
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		JLabel label1 = new JLabel();
		label1.setText("Airplane landing");
		button1.add(label1);
		JLabel label2 = new JLabel();
		label2.setText("Service Bell");
		button2.add(label2);
		JLabel label3 = new JLabel();
		label3.setText("Heavy Rain");
		button3.add(label3);
		JLabel label4 = new JLabel();
		label4.setText("Labrador Barking");
		button4.add(label4);
		JLabel label5 = new JLabel();
		label5.setText("Old Car Starting");
		button5.add(label5);
		JLabel label6 = new JLabel();
		label6.setText("UFO");
		button6.add(label6);
		JLabel label7 = new JLabel();
		label7.setText("Van Sliding Door");
		button7.add(label7);
		JLabel label8 = new JLabel();
		label8.setText("Harley Davidson");
		button8.add(label8);
		JLabel label9 = new JLabel();
		label9.setText("SOS Morse Code");
		button9.add(label9);
		JLabel label10 = new JLabel();
		label10.setText("Muscle Car");
		button10.add(label10);
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	button6.addActionListener(this);
	button7.addActionListener(this);
	button8.addActionListener(this);
	button9.addActionListener(this);
	button10.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)) {
			playSound("airplane-landing_daniel_simion.wav");}
		if (e.getSource().equals(button2)) {
			playSound("service-bell_daniel_simion.wav");}
		if (e.getSource().equals(button3)) {
			playSound("heavy-rain-daniel_simon.wav");}
		if (e.getSource().equals(button4)) {
			playSound("labrador-barking-daniel_simon.wav");}
		if (e.getSource().equals(button5)) {
			playSound("old-car-engine_daniel_simion.wav");}
		if (e.getSource().equals(button6)) {
			playSound("alien-spaceship_daniel_simion.wav");}
		if (e.getSource().equals(button7)) {
			playSound("van-sliding-door-daniel_simon.wav");}
		if (e.getSource().equals(button8)) {
			playSound("harley-davidson-daniel_simon.wav");}
		if (e.getSource().equals(button9)) {
			playSound("sos-morse-code_daniel-simion.wav");}
		if (e.getSource().equals(button10)) {
			playSound("muscle-car-daniel_simon.wav");}

	}


private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}}