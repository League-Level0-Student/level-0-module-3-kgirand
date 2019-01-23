import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
Robot rob = new Robot();
rob.setSpeed(200);
drawSquare(rob);
rob.penUp();
rob.move(100);
rob.penDown();
drawCircle(rob);
rob.penUp();
rob.move(100);
drawTriangle(rob);






	
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