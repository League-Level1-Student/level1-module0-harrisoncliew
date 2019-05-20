int drop2 = 0;
int drop = 0;
int score = 0;
int r = (int) random(800);
void checkCatch(int x){
     if (x > mouseX && x < mouseX+50)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); 
   }
void setup() {
  size(800,800);
  background(0,0,0);
}
void draw() {
  background(0,0,0);
  fill(3, 185, 255);
  drop2+=12;
ellipse(r, drop2, 20, 20);

 
 

  fill(3, 185, 255);
rect(mouseX, 750,  50,  50);
fill(3, 185, 255);
textSize(16);
text("Score: " + score, 20, 20);
 if(drop2>=750){
  checkCatch(r);
   teleportDrop();
 }
 
}
void teleportDrop(){
  
    drop2=0;
    r=(int) random(0,800);


}
