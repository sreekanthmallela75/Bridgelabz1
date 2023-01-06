package Demo;

public class BlueBall extends YellowBall {

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
    public void blueBall(int i){
        System.out.println("This is Blue Ball class");

    }
}


