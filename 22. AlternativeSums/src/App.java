import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write how many numbers you want to alternative sum: ");
        int number = sc.nextInt();
        System.out.println("The result is: " + sum(number));
        sc.close();
    }

    public static int sum(int number){
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (i%2==0)
                result -= i;
            else
                result += i;
        }
        return result;
    }
}
