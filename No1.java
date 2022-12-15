import java.util.*;
public class No1{
   public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
     String x = sc.nextLine();
     int[] y = new int[x.length()];
     int sum = 0;
     int count =0;
     for(int i = 0; i<y.length; i++){
       y[i] = Integer.parseInt(x.substring(i,i+1));
        if(y[4]%2==0){
          count = 1;
        }
        else if(y[4]%2 != 0){
         count = 0;
        }
     }
     
     if(count == 0){
        for(int i = 1; i<9; i++){
            if(i%2 != 0){
                sum += y[i];
            }
        }
     
     }
     else{
         for(int i = 0; i<9; i++){
            if(i%2 == 0){
                 sum += y[i];
            }
        }

     }
    
   System.out.print(sum);
   
 }
}