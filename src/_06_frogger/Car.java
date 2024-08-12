package _06_frogger;

import processing.core.PApplet;

public class Car {
	

	private int xPosition;
	private int yPosition;
	private int sizeOfCar;
	private int speedOfCar;



 Car(int xPosition, int yPosition, int sizeOfCar, int speedOfCar){
    	this.xPosition = xPosition;
    	this.yPosition = xPosition;
    	this.sizeOfCar = sizeOfCar;
    	this.speedOfCar = speedOfCar;
    }

void display(PApplet app)
{
 app.fill(0,255,0);
  app.rect(xPosition , yPosition,  sizeOfCar, 50);
}








}
