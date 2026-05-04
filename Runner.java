import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int num = input.nextInt();

        Towers game = new Towers(num);

        System.out.println("\nSteps to solve Towers of Hanoi:\n");

        game.solve();

        input.close();
    }
}