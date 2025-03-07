import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        ArrayList<Integer> list = divisors(number); 
        if (divisorsSum(list)>number) 
            System.out.println("The number " + number + " is an abundant number :)");
        else
            System.out.println("The number " + number + " is not an abundant number :(");
        sc.close();
    }

    public static ArrayList<Integer> divisors(int number) {
        ArrayList<Integer> list = new ArrayList<>(); 
        for (int i = 1; i < number; i++) {
            if (number%i == 0)
                list.add(i);                
        }
        return list;
    }

    public static int divisorsSum(ArrayList<Integer> list){
        int result = 0;
        for (Integer divisor : list)
            result += divisor;
        
        return result;
    }
}
