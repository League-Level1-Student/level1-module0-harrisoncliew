import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
public class Houses {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.moveTo(100, 500);
		r2d2.miniaturize();
		r2d2.setSpeed(100);
		r2d2.penDown();
		for (int i = 0; i < 10; i++) {
			cool(r2d2, 33);
		}
	}	
	static void cool(Robot r, int height) {
		r.move(100);
		r.turn(90);
		r.move(30);
		r.turn(90);
		r.move(100);
		r.turn(-90);
		r.setPenColor(Color.GREEN);
		r.move(10);
		r.setPenColor(Color.black);
		r.turn(-90);
	}
}
