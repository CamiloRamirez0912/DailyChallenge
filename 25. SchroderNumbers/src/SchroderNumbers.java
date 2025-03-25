public class SchroderNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("S(" + i + ") = " + schroder(i));
        }
    }

    public static int schroder(int n) {
        int result = 1;
        if (n <= 0 )
            result = 1; 
        else if (n == 1) 
            result = 2;
        else{
            result = 3 * schroder(n - 1);
            for (int i = 1; i <= n - 2; i++) 
                result += schroder(i) * schroder(n - i - 1);
            
        }

        return result;
    }

    
}
