import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the motzkin number you want: ");
        int number = sc.nextInt();
        System.out.println("The " + number + " motzkin number is: " + motzkin(number));

        sc.close();
    }

    public static int motzkin(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int sum = 0;
        for (int k = 0; k <= number - 2; k++) {
            sum += motzkin(k) * motzkin(number - 2 - k);
        }

        return motzkin(number - 1) + sum;
    }
}
