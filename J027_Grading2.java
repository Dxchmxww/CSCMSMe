import java.util.Scanner;
public class J027_Grading2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] grade = new int[x];
        int count = 1;
        int per = count * 100 / (x + 1);
        int a = 1;

        for (int i = 0; i < x; i++) {
            grade[i] = sc.nextInt();
        }

        for (int i = 0; i < grade.length; i++) {
            int temp = count;
            count = a;
            temp = a;
            for (int j = 0; j < grade.length; j++) {
                if (i == j) {
                    continue;
                }
                if (grade[i] >= grade[j] ) {
                    count += 1;
                }

            }
            per = count * 100 / (x + 1);

            if (per < 100 && per >= 90) {
                System.out.print("A");
            } else if (per < 90 && per >= 70) {
                System.out.print("B");
            } else if (per < 70 && per >= 50) {
                System.out.print("C");
            } else if (per < 50 && per >= 30) {
                System.out.print("D");

            } else if (per < 30 && per >= 10) {
                System.out.print("E");

            } else if (per < 10) {
                System.out.print("F");

            }

            System.out.print(" ");
        }

    }
}
