import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {




Diam diam = new Diam();
int diameter;
int grow;
int cirX;
int cirY;
int i;
boolean locked=true;



public void setup(){
	size(512, 512);
	background(0);

}

public void draw(){
	display();
	if (locked==false) {
		diam.update(diameter);
		diameter=diameter+grow;
	} 

	
}


public void display() {
	println(locked);
}

public void mousePressed() {
	
	if (mouseButton == LEFT && locked == true) {
		locked=false;
		grow=1;
		cirX=mouseX;
		cirY=mouseY;
		redraw();
	} else if (mouseButton == RIGHT && locked == false) {
		locked=true;
		grow = 0;
		diameter = 0;
	}
}

class Diam {
	public void update(int y) {
		fill ((int)(Math.random()*y),255-y,y);
		ellipse(cirX,cirY,y,y);
	}
}
	


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
