import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        @SuppressWarnings("unchecked")
        ArrayList<Integer> digits = numberDivisors(number);

        if (isPerfect(digits, number)) 
            System.out.println("The number " + number + " is a perfect number :)");
        else
            System.out.println("The number " + number + " is not a perfect number :)");
        


        sc.close();
    }

    @SuppressWarnings("rawtypes")
    public static ArrayList numberDivisors(int number){
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number%i==0) {
                digits.add(i);
            }
        }
        return digits;
    }

    public static boolean isPerfect(ArrayList<Integer> digits, int number){
        boolean isPerfect = false;
        int result = 0;
        for (int i = 0; i<digits.size(); i++) {
            result += digits.get(i);
        }
        if (result==number) {
            isPerfect = true;
        }

        return isPerfect;
    }
}
