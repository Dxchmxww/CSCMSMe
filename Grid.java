import java.util.Scanner;
public class Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // int col = sc.nextInt();
        // int x = sc.nextInt();
        // int[][] grid = new int[row][col];

        // for (int i = 0; i < x; i++) {
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     grid[a][b]++;
        //     if(a-1 != -1){ //a>=0
        //         grid[a-1][b]++; //left
        //     }
        //     if(a+1 != row){ //a<row
        //         grid[a+1][b]++; //right
        //     }
        //     if(b-1 != 0){ //b>=0
        //         grid[a][b-1]++; //bottom
        //     }
        //     if(b+1 != col){ //b<col
        //         grid[a][b+1]++; //top
        //     }
        // }

        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {
        //         System.out.print(grid[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        int row = sc.nextInt();
        int col = sc.nextInt();
        int x = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < x; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b]++;
            //a==0 cannot add left
            if(a-1 != 0){
                arr[a-1][b]++;
            }
            //b==0 connot add top
            if(b-1 != 0){
                arr[a][b-1]++;
            }
            //a==row-1 connot add right
            if(a+1 != row){
                arr[a+1][b]++;
            }
            //b==col-1 cannot add bottom
            if(b+1 != col){
                arr[a][b+1]++;
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
