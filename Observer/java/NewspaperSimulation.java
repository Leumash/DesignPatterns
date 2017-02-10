public class NewspaperSimulation {
    public static void main(String[] args) {
        INewspaperSubscription newspaper = new NewspaperSubscription();

        ISubscriber bob = new Bob();
        ISubscriber jill = new Jill();

        newspaper.registerSubscriber(bob);

        newspaper.notifySubscribers("I like pie.");

        newspaper.registerSubscriber(jill);

        newspaper.notifySubscribers("I REALLY like pie.");

        newspaper.removeSubscriber(bob);

        newspaper.notifySubscribers("Pie is taking over the world!");
    }
}

