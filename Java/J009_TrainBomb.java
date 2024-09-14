import java.util.Scanner;
public class J009_TrainBomb {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int cart = sc.nextInt();
        int bomb = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= cart; i++) {
            if(i==bomb || i==bomb-1 || i==bomb+1){
                continue;
            }
            else{
                sum++;
            }
            System.out.print(i+" ");
        }

        if(sum==0){
            System.out.println("DIE");
        }

    }
}
