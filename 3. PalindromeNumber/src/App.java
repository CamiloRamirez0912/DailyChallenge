import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer number: ");
        int number = sc.nextInt();
        if (palintrome(number)) {
            System.out.println("The number " + number + " is a palindrome.");
        }else{
            System.out.println("The number " + number + " is not a palindrome.");
        }

        sc.close();
    }

    public static boolean palintrome(int number){
        boolean isPalindrome = false;
        String numberStr = Integer.toString(number);
        String reversedNum = "";
        for(int i = numberStr.length()-1; i >=0; i--)
            reversedNum += numberStr.charAt(i);
            
        if (reversedNum.equals(numberStr)) 
            isPalindrome = true;
        
        return isPalindrome;
    }
}
