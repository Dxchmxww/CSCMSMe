import java.util.Scanner;
public class J091_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double y = Math.round(num);

        //y = Math.round(num);

        if(y%10==7 || y%7==0){
            System.out.println("Unlucky");
        }
        else{
            System.out.println("Lucky");
        }
        
        
    }
}
