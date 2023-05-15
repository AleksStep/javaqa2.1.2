import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sr = new Scanner(System.in);
//        System.out.print("Enter sum: ");
//        int replenishment = sr.nextInt();
        int replenishment = 40000;
        int amountNow = 100 + replenishment;
        if (amountNow > 1_000)
        {
          int bonus = replenishment / 100;
          amountNow += bonus;
          System.out.println("Bonus = " + bonus );
        }
        System.out.println("Total amount = " + amountNow);
    }
}