import java.util.Scanner;
public class J067_Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int coin = 0;

        for (int i = 1; i <= x; i++) {
            if(i%15==0){
                coin+=10*i;
            }
            else if(i%5==0){
                coin+=3*i;
            }
            else if(i%3==0){
                coin+=2*i;
            }
            else{
                coin+=i;
            }
            
        }
        System.out.println(coin);
    }
}