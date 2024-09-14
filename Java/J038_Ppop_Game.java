import java.util.Scanner;
import java.util.Arrays;
public class J038_Ppop_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] dis = new int[num];
        int[] x = new int[num];
        int count = 0;
        int same = 0;
        String y = "";

        for (int i = 0; i < num; i++) {
            dis[i] = sc.nextInt();
            x[i] = dis[i];
        }

        Arrays.sort(dis);

        for (int i = 0; i < dis.length; i++) {
            int temp = count;
                count = 0;
                temp = same;
            for (int j = 0; j < x.length; j++) {
                
                
                if(dis[i]==x[j]){
                    
                    count++;
                  
                    y += j+1;
                    if(count > 0){
                        x[j] = 0;
                        y += " ";
                    }
                    
                    //System.out.print(j+1+" ");  
                }
                
            }
            
            
        }

        System.out.println(y);
        
    }
}
