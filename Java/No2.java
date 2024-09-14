import java.util.*;
public class No2{
   public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     String[] y = new String[x];
     
     for(int i = 0; i<x; i++){
       y[i] = sc.next().toLowerCase();
     }
     
     for(int i = 0; i<x; i++){
         if(i%2==0){
             y[i] = y[i].toUpperCase();
             for(int j = y[i].length()-1; j>=0; j--){
                System.out.print(y[i].charAt(j));
                
             }
             System.out.print(" ");
             
         }
         else{
             for(int j = y[i].length()-1; j>=0; j--){
                System.out.print(y[i].charAt(j));
                
             }
             System.out.print(" ");
         }
     }
}

