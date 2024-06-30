import java.util.Random;
import java.util.Scanner;

public class HeadsorTales {
  public static void main(String[] args) {
    Random rand = new Random();
    int par;
    int heads = 0;
    int tails = 0;
    Scanner sc = new Scanner(System.in);
    String user_name;

    System.out.println("Who are you?");
    System.out.print("> ");
    user_name = sc.next();
    System.out.println("Hello, " + user_name + "!");

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

    if (heads > tails) {
      System.out.println(user_name + " won!");
    } else {
      System.out.println(user_name + " lost.");
    }
  }

}
