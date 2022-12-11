import java.util.Scanner;
public class J041_Prime_Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>1){
            for (int i = 2; i <= n; i++) {
                if(n % i == 0){
                    if(count > 0){
                        System.out.print(" x ");
                    }
                    System.out.print(i);
                    count++;
                    n /= i;
                    break;
                }
                
            }
        }
       
    }
}
