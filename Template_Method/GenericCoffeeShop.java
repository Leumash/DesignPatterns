public class GenericCoffeeShop {
    public static void main(String[] args) {
        CaffeineDrink coffee = new Coffee();
        System.out.println("Preparing Coffee");
        coffee.prepareRecipe();
        System.out.println("");

        CaffeineDrink blackCoffee = new BlackCoffee();
        System.out.println("Preparing Black Coffee");
        blackCoffee.prepareRecipe();
        System.out.println("");

        CaffeineDrink tea = new Tea();
        System.out.println("Preparing Tea");
        tea.prepareRecipe();
        System.out.println("");
    }
}

