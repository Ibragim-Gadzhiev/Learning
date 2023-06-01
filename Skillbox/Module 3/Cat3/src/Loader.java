public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.feed(9000.0);

        cat.drink(1.0);
        System.out.println(cat.getStatus());
    }
}