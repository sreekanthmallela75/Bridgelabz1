package Demo;

public class RedBall extends GreenBall {

    @Override
    public String getColour() {
        return Colour;
    }

    @Override
    public Ball setColour(String colour) {
        Colour = colour;
        return null;
    }

    String Colour;
    public void redBall(int i){
        System.out.println("This is  redBall class");
    }
}

