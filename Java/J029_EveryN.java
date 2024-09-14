import java.util.Scanner;
public class J029_EveryN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int num = sc.nextInt();
        if(num<=100 || name.length()<=1000){
            for (int i = 0; i < name.length(); i++) {
                if(i%num==0){
                    System.out.print(name.charAt(i));
                   
                }
                else{
                    continue;
                }
            }
        }

    }
}
