int angle = 0;
PImage pictureOfRecord; 
import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable

void setup(){
    //as member variable
size(958,886);     //in setup method  
pictureOfRecord= loadImage("pictureOfRecord.png");
//in setup method  
//in draw method
minim = new Minim(this);  //in the setup method
song = minim.loadFile("391538__mativve__cheerful-song.wav");
song.play();
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);

}




void draw(){

if (mousePressed){
  angle++;
song.play();
}
else{
  song.pause();}

rotateImage(pictureOfRecord, angle);
    image(pictureOfRecord, 0, 0);


  
}