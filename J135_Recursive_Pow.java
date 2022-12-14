import java.util.Scanner;
public class J135_Recursive_Pow {
    static int Power(int x,int y){
        if(y==0){
            return 1;
        }
        else{
            return x * Power(x,y-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(Power(x, y));
    }
}
