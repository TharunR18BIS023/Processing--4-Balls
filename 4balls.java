import processing.core.PApplet;

public class TryProcessing<n> extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int l=0,m=0,n=0,o=0;

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
        ellipse(l++,HEIGHT/5, DIAMETER,DIAMETER);
        ellipse(m+=2,2*HEIGHT/5, DIAMETER,DIAMETER);
        ellipse(n+=3,3*HEIGHT/5, DIAMETER,DIAMETER);
        ellipse(o+=4,4*HEIGHT/5, DIAMETER,DIAMETER);
    }
}
