import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input flight price: ");
        int price = in.nextInt();
        int coin = 20;

        int bonusMiles = price / coin;
        System.out.println("Your bonus miles: " + bonusMiles);

        in.close();
    }
}
