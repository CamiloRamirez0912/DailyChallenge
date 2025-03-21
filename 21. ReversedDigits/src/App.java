import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write an integer: ");
        int number = sc.nextInt();
        System.out.println("The number reversed is: " + reversed(number));
        sc.close();
    }

    public static int reversed(int number){
        String result = "";
        if (number<0) {
            result += "-";
            number *= -1;
        }
        String numberStr = Integer.toString(number);
        for (int i = numberStr.length()-1; i >= 0; i--) 
            result += numberStr.charAt(i);
        
        return Integer.parseInt(result);
    }
}
