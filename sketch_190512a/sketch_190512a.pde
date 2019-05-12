int y = 0;
int randomNumber = (int) random(0, 400);
int score = 0;
void setup(){
  size(400, 600);
  background(135,206,250);

}

void draw(){
  background(135,206,250);
  fill(65, 105, 225);
  stroke(0, 0, 0);
  ellipse(randomNumber, y, 10, 10);
    rect(mouseX, 580, 20,20);
  fill(255, 0, 0);

y+=5;
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
if(y==600){
y=0;
  checkCatch(randomNumber);
randomNumber = (int) random(0, 400);

}
if (score%10==0 && score>1){
 y=y+5;
}

  }
  
  

    void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
