import java.util.Scanner;
public class J052_Text_inside_out {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] arr = word.toCharArray();
        
        if(arr.length%2==0){
            for (int i = arr.length/2-1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
            for (int i = arr.length-1; i >= arr.length/2; i--) {
                System.out.print(arr[i]);
            }
        }
        else{
            for (int i = arr.length/2-1; i >= 0; i--) {
                System.out.print(arr[i]);
            }
            System.out.print(arr[arr.length/2]);
            for (int i = arr.length-1; i >= arr.length/2+1; i--) {
                System.out.print(arr[i]);
            }
        }
        
    }
    
}
