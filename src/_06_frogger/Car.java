package _06_frogger;

import processing.core.PApplet;

public class Car {
	static final int WIDTH = 600;

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
  xPosition -=speedOfCar;
  
  if(xPosition<-300) {
	  xPosition=600;
  }
  else if(xPosition>600) {
	  xPosition=-300;
  }
 
}

public int getX() {
	return xPosition;
}
public int getY() {
	return yPosition;
}
public int getSize() {
	return sizeOfCar;
}







}
