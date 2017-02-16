public class Espresso implements Beverage {
    @Override
    public double cost() {
        return 1.58;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}

