import java.util.Scanner;
public class J028_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String oparator = sc.next();
        int num2 = sc.nextInt();

        switch (oparator) {
            case ("+"):
                System.out.println(num1+num2);
                break;
            case ("-"):
                System.out.println(num1-num2);
                break;
            case ("*"):
                System.out.println(num1*num2);
                break;
            case ("/"):
                if(num2==0){
                  System.out.println("error");
                }
                else{
                System.out.println(num1/num2);
                }
                break;
            case ("%"):
                if(num2==0){
                System.out.println("error");
                }
                else{
                System.out.println(num1%num2);
                }
                
                break;
        
            default:
                break;
        }
    }
}