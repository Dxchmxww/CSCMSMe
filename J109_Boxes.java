import java.util.Scanner;
public class J109_Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pz = new int[3];
        int[] bx = new int[3];
        int count = 1;
        int cnt = 1;
        

        for (int i = 0; i < 3; i++) {
            pz[i] = sc.nextInt();
            count *= pz[i];
            bx[i] = sc.nextInt();
            cnt *= bx[i];
            
        }

        for (int i = 1; i <= 10; i++) {
            if(count / cnt== 1/i){
                System.out.println("Yes");
                break;
            }
            else{
                System.out.println("No");
                break;
            }
        }

        // for (int i = 0; i < bx.length; i++) {
        //     for (int j = 0; j < bx.length; j++) {
        //         if(pz[i] > bx[j]){
        //             count++;
        //         }
               
        //     }
        //     if(count>=2){
        //         cnt++;
                
        //     }
        //     count = 0;
        // }
        // if(cnt>1){
        //     System.out.println("No");
        // }
        // else{
        //     System.out.println("Yes");
        // }
    }
}
