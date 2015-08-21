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

int x=250;
int y=250;

public void setup(){
	size(512, 512);

}

public void draw(){
	background(0);
	ball();
	xy();
}

public void ball() {
	ellipse (x,y, 50, 50);
	
}

public void xy() {
	if (x <= 0) {
		x++;
	} else {
		x--;
	}
	 

	if (y <= 0) {
		y++;
	} else if (y>500){
		y--;
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
