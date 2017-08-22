package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot o = new Robot("mini");
	
	void go() {
// 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
o.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
int length = 50 ;
		// 7. Do the following (up to step 10) 60 times
for( int i =0 ; i < 60; length += 5) {
			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length of the side by 10 pixels

			// 5. call your drawTriangle() method using your length variable
	drawTriangle(length);
			// 10. Turn the tortoise 6 degrees to the right
o.turn(6);
}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		o.penDown();

		o.setSpeed(100);
		//turn
		o.turn(30);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		//turn
		o.turn(120);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		//turn
		o.turn(120);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		o.setRandomPenColor();
		o.setSpeed(100);
		o.move(length/20);
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
