import java.util.Scanner;
public class J081_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String original = num;
        String c = "";

        //------------Solution1----------------
        // long num = sc.nextInt();
        // long num1 = num;
        // long reverseNum = 0;
        // long remainder = 0;
        
        // while(num != 0){
        //     remainder = num % 10;
        //     reverseNum = (reverseNum * 10) + remainder;
        //     num /= 10;
        // }

        // if(reverseNum == num1){
        //     System.out.println("YES");
        // }
        // else{
        //     System.out.println("NO");
        // }
        
        //------------Solution2----------------


        for (int i = num.length()-1; i >= 0; i--) {
            c+=num.charAt(i);
        }

        if(c.equals(original)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        

    }
}
