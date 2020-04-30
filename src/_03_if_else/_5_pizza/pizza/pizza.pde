PImage pepperoni;
void setup() {
pepperoni = loadImage("Pepperoni.jpg");

size(500, 500);  
}
void draw() {
fill(#C6923E);
ellipse(250, 250, 500, 500);
fill(#F72020);
ellipse(250, 250, 400, 400);
fill(#F2D114);
ellipse(250, 250, 300, 300);
image(pepperoni, 250, 250, 100, 100);
image(pepperoni, 300, 300, 100, 100);
image(pepperoni, 200, 100, 100, 100);
image(pepperoni, 150, 150, 100, 100);
image(pepperoni, 100, 100, 100, 100);
image(pepperoni, 50, 50, 100, 100);
}
