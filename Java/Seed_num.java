import java.util.Scanner;
public class Seed_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt()-5;
        int result = 0;
        for (int i = seed; i <= seed+10; i++) {
            if(i%3 ==0){
                result -= i;  
            }
            else {
                result += i;
            }
        }
        System.out.println(result);
    }
}
