package builderPattern;

/**
 * Created by rohanrampuria on 4/16/17.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
