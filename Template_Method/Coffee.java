public class Coffee extends CaffeineDrink {
    @Override
    public void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Milk and Sugar");
    }
}

