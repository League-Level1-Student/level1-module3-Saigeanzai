package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int x = 300;
    int y = 350;
	
	
	Car car1 = new Car(150, 175, 200, -6);
	Car car2 = new Car(250, 220, 200, 6);
	Car car3 = new Car(150, 250, 200, -6);
    
   
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(136, 186, 209);
    	fill(113, 184, 92);
    	ellipse(x, y, 30, 30);

    	car1.display(this);
    	car2.display(this);
    	
    	
    	if(intersects(car1)) {
    		y = 400;
    	}
    	if(intersects(car2)) {
    		y = 400;
    	}
    }
    	
    boolean intersects(Car car) {
   	 if ((y > car.getY() && y < car.getY()+50) &&
   	                (x > car.getX() && x < car.getX()+car.getSize())) {
   	   return true;
   	  }
   	 else  {
   	  return false;
   	 }
   }
    
   public  void keyPressed()
    {
	   if(y==400) {
		   y -= 5;
	   }
	   if(y==0) {
		   y += 5;
	   }
	   if(x==600) {
		   x -= 5;
	   }
	   if(x==0) {
		   x += 5; 
	   }
	   
        if(key == CODED){
            if(keyCode == UP)
            {
                y += 10;
            }
            else if(keyCode == DOWN)
            {
                y -= 10; 
            }
            else if(keyCode == RIGHT)
            {
                x += 10;
            }
            else if(keyCode == LEFT)
            {
                x -= 10;
            }
        }
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
