import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        System.out.println("The jacobsthal number is: " + jacobsthal(number));
        sc.close();
    }

    public static int jacobsthal(int number){
        int result = 0;
        if (number <= 0) {
            result = 0;
        }else if (number <= 1) {
            result = 1;
        }else{
            result = jacobsthal(number-1) + (2*jacobsthal(number-2));
        }

        return result;
    }
}
