package abstractFactoryPattern;

/**
 * Created by rohanrampuria on 3/22/17.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}