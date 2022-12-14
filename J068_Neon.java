import java.util.Scanner;
public class J068_Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mx = -10000;
        String[] A = new String[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.next();
            mx = Math.max(mx, A[i].length());
        }
        for (int i = 0; i < mx; i++) {
            for (int j = 0; j < n; j++) {
                if (A[j].length() <= i)
                    System.out.print("  ");
                else
                    System.out.print(A[j].charAt(i) + " ");
            }
            System.out.println();
        }


    }
}
