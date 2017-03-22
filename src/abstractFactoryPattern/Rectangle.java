package abstractFactoryPattern;

/**
 * Created by rohanrampuria on 3/22/17.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}