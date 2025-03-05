import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        System.out.println("The cube of the number " + number + " is: " + cubeOfANumber(number));
        sc.close();
    }

    public static int cubeOfANumber(int number){
        int result = 0;
        int firstOdd = number * number - (number - 1);

        for (int i = 0; i < number; i++) {
            result += firstOdd;
            firstOdd += 2; 
        }

        return result;
    }

}
