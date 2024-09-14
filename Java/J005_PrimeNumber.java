import java.util.Scanner;
public class J005_PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ch = true;
        
        if( num==0 || num==1 ){
            System.out.println("No");
        } else if(num==2){
            System.out.println("Yes");
        } 
        else{
          for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
              ch = false;
              break;
            } else{
              ch = true;
            }
          }
      
          if (ch==true) {
              System.out.println("Yes");
          }
          else{
            System.out.println("No");
          }

        }


    }
    
}
