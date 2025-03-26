import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the partition number you want: ");
        int number = sc.nextInt();
        System.out.println("The result is: " + partition(number));
        sc.close();
    }

    public static int partition(int number){
        int result = 0;
        if (number==0) 
            result = 1;
        else{
            for (int i = 1; i <= number; i++) {
                int gk = (i*(3*i-1))/2;
                result += Math.pow(-1, i+1) * (partition(number - gk) + partition(number- gk-i));
            }
        }
        return result;
    }
}
