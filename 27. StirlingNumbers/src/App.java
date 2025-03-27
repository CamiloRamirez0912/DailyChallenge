import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the number of elements you want: ");
        int n = sc.nextInt();
        System.out.print("Write the number of subsets you want: ");
        int k = sc.nextInt();
        System.out.println("The result is: " + stirling(n, k));
        sc.close();
    }

    public static int stirling(int n, int k){
        int result = 0;
        if (n==k || n==0 && k==0) 
            result =1;
        else if (n == 0 || k==0) 
            result = 0;
        else
            result = k * stirling(n-1, k) + stirling(n-1, k-1);
        
        return result;
    }
}
