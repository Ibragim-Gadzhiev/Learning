public class Cat {
    private double originWeight;
    private double weight;
    private double feedAmount;
    private double minWeight;
    private double maxWeight;
    private static int count = 0;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        feedAmount = 0.0;
        count++;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        if (isAlive()) {
            feedAmount += amount;
            weight = weight + amount;
        } else
            System.out.println("Cat is dead or exploded :c");
    }

    public void drink(Double amount) {
        if (isAlive())
            weight = weight + amount;
         else
            System.out.println("Cat is dead or exploded :c");
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            count--;
            return "Dead";
        } else if (weight > maxWeight) {
            count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public double getFeedAmount() {
        return feedAmount;
    }

    public void pee() {
        if (isAlive()) {
            weight--;
            System.out.println("The cat pissed on your slippers again");
        } else
            System.out.println("Cat is dead or exploded :c");
    }

    public static int getCount() {
        return count;
    }

    private boolean isAlive() {
        return !(getStatus().equals("Dead") || getStatus().equals("Exploded"));
    }
}