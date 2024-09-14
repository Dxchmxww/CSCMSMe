import java.util.*;
public class No3{
   public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     double[] y = new double[x];
  
     for(int i = 0; i<x; i++){
       y[i] = sc.nextDouble();
     }
     
     Arrays.sort(y);
     
     
     System.out.print(y[x-1]);
     System.out.print(" ");
     System.out.print(y[x-2]);
     System.out.print(" ");
     System.out.print(y[x-3]);
     System.out.println();
     System.out.print(y[0]);
     System.out.print(" ");
     System.out.print(y[1]);
     System.out.print(" ");
     System.out.print(y[2]);
     
   } 
}