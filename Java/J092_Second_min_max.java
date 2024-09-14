import java.util.Scanner;
import java.util.Arrays;
public class J092_Second_min_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float[] num = new float[x];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextFloat();
        }

        Arrays.sort(num);

        System.out.printf("%.2f",num[1]);
        System.out.print(" ");
        System.out.printf("%.2f",num[x-2]);
        
    }
}
