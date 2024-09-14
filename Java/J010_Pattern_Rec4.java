import java.util.Scanner;
public class J010_Pattern_Rec4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if( i==0 || j==0 || i==row-1 || j==col-1){
                    System.out.print("*");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
            
        }
    }
}

