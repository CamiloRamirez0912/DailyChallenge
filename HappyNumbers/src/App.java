import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer number: ");
        int number =  sc.nextInt();
        int result = 0;
        do{
            char[] digits = divideDigits(number);
            result = isHappy(digits);
            if (result>1) {
                number = result;
                digits = divideDigits(number);
            }
        }while(result!=1);

        if (result==1) {
            System.out.println("Your number is a happy number :)");
        }else{
            System.out.println("Your number is not a happy number :(");
        }
        
        
        
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

    public static int reBuildNumber(char[] digits){
        int number = 0;
        String numberStr = "";
        for (int i = 0; i <= digits.length - 1; i++) {
            numberStr+=digits[i];
        }
        number = Integer.parseInt(numberStr);
        return number;
    }
}
