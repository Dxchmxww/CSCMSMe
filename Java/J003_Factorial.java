import java.util.Scanner;
public class J003_Factorial{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    long fac = 1;
    for(int i = 1; i<=x; i++){
       fac *= i;
    }
    
    System.out.print(fac);
    
  }
}