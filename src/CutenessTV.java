import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.*;
public class CutenessTV implements ActionListener{
public static void main(String[] args) {
	CutenessTV tv = new CutenessTV();
	tv.setup();
}
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JPanel panel = new JPanel();
JFrame frame = new JFrame();

void setup() {
	button1.setText("Frog Video");
	button2.setText("Duck Video");
	button3.setText("Fluffy Unicorn Video");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.pack();
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==button1) {
		showFrog();
	}
	if(buttonPressed==button2) {
		showDucks();
	}
	if(buttonPressed==button3) {
		showFluffyUnicorns();
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
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}
