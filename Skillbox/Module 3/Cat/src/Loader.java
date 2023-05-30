import java.text.DecimalFormat;

public class Loader {
    public static void main(String[] args) {
        Cat persik = new Cat();
        persik.meow();

        Cat seledka = new Cat();
        System.out.println(seledka.getStatus());

        Cat pushok = new Cat();
        System.out.println(pushok.getWeight());

        Cat snezhok = new Cat();
        System.out.println("\nSnezhok weight before eating: " + new DecimalFormat("#.##").format(snezhok.getWeight()));
        snezhok.drink(1337.0);
        System.out.println("Snezhok weight after eating: " + new DecimalFormat("#.##").format(snezhok.getWeight()));
        System.out.println("Snezhok status: " + snezhok.getStatus());
        
        Cat vaska = new Cat();
        System.out.println("\nVaska weight before eating: " + new DecimalFormat("#.##").format(vaska.getWeight()));
        vaska.feed(42.0);
        System.out.println("Vaska weight after eating: " + new DecimalFormat("#.##").format(vaska.getWeight()));

        while (!snezhok.getStatus().equals("Exploded"))
            snezhok.feed(42.0);
        System.out.println("\nSnezhok weight: " + new DecimalFormat("#.##").format(snezhok.getWeight()));
        System.out.println("Snezhok status: " + snezhok.getStatus());

        while (!vaska.getStatus().equals("Dead"))
            vaska.meow();

        System.out.println("\nVaska weight: " + new DecimalFormat("#.##").format(vaska.getWeight()));
        System.out.println("Vaska status: " + vaska.getStatus());
    }
}