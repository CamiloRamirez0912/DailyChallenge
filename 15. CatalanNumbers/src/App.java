import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the catalan number you want: ");
        int number = sc.nextInt();
        System.out.println("The catalan number " + number + " is: " + catalan(number));

        sc.close();
    }


    public static int catalan(int number) {
        int result = 0;
        if (number == 0 || number == 1) {
            return 1;
        } else {
            for (int i = 0; i < number; i++)
                result += catalan(i) * catalan(number-1-i);
        }

        return result;
    }
}
