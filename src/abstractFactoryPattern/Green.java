package abstractFactoryPattern;

/**
 * Created by rohanrampuria on 3/22/17.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}