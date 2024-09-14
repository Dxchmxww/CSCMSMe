import java.util.Scanner;
public class J025_StepBack {
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      int start = sc.nextInt();
      int stop = sc.nextInt();
      //stop>start
      if(stop>start){
        int temp = start;
        start = stop; 
        stop = temp;
      }

      for (int i = start; i >= stop; i--) {
        for (int j = start; j >= i; j--) {
          System.out.print(j+" ");
        }
      }

          
    }
}
