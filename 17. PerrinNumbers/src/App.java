import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();

        System.out.println("Result: " + perrin(number));
        sc.close();
    }

    public static int perrin(int number) {
        int result = 0;

        if (number == 0) {
            result = 3;
        } else if (number == 1) {
            result = 0;
        } else if (number == 2) {
            result = 2;
        } else {
            result = perrin(number - 2) + perrin(number - 3);
        }   

        return result;
    }
}
