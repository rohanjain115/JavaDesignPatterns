package abstractFactoryPattern;

/**
 * Created by rohanrampuria on 3/22/17.
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}