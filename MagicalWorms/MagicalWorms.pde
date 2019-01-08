void setup() {
  size(800, 800);
  background(0,0,0);
}
void draw() {
  int num=(int)random(780);
  int num2 = (int)random(780);
  int x = num2;
  int y =num;
  makeMagical();
  for (int i=0; i<300; i++) {
    fill(25,255,5);
    ellipse(getWormX(i),getWormY(i),10,10);
  
    
    
    
  
}
}
float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}