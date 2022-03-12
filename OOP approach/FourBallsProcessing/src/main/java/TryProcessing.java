import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 648;
    public static final int HEIGHT = 480;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        PopUp object=new PopUp();
        size(object.getWidth(), object.getHeight());
    }

    @Override
    public void draw() {
        FourBalls object=new FourBalls();
        drawBalls(object);
    }

    private void drawBalls(FourBalls object) {
        sketchBall(object.getFirstBallPosition(), object.getFirstBallHeight(), object.getDiameter());
        sketchBall(object.getSecondBallPosition(), object.getSecondBallHeight(), object.getDiameter());
        sketchBall(object.getThirdBallPosition(), object.getThirdBallHeight(), object.getDiameter());
        sketchBall(object.getFourthBallPosition(), object.getFourthBallHeight(), object.getDiameter());
        object.updateBallPositions();
    }

    private void sketchBall(int width, int height, int diameter) {
        ellipse(width,height,diameter,diameter);
    }
}
