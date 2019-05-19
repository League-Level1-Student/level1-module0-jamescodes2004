int X=300;
int Y=300;
int Xspeed=3;
int Yspeed=3;
int score;
int r=(int)random(0,25);
int Z=X-25;
import ddf.minim.*;
Minim minim;
AudioSample sound;
void setup(){
size(600, 600);
background(188,143,143);
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
}

void draw(){
  
      background(188,143,143);
      fill(0,0,0);
      text("score is " + score, 450, 50);
      textSize(25);
fill(255,0,0);
stroke(0,0,0);
ellipse(X, Y, 15, 15);
  X=X+Xspeed;
  if(X>600){
    Xspeed=-Xspeed;}
  Y=Y+Yspeed;
    if(X<0){
    Xspeed=-Xspeed;}
  Y=Y+Yspeed;
  if(Y>600){
    sound.trigger();
    Yspeed=-Yspeed;}
  Y=Y+Yspeed;
  if(Y<0){
    sound.trigger();
    Yspeed=-Yspeed;}
rect(mouseX, 590, 50, 10);
rect(Z, 0, 50, 10);
if(r==10){
  Z=Z+51;}
if(r==11){
  Z=Z-51;}
 if (X>Z && X<Z+50 && Y>=600){
       fill(0,0,0);
      text("YOU WIN", 200, 300);
      textSize(100);
    Xspeed=0;
      Yspeed=0;}
  if (X<mouseX+50 && X>mouseX && Xspeed<0 && Y>=590){
    Xspeed=-Xspeed;
  }
    if (X<mouseX+25 && X>mouseX && Xspeed>0 && Y>=590){
    Xspeed=-Xspeed;
    }
    if (X>mouseX && X<mouseX+50 && Y>=600){
      score=score+1;}
     if (X<mouseX && Y>=600 || X>mouseX+50 && Y>=600){
      fill(0,0,0);
      text("Game Over", 200, 300);
      textSize(100);
      Xspeed=0;
      Yspeed=0;}
}


     
