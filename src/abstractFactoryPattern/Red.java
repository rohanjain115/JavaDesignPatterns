package abstractFactoryPattern;

/**
 * Created by rohanrampuria on 3/22/17.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}