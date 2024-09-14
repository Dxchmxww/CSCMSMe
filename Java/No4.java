import java.util.*;
public class No4{
   public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     int[][] y = new int[10][10];
     int sum = 0;
     
     for(int i = 0; i<10; i++){
         for(int j = 0; j<10; j++){
             y[i][j] = 1;

         }
     }
     
     for(int k = 0; k<x; k++){
         int a = sc.nextInt();
         int b = sc.nextInt();
            sum += y[a][b];
            y[a][b] = 0;
         if(a-1 != -1){
            sum+=y[a-1][b];
             y[a-1][b] = 0;
         }
         if(a-1 != -1 && b+1 !=10){
           sum+=y[a-1][b+1];
            y[a-1][b+1] = 0;
         }
         if(a-1 != -1 && b-1 != -1){
           sum+=y[a-1][b-1];
            y[a-1][b-1] = 0;
        }
         if(a+1 != 10 ){
            sum+=y[a+1][b];
             y[a+1][b] = 0;
            
         }
         if(a+1 != 10 && b-1 != -1){
            sum+=y[a+1][b-1];
            y[a+1][b-1] = 0;
         }
         if(a+1 != 10 && b+1 != 10){
          sum+=y[a+1][b+1];
          y[a+1][b+1] = 0;
         }
         if( b-1 != -1 ){
            sum+=y[a][b-1];
            y[a][b-1] = 0;
         }
         if( b+1 != 10 ){
            sum+=y[a][b+1];
            y[a][b+1] = 0;
         }
        
      }
      System.out.print(sum);
     }
     
   }

