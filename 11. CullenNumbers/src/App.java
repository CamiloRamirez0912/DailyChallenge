import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        System.out.println("The cullen number is: " + cullenNumber(number));

        sc.close();
    }

    public static double cullenNumber(int number){
        return number * (Math.pow(2, number)) + 1;
    }
}
