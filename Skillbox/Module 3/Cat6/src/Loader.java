public class Loader {
    public static void main(String[] args) {
        Cat persik = getKitten();
        persik.setColor(Color.GOLDEN);

        System.out.println(persik.getColor());

        System.out.println(Cat.getCount());
    }

    private static Cat getKitten() {
        return new Cat(1100.0);
    }
}