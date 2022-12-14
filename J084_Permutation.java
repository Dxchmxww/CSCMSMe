import java.util.Scanner;
public class J084_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // String[]str = new String[x*2];
        // for (int i = 0; i < str.length; i++) {
        //     str[i] = sc.next();
        // }

        // for (int i = 0; i < str.length; i+=2) {
        //     int n1 = 0;
        //     int n2 = 0;
        //     for (int j = 0; j < str[i].length(); j++) {
        //         if(str[i].length() == str[i+1].length()) {
        //             n1 += str[i].charAt(j);
        //             n2 += str[i+1].charAt(j);
        //         }
        //         else {
        //             n2 = 1;
        //         }
                
        //     }

        //     if(n1==n2){
        //         System.out.println("Yes");
        //     }
        //     else{
        //         System.out.println("No");
        //     }
            
        // }
//     }
// }
        String[][] str = new String [x][2];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 2; j++) {
                str[i][j] = sc.next();
            }
        }
        int n1 = 0;
        int n2 = 0;
        int n = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 1; j++) {
                if(str[i][j].length() == str[i][j+1].length()) {
                    for (int j2 = 0; j2 < str[i][j].length(); j2++) {
                        n1 += str[i][j].charAt(j2);
                        n2 += str[i][j+1].charAt(j2);
                    }
                }
            }
            if (n1 == n2) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }    
    }
}

