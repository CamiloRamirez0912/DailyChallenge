import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        System.out.println("The Hofstadter number is: " + holf(number));
        sc.close();
    }

    public static int holf(int number){
        int result = 1;
        if (number<=1 || number == 2) 
            result = 1;
        else
            result = holf(number - holf(number-1)) + holf(number - holf(number-2));
        
        return result;
    }
}
