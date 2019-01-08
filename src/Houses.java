import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
public class Houses {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.moveTo(100, 500);
		r2d2.miniaturize();
		r2d2.setSpeed(100);
		r2d2.penDown();
		cool(r2d2,"small", "magenta");
		cool(r2d2,"medium", "blue");
		cool(r2d2,"large", "red");
		cool(r2d2, "medium", "magenta");
		cool(r2d2, "large", "blue");
		cool(r2d2, "small", "red");
		cool(r2d2, "large", "magenta");
		cool(r2d2, "small", "blue");
		cool(r2d2, "medium", "red");
		
	}

	static void cool(Robot r, String height, String color ) {
		int cooler = 0;
		if(height.equalsIgnoreCase("small")) {
			cooler = 60;
		}
		else if (height.equalsIgnoreCase("medium")) {
			cooler=120;
		}
		else if (height.equalsIgnoreCase("large")) {
			cooler=250;
		}
		if(color.equals("magenta")) {
			r.setPenColor(Color.magenta);
		}
		else if(color.equals("blue")) {
			r.setPenColor(Color.blue);
		}
		else if(color.equals("red")) {
			r.setPenColor(Color.RED);
		}
		
		r.move(cooler);
		if (cooler==250) {
			drawFlatRoof(r);
		}
		else {
			drawPointyRoof(r);
		}
		
		r.move(cooler);
		r.turn(-90);
		r.setPenColor(Color.GREEN);
		r.move(10);
		if(color.equals("magenta")) {
			r.setPenColor(Color.magenta);
		}
		else if(color.equals("blue")) {
			r.setPenColor(Color.blue);;
		}
		else if(color.equals("red")) {
			r.setPenColor(Color.RED);
		}
		r.turn(-90);
	}
	static void drawPointyRoof(Robot r) {
		r.turn(45);
		r.move(15);
		r.turn(90);
		r.move(15);
		r.turn(45);
	}
	static void drawFlatRoof (Robot r) {
		r.turn(90);
		r.move(30);
		r.turn(90);
	}
}
