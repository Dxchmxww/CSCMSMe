import java.util.Scanner;
public class J007_Fibonacci_Seq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        int a = 1;

        for (int i = 0; i < x; i++) {
            System.out.print(sum+" ");
            int temp = sum+a;
            sum = a;
            a = temp;
        }
        
    }
}
