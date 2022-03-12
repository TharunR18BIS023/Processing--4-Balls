import processing.core.PApplet;

public class TryProcessing<n> extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int ball1_position=0,ball2_position=0,ball3_position=0,ball4_position=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawCircle();
    }
    private void drawCircle() {
        ellipse(ball1_position++,HEIGHT/5, DIAMETER,DIAMETER);
        ellipse(ball2_position+=2,2*HEIGHT/5, DIAMETER,DIAMETER);
        ellipse(ball3_position+=3,3*HEIGHT/5, DIAMETER,DIAMETER);
        ellipse(ball4_position+=4,4*HEIGHT/5, DIAMETER,DIAMETER);
    }
}
