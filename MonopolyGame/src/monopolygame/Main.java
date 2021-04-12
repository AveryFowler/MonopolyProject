import java.util.Random;

public class Main {
    static String[] chanceCards = new String[]{
            "Advance to \"Go\". (Collect $200)",
            "Advance to Trafalgar Square. If you pass Go, collect $200.",
            "Advance to Pall Mall. If you pass Go, collect $200.",
            "Advance token to the nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total 10 (ten) times the amount thrown.",
            "Advance to the nearest Railroad. If unowned, you may buy it from the Bank. If owned, pay owner twice the re tal to which they are otherwise entitled. If Railroad is unowned, you may buy it from the Bank.",
            "Bank pays you dividend of $50.",
            "Make general repairs on all your property: For each house pay $25, For each hotel $100.",
            "Pay poor tax of $15 ",
            "Take a ride to King’s Cross Station. If you pass Go, collect $200.",
            "You have been elected Chairman of the Board. Pay each player $50."
    };

    public static void main(String[] args) {
        Random random = new Random();
        pickAChanceCard(random);
    }

    public static void pickAChanceCard(Random random) {
        System.out.println(chanceCards[random.nextInt(chanceCards.length)]);
    }
}
