import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a * a == b * b + c * c || b * b == c * c + a * a || c * c == a * a + b * b)
            System.out.print(true);
        else
            System.out.print(false);
    }
}
