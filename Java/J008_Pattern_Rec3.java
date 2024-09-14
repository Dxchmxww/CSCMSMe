import java.util.Scanner;
public class J008_Pattern_Rec3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <x; j++) {
                if(i==0 && j==0 || i==0 && j==x-1 || i==x-1 && j==0 || i==x-1 && j==x-1){
                    System.out.print("-");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
