
/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Declare at least four balls, four bubbles, and four
     * snowflakes as instance variables. I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */

    Ball b1;
    Ball b2;
    Ball b3;
    Ball b4;
    Bubble bb1;
    Bubble bb2;
    Bubble bb3;
    Bubble bb4;
    Snowflake s1;
    Snowflake s2;
    Snowflake s3;
    Snowflake s4;
    // whether the ball is stopped or not, helps when using the mousepressed method to stop the balls
    boolean b1s;
    boolean b2s;
    boolean b3s;
    boolean b4s;
    

    public void settings() {
        size(500, 500);
    }

    /*
     * SUMMATIVE REQUIRED Initialize the balls, bubbles, and snowflakes using your
     * constructors inside of setup(). You must use a non-default-constructor at
     * least once and a default constructor at least once for each type.
     * 
     * I have done the first ball for you.
     */
    public void setup() {
        frameRate(10);
        b1 = new Ball(this,  250,  250, 10, 255, 1, 1);
        b2 = new Ball(this);
        b3 = new Ball(this);
        b4 = new Ball(this);
        bb1 = new Bubble(this);
        bb2 = new Bubble(this);
        bb3 = new Bubble(this);
        bb4 = new Bubble(this);
        s1 = new Snowflake(this);
        s2 = new Snowflake(this);
        s3 = new Snowflake(this);
        s4 = new Snowflake(this);

        
    }

    public void draw() {
        background(100);

        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */
        b1.drawBall();
        b1.moveBall();
        b2.drawBall();
        b2.moveBall();
        b3.drawBall();
        b3.moveBall();
        b4.drawBall();
        b4.moveBall();
        

        bb1.drawBubble();
        bb1.moveBubble();
        bb2.drawBubble();
        bb2.moveBubble();
        bb3.drawBubble();
        bb3.moveBubble();
        bb4.drawBubble();
        bb4.moveBubble();


        s1.drawSnowflake();
        s1.moveSnowflake();
        s2.drawSnowflake();
        s2.moveSnowflake();
        s3.drawSnowflake();
        s3.moveSnowflake();
        s4.drawSnowflake();
        s4.moveSnowflake();



        
    }

    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }


    public void mousePressed(){
      System.out.println("useX is: " + b1.useX + "mouseX is: " + mouseX + "mouseY is: " + mouseY);
    if (mouseX > b1.useX - b1.getRadius() && mouseX < b1.useX + b1.getRadius() && mouseY > b1.useY - b1.getRadius() && mouseY < b1.useY + b1.getRadius()){

      b1.stop();
      b1s = true;
      System.out.println("BALL 1 ");
      

    }
    
    if (mouseX > b2.useX - b2.getRadius() && mouseX < b2.useX + b2.getRadius() && mouseY > b2.useY - b2.getRadius() && mouseY < b2.useY + b2.getRadius()){

      b2.stop();
      b2s = true;
      System.out.println("BALL 2!");

    }
    
    if (mouseX > b3.useX - b3.getRadius() && mouseX < b3.useX + b3.getRadius() && mouseY > b3.useY - b3.getRadius() && mouseY < b3.useY + b3.getRadius()){

      b3.stop();
      b3s = true;
      System.out.println("BALL 3!");

    }
    
    if (mouseX > b4.useX - b4.getRadius() && mouseX < b4.useX + b4.getRadius() && mouseY > b4.useY - b4.getRadius() && mouseY < b4.useY + b4.getRadius()){

      b4.stop();
      b4s = true;
      System.out.println("BALL 4!");

    }




    }
    public void mouseReleased(){
        if (b1s == true) {
          b1.start();
          b1s = false;

        }
        if (b2s == true){
          b2.start();
          b2s = false;
        }
        if (b3s == true){
          b3.start();
          b3s = false;
        }
        if (b4s == true){
          b4.start();
          b4s = false;
        }

        
      




    }
    /*
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
