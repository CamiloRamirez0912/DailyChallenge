import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        System.out.println("The padovan number is: " + padovan(number));
        sc.close();
    }

    public static int padovan(int number){
        int result = 1;
        if (number <= 0 || number == 1 || number == 2)
            result = 1;
        else
            result = padovan(number-2) + padovan(number - 3);
        
        return result;
    }
}
