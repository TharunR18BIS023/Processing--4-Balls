public class FourBalls extends PopUp{
    public final int DIAMETER=10;
    private int ball_two_speed;
    private int ball_three_speed;
    private int ball_four_speed;
    private int ball_one_speed;
    private static int first_ball_position=0;
    private static int second_ball_position=0;
    private static int third_ball_position=0;
    private static int fourth_ball_position=0;

    public FourBalls() {
        this.ball_one_speed=1;
        this.ball_two_speed=2;
        this.ball_three_speed=3;
        this.ball_four_speed=4;
    }

    int getDiameter()
    {
        return DIAMETER;
    }

    public int getFirstBallHeight() {
        return 1*super.getHeight()/5;
    }

    public int getSecondBallHeight() {
        return 2*super.getHeight()/5;
    }

    public int getThirdBallHeight() {
        return 3*super.getHeight()/5;
    }

    public int getFourthBallHeight() {
        return 4*super.getHeight()/5;
    }

    public int getFirstBallPosition() {
        return this.first_ball_position;
    }

    public int getSecondBallPosition() {
        return this.second_ball_position;
    }

    public int getThirdBallPosition() {
        return this.third_ball_position;
    }

    public int getFourthBallPosition() {
        return this.fourth_ball_position;
    }

    public void updateBallPositions() {
        this.first_ball_position+=this.ball_one_speed;
        this.second_ball_position+=this.ball_two_speed;
        this.third_ball_position+=this.ball_three_speed;
        this.fourth_ball_position+=this.ball_four_speed;

    }
}
