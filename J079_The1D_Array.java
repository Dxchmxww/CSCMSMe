import java.util.Scanner;
import java.util.Arrays;
public class J079_The1D_Array {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       float sum = 0;
       float average = 0;
       float[] num = new float[x];
       // sum
       for(int i = 0; i < x; i++){
           num[i] = sc.nextFloat();
           sum += num[i];
        }

        average = sum/x ; 
         
        Arrays.sort(num);
        System.out.print("Summation: ");
        System.out.printf("%.2f",sum);
        System.out.print("\n"+"Average: ");
        System.out.printf("%.2f",average);
        System.out.print("\n"+"Max: ");
        System.out.printf("%.2f",num[x-1]);
        System.out.print("\n"+"Min: ");
        System.out.printf("%.2f",num[0]);
    }
}
