package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot timmy = new Robot(400, 700);
		Robot tammy = new Robot(500, 800);
		Robot sammy = new Robot(650, 600);
		
		timmy.setSpeed(50);
		tammy.setSpeed(50);
		sammy.setSpeed(50);
		
		timmy.penDown();
		timmy.setPenColor(Color.BLUE);
		
		tammy.penDown();
		tammy.setPenColor(Color.YELLOW);
		
		sammy.penDown();
		sammy.setPenColor(Color.BLACK);
		
		Thread r1 = new Thread(()-> {
			for (int i = 0; i < 180; i++) {
				timmy.move(5);
				timmy.turn(2);
			}
		});
		
		Thread r2 = new Thread(()->{
			for (int i = 0; i < 180; i++) {
				tammy.move(5);
				tammy.turn(2);
			}
		});
		
		Thread r3 = new Thread(()->{
			for (int i = 0; i < 180; i++) {
				sammy.move(5);
				sammy.turn(2);
			}
		});
		
		r1.start();
		r2.start();
		r3.start();
	}
}

