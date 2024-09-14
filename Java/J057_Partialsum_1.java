import java.util.Scanner;

public class J057_Partialsum_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] y = new int[x];
        // String d = "";
        for (int i = 0; i < x; i++) {
            y[i] = sc.nextInt();
        }
        int z = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < z; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = 0;
            for (int j = a; j <= b; j++) {
                sum += y[j];
                // d += sum;
            }
            System.out.println(sum);

        }

    }
}
