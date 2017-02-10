import java.util.*;

public class NewspaperSubscription implements INewspaperSubscription {
    Set<ISubscriber> moneyMakers = new HashSet();

    @Override
    public boolean registerSubscriber(ISubscriber sub) {
        System.out.println("Registering Subscriber: " + sub.getName());
        if (moneyMakers.contains(sub)) {
            return false;
        }

        moneyMakers.add(sub);
        return true;
    }

    @Override
    public boolean removeSubscriber(ISubscriber sub) {
        System.out.println("Removing Subscriber: " + sub.getName());
        if (!moneyMakers.contains(sub)) {
            return false;
        }

        moneyMakers.remove(sub);
        return true;
    }

    @Override
    public void notifySubscribers(String news) {
        System.out.println("Notifying Subscribers that: " + news);
        for (ISubscriber sub : moneyMakers) {
            sub.update(news);
        }
    }
}

