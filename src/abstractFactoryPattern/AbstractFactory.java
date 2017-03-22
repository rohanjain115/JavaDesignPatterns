package abstractFactoryPattern;

/**
 * Created by rohanrampuria on 3/22/17.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}