public abstract class CaffeineDrink {
    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (shouldAddCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    final private void boilWater() {
        System.out.println("Boiling Water");
    }

    final private void pourInCup() {
        System.out.println("Pouring drink into cup");
    }

    protected boolean shouldAddCondiments() {
        return true;
    }
}

