import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int flag = 0;
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.println("prime");
            else
                System.out.println("not prime");
        }
    }
}