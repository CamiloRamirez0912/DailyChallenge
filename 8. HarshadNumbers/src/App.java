import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        char[] digits = divideDigits(number);
        if (isHarshad(number, digits))
            System.out.println("The number " + number + " is a Harshad number :)");
        else
            System.out.println("The number " + number + " is not a Harshad number :(");
        

        sc.close();
    }

    public static char[] divideDigits(int number) {
        String numberStr = Integer.toString(number);
        char[] digits = new char[numberStr.length()];
        for (int i = 0; i <= digits.length - 1; i++)
            digits[i] = numberStr.charAt(i);
        return digits;
    }

    public static boolean isHarshad(int number, char[] digits){
        boolean isHarshad = false;
        int result = 0;

        for (int i = 0; i <= digits.length - 1; i++) {
            int numberParsed = Character.getNumericValue(digits[i]);
            result += numberParsed;
        }

        if(number%result==0)
            isHarshad = true;

        return isHarshad;
    }
}
