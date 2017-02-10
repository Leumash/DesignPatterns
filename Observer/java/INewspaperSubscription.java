public interface INewspaperSubscription {
    boolean registerSubscriber(ISubscriber sub);
    boolean removeSubscriber(ISubscriber sub);
    void notifySubscribers(String news);
}

