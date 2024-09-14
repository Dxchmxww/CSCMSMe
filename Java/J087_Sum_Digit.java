import java.util.Scanner;
public class J087_Sum_Digit {
    int sum = 0;
        public int sum(long num){
            if(num != 0){
                sum += num%10;
                num /= 10;
            }
            return sum(num);
        }

    public static void main(String[] args) {
        J087_Sum_Digit x = new J087_Sum_Digit();
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(x.sum(num));

    }
}
