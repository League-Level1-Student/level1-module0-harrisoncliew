/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
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
import javax.swing.JPanel;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String internet = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Flag_of_Eswatini.svg/1280px-Flag_of_Eswatini.svg.png";
		// 2. create a variable of type "Component" that will hold your image
                Component one =  createImage(internet);

		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
                JPanel panel = new JPanel();
                quizWindow.add(one);

		// 5. call the pack() method on the quiz window
                quizWindow.pack();

		// 6. ask a question that relates to the image
                String hm = JOptionPane.showInputDialog("Which country matches this flag?");
                

		// 7. print "CORRECT" if the user gave the right answer
                if(hm.equalsIgnoreCase("Swaziland")) {
                	JOptionPane.showMessageDialog(null, "Correct!");
                }
                else if(hm.equalsIgnoreCase("Eswatini")) {
                	JOptionPane.showMessageDialog(null, "Correct!");
                }
                else {
                	JOptionPane.showMessageDialog(null, "WRONG!");
                }
                

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
                quizWindow.remove(one);
		// 10. find another image and create it (might take more than one line of code)
                String internet2 = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Flag_of_Burkina_Faso.svg/1280px-Flag_of_Burkina_Faso.svg.png";
                Component two = createImage(internet2);
                quizWindow.add(two);
		// 11. add the second image to the quiz window

		// 12. pack the quiz window
                quizWindow.pack();
                	
        // 13. ask another question
               String flag =  JOptionPane.showInputDialog("What country matches this flag?");

		// 14+ check answer, say if correct or incorrect, etc.
               if(flag.equalsIgnoreCase("Burkina Faso")) {
            	   JOptionPane.showMessageDialog(null, "Correct!");
               }
               else {
            	   JOptionPane.showMessageDialog(null, "WRONG!");
               }
               quizWindow.remove(two);
               String internet3 = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/84/Flag_of_Uzbekistan.svg/1920px-Flag_of_Uzbekistan.svg.png";
               Component three = createImage(internet3);
               quizWindow.add(three);
               quizWindow.pack();
               String win = JOptionPane.showInputDialog("What country matches this flag?");
               if(win.equalsIgnoreCase("Uzbekistan")) {
            	   JOptionPane.showMessageDialog(null, "Correct!");
               }
               else {
            	   JOptionPane.showMessageDialog(null, "WRONG!");
               }
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





