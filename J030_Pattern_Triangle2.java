import java.util.Scanner;
 class J030_Pattern_Triangle2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      
      for(int i = 0; i<x; i++){
        for(int j = i; j<x; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
}
