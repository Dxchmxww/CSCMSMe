import java.util.Scanner;
import java.util.Arrays;
public class J094_Swap_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float[] num = new float[x];

        for(int i =0; i<x; i++){
            num[i]= sc.nextFloat();
        }

        Arrays.sort(num);
         
        for(int i = 0; i<num.length/2; i=i+2){
            float temp = num[i];
            num[i] = num[num.length-1-i];
            num[num.length-1-i] = temp;
        }

        for(int i =0; i<num.length; i++){
            System.out.printf("%.2f",num[i]);
            System.out.print(" ");
        }

    }
    
}
