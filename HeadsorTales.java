import java.util.Random;

public class HeadsorTales {
  public static void main(String[] args) {
    Random rand = new Random();
    int par;
    int heads = 0;
    int tails = 0;

    System.out.println("Tossing a coin...");
    for (int i = 1; i <= 3; i++) {
      par = rand.nextInt(2);
      if (par == 1) {
        System.out.println("Round " + i + ": Heads");
        heads++;
      } else {
        System.out.println("Round " + i + ": Tails");
        tails++;
      }
    }

    System.out.println("Heads: " + heads + ", Tails: " + tails);
  }

}
