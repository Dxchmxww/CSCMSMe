import java.util.Scanner;
import java.util.Arrays;
//----------not finish--------------
public class J090_Subset_sum {
    static boolean isSubsetsum(int num[] , int num2[], int a, int q){
        if(a ==1 && q==1){
            return true;
        }
        
        if(num[a-1]> num2[q-1]){
            return isSubsetsum(num, num2, a-1, q-1);
        }
        else{
            return isSubsetsum(num, num2, a-1,q-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] num = new int[x];
        int q = sc.nextInt();
        int[] num2 = new int[q];
        int a = num.length;
       

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            Arrays.sort(num);
        }

        for (int i = 0; i < num2.length; i++) {
            num2[i] = sc.nextInt();
            //sum = num2[i];
        }
        

        if(isSubsetsum(num, num2, a,q) == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        //return isSubsetsum(num, num2, a, q);

        
        

    }
}
