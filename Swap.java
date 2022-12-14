import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] num = new int[x];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length-num.length%2; i+=2) {
            System.out.print(num[i+1]+" "+num[i]+" ");
        }
        if(num.length %2 ==1){
            System.out.print(num[num.length-1]);
            
        }

    }
}
