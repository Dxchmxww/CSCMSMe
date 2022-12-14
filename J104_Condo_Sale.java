import java.util.Scanner;
import java.util.Arrays;
public class J104_Condo_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int frs = sc.nextInt();
        int tt = sc.nextInt();
        int[] arr = new int[tt];
        int count = 0;
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<frs || arr[i]>frs+n-1 || (i != 0 && arr[i]==arr[i-1])){
                continue;
            }
            else{
                count++;
                ans += String.valueOf(arr[i]+"\n");
                
            }


        }

        System.out.println(count);
        System.out.println(ans);
     

    }
}
