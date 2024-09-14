import java.util.Scanner;
import java.util.Arrays;
public class J054_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] num = new int[x];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        for (int i = 0; i<x/2; i++){
            System.out.print(num[x-i-1] + " " + num[i] + " " );
        }

        if(x%2 != 0){
            System.out.print(num[x/2]);
        }
    }
}
