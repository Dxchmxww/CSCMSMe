import java.util.Scanner;
public class Recursive_Binary {
	public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        binary(n);
        System.out.println();
    }

    public static void binary(int n) {
        //System.out.println("N = " + n);
        if (n == 1) {
            System.out.print("1");
            return;
        }
        binary(n / 2);
        System.out.print(n % 2);
        return;
    }
}


