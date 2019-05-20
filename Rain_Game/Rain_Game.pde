int drop2 = 0;
int drop = 0;
int score = 0;
int r = (int) random(800);
void checkCatch(int x){
     if (x > mouseX && x < mouseX+50)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }
void setup() {
  size(800,800);
  background(0,0,0);
}
void draw() {
  background(0,0,0);
  fill(3, 185, 255);
ellipse(r, drop2, 20, 20);
drop2+=12;
teleportDrop();
 
 
 if(r==mouseX){
   score++;
   
 }
 
  fill(3, 185, 255);
rect(mouseX, 750,  50,  50);
fill(3, 185, 255);
textSize(16);
text("Score: " + score, 20, 20);

}
void teleportDrop(){
  if(drop2>800) {
    drop2=0;
    r=(int) random(0,800);
}
}
