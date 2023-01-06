package Demo;

public class Bag   {
    private Ball[] balls = new Ball[12];
    private int count = 0;

    public Ball[] getBalls() {
        return balls;
    }

    public void addBalls(Ball balls) {
        this.balls[count++] = balls;
    }

}






