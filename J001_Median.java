import java.util.Scanner;
import java.util.Arrays;
public class J001_Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        System.out.println(nums[1]);
        
        
    }
    
}
