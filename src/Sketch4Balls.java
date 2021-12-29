import processing.core.PApplet;

public class Sketch4Balls extends PApplet {
    public static final int width=640;
    public static final int height=400;
    int x=0;
    public static void main(String[] args) {
        PApplet.main("Sketch4Balls",args);

    }
    public void settings()
    {
        super.settings();
        size(width,height);
    }
    public void setup()
    {

    }
    public void draw()
    {
        drawBall(x,height/5);//First Ball
        drawBall(2*x,2*(height/5)); //Second Ball
        drawBall(3*x,3*(height/5)); //Third Ball
        drawBall(4*x,4*(height/5)); //Fourth Ball
        x++;
    }
    public void drawBall(int x,int y)
    {
        ellipse(x,y,10,10);
    }

}