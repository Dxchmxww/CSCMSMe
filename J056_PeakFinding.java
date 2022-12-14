import java.util.Scanner;
public class J056_PeakFinding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] num2 = new int[num];
        int[] output = new int[num]; //keep value after compare
        int sum = 0;


        for (int i = 0; i < num2.length; i++) {
            num2[i] = sc.nextInt();
        }
        //System.out.println(num2[num-1]);

        for (int i = 0; i < num; i++) {
            if(num==1){
                output[sum] = num2[i];
                sum++;
                break;
            }
            if(i==0){
                if(num2[i]>num2[i+1]){
                    output[sum] = num2[i];
                    sum++;
                }
            }
            else if(i == num-1){
                if(num2[i]>num2[i-1]){
                    output[sum] = num2[i];
                    sum++;
                }
            }
            else if(num2[i]>num2[i+1] && num2[i]>num2[i-1]){
                output[sum] = num2[i];
                sum++;
            }
        }

        System.out.println(sum);
        for (int i = 0; i < sum; i++) {
            System.out.print(output[i]+" ");
        }
    }
}
