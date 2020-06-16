import java.util.Scanner;
import java.*;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
