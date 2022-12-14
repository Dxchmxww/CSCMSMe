import java.util.Scanner;
public class J059_Raining {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt(); 
        int[] bucket = new int[x];
        for(int i = 1; i<=y; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            for(int j = a-1; j<=b-1; j++){
                bucket[j] += 1;
            }
        }

        for(int i = 0; i<bucket.length; i++){
            System.out.print(bucket[i]+ " ");
        }


    }
}
