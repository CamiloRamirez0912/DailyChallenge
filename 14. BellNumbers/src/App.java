import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the bell number you want: ");
        int number = sc.nextInt();
        System.out.println("The " + number + " bell number is: " + bell(number));

        sc.close();
    }

    public static int factorial(int number) {
        int result = 1;
        if (number ==0) 
            return 1;
        else{
            for (int i = 1; i <= number; i++) 
                result*=i;
        }

        return result;
    }

    public static int combination(int number, int combinations){
        return factorial(number) / (factorial(combinations) * factorial(number - combinations));
    }

    public static int bell(int number) {
        int result = 0;
        if (number == 0 || number == 1) {
            return 1;
        }else{
            for (int i = 0; i < number; i++)
                result += combination(number - 1, i) * bell(i);
        }
        
        return result;
    }
}
