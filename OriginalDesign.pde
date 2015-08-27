


Diam diam = new Diam();
int diameter;
int grow;
int cirX;
int cirY;
int i;
boolean locked=true;



void setup(){
	size(512, 512);
	background(0);

}

void draw(){
	display();
	if (locked==false) {
		diam.update(diameter);
		diameter=diameter+grow;
	} 

	
}


void display() {
	println(locked);
}

void mousePressed() {
	
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
	void update(int y) {
		fill ((int)(Math.random()*y),255-y,y);
		ellipse(cirX,cirY,y,y);
	}
}
	


