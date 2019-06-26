import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	
	JButton button1 = new JButton();

	JButton button2 = new JButton();

	JButton button3 = new JButton();
	
	JPanel panel = new JPanel();

		public void showButton() {
			System.out.println("Button clicked");
	JFrame frame = new JFrame();
	frame.add(panel);
frame.setVisible(true);

panel.add(button1);
panel.add(button2);
panel.add(button3);

button1.addActionListener(this);
button2.addActionListener(this);
button3.addActionListener(this);
JLabel label1 = new JLabel();
label1.setText("Duck Song!");
button1.add(label1);
JLabel label2 = new JLabel();
label2.setText("Frog boi");
button2.add(label2);
JLabel label3 = new JLabel();
label3.setText("Unicrons?");
button3.add(label3);
frame.pack();
}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource().equals(button1)) {
				showDucks();
				}
			if (e.getSource().equals(button2)) {
				showFrog();
			}
			if (e.getSource().equals(button3)) {
				showFluffyUnicorns();
			}
		}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
void showDucks() {
	playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}
	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}
	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}}
