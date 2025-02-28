import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the fibonacci number you want: ");
        int number = sc.nextInt();
        if (number<=0) {
            System.out.println("The number must be greater than 0.");
        }else{
            System.out.println("The " + number + "-th fibonacci number is: " + fibo(number));
        }
        
        sc.close();
    }

    // the same method, but doesnt have size restictions
    public static BigInteger fibo(int number){
        if (number == 1)
            return BigInteger.ZERO;
        else if (number == 2) 
            return BigInteger.ONE;
        else {
            BigInteger a = BigInteger.ZERO;
            BigInteger b = BigInteger.ONE;
            for (int i = 2; i < number; i++) {
                BigInteger temp = a.add(b);
                a = b;
                b = temp;
            }
            return b;
        }
    }
    
    /* 
        public static int fibo(int number){
            if (number == 1)
                return 0;
            else if (number == 2) 
                return 1;
            else {
                int a = 0;
                int b = 1;
                for (int i = 2; i < number; i++) {
                    int temp = a + b;
                    a = b;
                    b = temp;
                }
                return b;
            }
        }
    */
    




}
