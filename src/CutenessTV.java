import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.*;
public class CutenessTV implements ActionListener{
public static void main(String[] args) {
	
}
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();

void setup() {
	button1.setText("Frog Video");
	button2.setText("Duck Video");
	button3.setText("Fluffy Unicorn Video");
}
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed==button1) {
		showFrogs();
	}
	if(buttonPressed==button2)
	
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
