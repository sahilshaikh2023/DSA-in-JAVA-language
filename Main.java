
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        int div = 0;
        while (n != 0) {
            n = n / 10;
            div++;
        }
        System.out.println("this are the digit in number " + div);
    }
}
