import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a positive integer: ");
        int number = sc.nextInt();
        if (automorphic(number)) {
            System.out.println("The number " + number + " is a perfect number");
        }else{
            System.out.println("The number " + number + " is not a perfect number");
        }
        sc.close();
    }

    public static boolean automorphic(int number){
        boolean isAutomorphic = false;
        int numberSquare = number*number;
        String numberStr = Integer.toString(number);
        String squareStr = Integer.toString(numberSquare);
        char numberLastDigit = numberStr.charAt(numberStr.length()-1);
        char squareLastDigit = squareStr.charAt(numberStr.length());
        if (numberLastDigit == squareLastDigit)
            isAutomorphic = true;
        return isAutomorphic;
    }

}
