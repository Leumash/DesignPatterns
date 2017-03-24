public class Tea extends CaffeineDrink {
    @Override
    public void brew() {
        System.out.println("Steeping leaves");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}

