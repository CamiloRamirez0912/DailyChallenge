import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the width of the grid: ");
        int m = sc.nextInt();
        System.out.print("Write the height of the grid: ");
        int n = sc.nextInt();
        System.out.println("The result is: " + delannoy(m, n));
        sc.close();
    }

    public static int delannoy(int m, int n){
        int result = 0;
        if (m==0 && n==0 || n==0 || m==0) 
            result=1;
        else
            result = delannoy(m-1, n) + delannoy(m, n-1) + delannoy(m-1, n-1);
        


        return result;
    }
}
