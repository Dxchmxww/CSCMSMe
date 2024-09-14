import java.util.Scanner;
public class J095_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        double[] avrofrow = new double[row];
        double[] avrofcol = new double[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                avrofrow[i] += arr[i][j];
                
            }
            avrofrow[i] = avrofrow[i]/col;
            
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                avrofcol[i] += arr[j][i];
            }
            avrofcol[i] = avrofcol[i]/row;
        }
        
        System.out.print("Average of each row:");
        System.out.println();
        for (int i = 0; i < avrofrow.length; i++) {
            System.out.printf("%.2f",avrofrow[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("Average of each column:");
        System.out.println();
        for (int i = 0; i < avrofcol.length; i++) {
            System.out.printf("%.2f",avrofcol[i]);
            System.out.print(" ");
        }
    }
}
