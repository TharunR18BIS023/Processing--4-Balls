import java.util.Scanner;

public class PopUp {
    private int width;
    private int height;
    Scanner scanner=new Scanner(System.in);
    int getWidth()
    {
        setWidth();
        return width;
    }
    private void setWidth() {
        this.width=648;
    }
    int getHeight()
    {
        setHeight();
        return height;
    }
    private void setHeight() {
        this.height=480;
    }
}
