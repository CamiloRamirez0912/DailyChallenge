import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        System.out.println("Tribonacci number: " + tribonacci(number));
        sc.close();
    }

    public static int tribonacci(int number){
        int result = 0;
        if(number <= 0){
            return 0;
        }else if ( number == 1) {
            return 1;
        }else{
            result = tribonacci(number - 1) + tribonacci(number - 2) + tribonacci(number - 3);
        }
        return result;
    }
}
