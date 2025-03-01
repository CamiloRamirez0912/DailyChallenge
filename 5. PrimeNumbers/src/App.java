import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the number: ");
        int number = sc.nextInt();
        if (primeNumber(number)) {
            System.out.println("The number " + number + " is a prime number :)");
        }else{
            System.out.println("The number " + number + " is not a prime number :(");
        }
        sc.close();
    }


    public static boolean primeNumber(int number){
        boolean isPrime = false;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            int result = number%i;
            if (result==0) {
                count++;
                System.out.println(i + " divides " + number);
            }
        }
        if (count<=2)
            isPrime = true;

        return isPrime;
    }
}
