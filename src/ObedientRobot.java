import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
Robot rob = new Robot();
String input = JOptionPane.showInputDialog("What color do you want your shapes to be? Pink, Green or Red");
if(input.equals("Pink")) {
	rob.setPenColor(Color.pink);
}
else if (input.equals("Green")) {
	rob.setPenColor(Color.green);
}
else if (input.equals("Red")) {
	rob.setPenColor(Color.red);
}
rob.setSpeed(200);
drawSquare(rob);
rob.penUp();
rob.move(200);
rob.penDown();
drawCircle(rob);
rob.penUp();
rob.turn(200);
rob.move(200);
drawTriangle(rob);
rob.penUp();
rob.move(100);
}



private static void drawSquare(Robot rob) {
	// TODO Auto-generated method stub
	for (int i = 0; i < 4; i++) {
		rob.penDown();
		rob.turn(90);
		rob.move(50);
	}
}
private static void drawCircle(Robot rob) {
	// TODO Auto-generated method stub
	for (int i = 0; i < 36; i++) {
		rob.penDown();
		rob.turn(10);
		rob.move(10);
	}
}
private static void drawTriangle(Robot rob) {
			// TODO Auto-generated method stub
			for (int i = 0; i < 4; i++) {
				rob.penDown();
				rob.turn(120);
				rob.move(65);
}
}
}