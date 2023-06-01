public class Loader {
    public static void main(String[] args) {
        Cat persik = getKitten();
        persik.setColor(Color.GOLDEN);
        persik.feed(150.0);

        System.out.println("Persik weight: " + persik.getWeight());
        System.out.println("Persik color: " + persik.getColor());


        Cat seledka = new Cat(persik);
        System.out.println("\nSeledka weight: " + seledka.getWeight());
        System.out.println("Seledka color: " + seledka.getColor());
    }

    private static Cat getKitten() {
        return new Cat(1100.0);
    }
}