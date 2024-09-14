import java.util.Scanner;
public class J086_Multiplication {
    static int Multiple(int x, int y){
        if(y == 0 || x ==0){
            return 0;
        }
        if(y<0 && x<0){
            return (-1*x + Multiple((-1*x),(-1*y)-1));
        }
        if(y<0){
            return (-1*x + Multiple((x),(y+1)));
        }
        else{
            return ( x + Multiple((x),(y-1)));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int re = Multiple(x, y);
        System.out.println(re);
    }
}
