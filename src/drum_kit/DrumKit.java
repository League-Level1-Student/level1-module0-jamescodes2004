package drum_kit;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel drumLabelWithImage;
	JLabel drumLabelWithImage2;
	public void run() throws MalformedURLException {

		// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame window = new JFrame();
		// 2. Make the frame visible and
		// set its default close operation to JFrame.EXIT_ON_CLOSE
window.setVisible(true);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3. Set the size of the frame
window.setSize(100, 100);
		// 4. Set the title of the frame
window.setTitle("window");
		// 5. Make a JPanel variable and initialize it using "new JPanel().
JPanel panel = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
window.add(panel);
		// 7. Download an image of a drum from the Internet. Drop it into your
		// Eclipse project under "default package".

		// 8. Put the name of your image file in a String variable.
String BigDrum = "Bassdrum.jpeg";
		// 9. Edit the next line to use your String variable
		drumLabelWithImage = createLabelImage(BigDrum);
		// 10. Add the image to the panel
panel.add(drumLabelWithImage);
		// 11. Set the layout of the panel to "new GridLayout()"
panel.setLayout(new GridLayout());
		// 12. call the pack() method on the frame. Run your program. Do you see
		// your drum image?
window.pack();
		// 13. add this mouse listener to drumLabelWithImage
drumLabelWithImage.addMouseListener(this);
		// 18. Add more images to make a drumkit. Remember to add this mouse
		// listener to each one.
JPanel panel1 = new JPanel();
window.add(panel1);
String Drum = "drum.png";
drumLabelWithImage2 = createLabelImage(Drum);
window.add(drumLabelWithImage2);
panel1.setLayout(new GridLayout());
window.pack();
drumLabelWithImage2.addMouseListener(this);
	}


	public void mouseClicked(MouseEvent e) {
		// 14. Print "mouse clicked" to the console. Run your program and watch
		// the console to see when this is printed.

		JLabel drumClicked = (JLabel) e.getSource(); // This line gets the label
														// that the mouse
														// clicked on

		// 15. Download a drum sound and drop it into your "default package".
		// You can find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.

		// 16. If they clicked on the drumImage...

		// 17. ...use the playSound method to play a drum sound. Test to see if
		// it works
if (drumClicked==drumLabelWithImage) {
	playSound("bassdrum.wav");
}
if (drumClicked == drumLabelWithImage) {
	playSound("drum1.wav");
}
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
