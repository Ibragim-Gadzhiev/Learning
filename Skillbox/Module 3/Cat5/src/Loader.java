public class Loader {
    public static void main(String[] args) {
        Cat persik = getKitten();
        Cat seledka = getKitten();
        Cat snezhok = getKitten();

        System.out.println("Persik weight: " + persik.getWeight());
        System.out.println("Seledka weight: " + seledka.getWeight());
        System.out.println("Snezhok weight: " + snezhok.getWeight());
    }

    private static Cat getKitten() {
        return new Cat(1100.0);
    }
}