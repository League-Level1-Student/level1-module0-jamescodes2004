void setup(){
size (600, 600);
background(0,0,0);
 
  
  
  
  
  
  
}
void draw(){
 
   makeMagical();
  for (int i=0; i<600;i++){
   float x = random(0, 600);
   float y = random(0, 600);
    fill(250, 0, 0);
   ellipse(getWormX(i), getWormY(i), 5,5);
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

  
  
  
  
