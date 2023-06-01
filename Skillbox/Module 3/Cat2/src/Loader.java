import java.text.DecimalFormat;

public class Loader {
    public static void main(String[] args) {
        Cat persik = new Cat();

        System.out.println("Persik weight before eating: " + new DecimalFormat("#.##").format(persik.getWeight()));
        persik.feed(150.0);
        System.out.println("Persik weight after eating: " + new DecimalFormat("#.##").format(persik.getWeight()));

        persik.pee();
        System.out.println("Persik weight after pee(): " + new DecimalFormat("#.##").format(persik.getWeight()));
        System.out.println("Persik ate " + persik.getFeedAmount() + " grams of feed");
    }
}