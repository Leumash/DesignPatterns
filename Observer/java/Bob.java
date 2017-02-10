public class Bob implements ISubscriber {
    @Override
    public String getName() {
        return "Bob";
    }

    @Override
    public void update(String news) {
        System.out.println("Bob read: " + news);
    }
}
