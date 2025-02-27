import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer number: ");
        int number =  sc.nextInt();
        char[] digits = divideDigits(number);
        int result = isArmstrong(digits);
        
        if (result == number) {
            System.out.println("The number " + number + " is an Armstrong number :)");
        }else{
            System.out.println("The number " + number + " is not an Armstrong number :(");
        }
    
        
        
        
        sc.close();
    }

    public static char[] divideDigits(int number) {
        String numberStr = Integer.toString(number);
        char[] digits = new char[numberStr.length()];
        for (int i = 0; i <= digits.length - 1; i++) {
            digits[i] = numberStr.charAt(i);
        }
        return digits;
    }

    public static int isArmstrong(char[] digits) {
        int raise = digits.length;
        int result = 0;
        for (int i = 0; i <= digits.length - 1; i++) {
            int numberParsed = Character.getNumericValue(digits[i]);
            result += Math.pow(numberParsed, raise);
        }
        return result;
    }
}
