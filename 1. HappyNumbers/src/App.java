import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer number: ");
        int number =  sc.nextInt();
        int result = 0;
        HashSet<Integer> seenNumbers = new HashSet<>();
        do {
            char[] digits = divideDigits(number);
            result = isHappy(digits);

            if (result == 1) {
                System.out.println("Your number is a happy number :)");
                break;
            }

            if (seenNumbers.contains(result)) {
                System.out.println("Your number is not a happy number :(");
                break;
            }

            seenNumbers.add(result);
            number = result;

        } while (true);
        
        
        
        sc.close();
    }
        
    public static char[] divideDigits(int number){
        String numberStr = Integer.toString(number);
        char[] digits = new char[numberStr.length()];
        for (int i = 0; i <= digits.length-1; i++) {
            digits[i] = numberStr.charAt(i);
        }
        return digits;
    }

    public static int isHappy(char[] digits){
        int result = 0;
        for (int i = 0; i <= digits.length - 1; i++) {
            int numberParsed = Character.getNumericValue(digits[i]);
            result += (numberParsed*numberParsed);
        }
        return result;
    }
}