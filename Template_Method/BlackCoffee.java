public class BlackCoffee extends CaffeineDrink {
    @Override
    public void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Milk and Sugar");
    }

    @Override
    public boolean shouldAddCondiments() {
        return false;
    }
}

