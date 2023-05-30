public class Cycle {
    public static void main(String[] args) {
        //for cycle
        for (int i = 200_000; i <= 210_000; i++) {
            System.out.println("Билет №" + i);
        } System.out.println("==============");

        for (int i = 220_000; i <= 235_000; i++) {
            System.out.println("Билет №" + i);
        } System.out.println("==============");

        //while cycle
        int count = 200_000;
        while (count <= 210_000) {
            System.out.println("Билет №" + count);
            count++;
        } System.out.println("==============");

        count = 220_000;
        while (count <= 235_000) {
            System.out.println("Билет №" + count);
            count++;
        } System.out.println("==============");
    }
}
