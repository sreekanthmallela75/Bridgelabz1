package Demo;

public class YellowBall extends RedBall {

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public Ball setColour(String colour) {
        this.colour = colour;
        return null;
    }

    String colour;
    public void yellowBall(int i){
        System.out.println("This is Yellow Ball class");
    }
}


