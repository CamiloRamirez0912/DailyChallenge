import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        char[] digits = divideDigits(number);
        LinkedList<Integer> list = fillLinkedList(digits);
        if (keith(list, number)==number) 
            System.out.println("The number " + number + " is a keith number.");
        else
            System.out.println("The number " + number + " is not a keith number.");
    

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

    public static LinkedList<Integer> fillLinkedList(char[] digits) {
        LinkedList<Integer> LinkedList = new LinkedList<>();
        for (int i = 0; i <= digits.length - 1; i++) {
            int numberParsed = Character.getNumericValue(digits[i]);
            LinkedList.addFirst(numberParsed);
        }
        return LinkedList;
    }

    public static int keith(LinkedList<Integer> list, int number){
        int resut = 0;
        int sum = 0;
        do{
            for (int i = 0; i < list.size(); i++) 
                sum += list.get(i);
            resut=sum;
            list.removeLast();
            list.addFirst(sum);
            sum = 0;
        }while(resut<number);
        return resut;
    }

    
}
