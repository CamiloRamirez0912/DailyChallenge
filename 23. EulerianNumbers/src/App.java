import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the amount of elements: ");
        int n = sc.nextInt();
        System.out.print("Write the amount of permutations: ");
        int m = sc.nextInt();
        System.out.println("There are " + eulerian(n, m) + " permutations.");
        sc.close();
    }

    public static int eulerian(int n, int m){
        int result = 0;
        if (n == 0){
            result = 0;
        }else if (m == 0){
            result = 1;
        }else{
            result = (n - m) * eulerian(n - 1, m - 1) + (m + 1) * eulerian(n - 1, m);
        }
            
        return result;
    }
}
