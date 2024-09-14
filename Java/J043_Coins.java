import java.util.Scanner;
import java.util.Arrays;
public class J043_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] y = x.split(" ");
        int[] pipe = new int[y.length];
        int count = 0;
        int med = pipe.length / 2 ;

        for (int i = 0; i < pipe.length; i++) {
            pipe[i] = Integer.parseInt(y[i]); // string to integer
            
        }
        Arrays.sort(pipe);
        for (int i = 0; i < pipe.length; i++) {
            //count += Math.abs(pipe[med]-pipe[i]); //Math.abs If x is negative(-x) ,returns x. The result is therefore always a positive number or 0.
            if(pipe[i] > pipe[med]){
                count += pipe[i] - pipe[med];
            }
            else if(pipe[med] > pipe[i]){
                count += pipe[med] - pipe[i];
            }
        }

        System.out.println(count);
 
    }
}
