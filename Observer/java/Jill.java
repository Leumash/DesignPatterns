public class Jill implements ISubscriber {
    @Override
    public String getName() {
        return "Jill";
    }

    @Override
    public void update(String news) {
        System.out.println("Jill read: " + news);
    }
}
