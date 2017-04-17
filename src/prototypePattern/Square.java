package prototypePattern;

/**
 * Created by rohanrampuria on 4/16/17.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}