import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        System.out.println("The result is: " + golomb(number));
        sc.close();
    }

    public static int golomb(int number){
        int result = 1;
        if (number<=1) 
            result =1;
        else
            result = 1 + golomb(number-golomb(golomb(number-1)));
        
        return result;
    }
}
