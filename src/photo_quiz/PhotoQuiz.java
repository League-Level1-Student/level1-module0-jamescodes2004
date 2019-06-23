package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
	
		// 2. create a variable of type "Component" that will hold your image
Component image;
		// 3. use the "createImage()" method below to initialize your Component
image = createImage("https://snworksceo.imgix.net/ids/5c0681b0-9f32-4e92-b6e1-3c6f91af41da.sized-1000x1000.jpg?w=1000");
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String input1 = JOptionPane.showInputDialog(null, "Is this person skinny");
		// 7. print "CORRECT" if the user gave the right answer
if (input1.equalsIgnoreCase("yes")){
	JOptionPane.showMessageDialog(null, "CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
if (input1.equalsIgnoreCase("no")) {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
int score=0;
if (input1.equalsIgnoreCase("yes")){
	score++;
}
JOptionPane.showMessageDialog(null, "Your score is now " + score);

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
Component image1;
		// 11. add the second image to the quiz window
image1=createImage("http://cliparts.co/cliparts/kTM/b8k/kTMb8k7zc.jpg");
quizWindow.add(image1);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String input2= JOptionPane.showInputDialog(null, "Is this person skinny?");
if (input2.equalsIgnoreCase("no")){
	JOptionPane.showMessageDialog(null, "CORRECT");
}
if (input2.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
if (input2.equalsIgnoreCase("no")){
	score++;
}
JOptionPane.showMessageDialog(null, "Your score is now " + score);
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz

	
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
