import java.util.Scanner;
public class J047_Weapon {
    public static void main(String[] aarg){
        Scanner sc = new Scanner(System.in);
        int iron = sc.nextInt();
        int sword = 0;
        int shield = 0;
        int helmet = 0;

        for (int i = iron; i > 0; i--) {
            if(iron>=10){
                sword += 1;
                iron -= 10;
            }
            if(iron>=8){
                shield += 1;
                iron -= 8;
            }
            if(iron>=3){
                helmet += 1;
                iron -= 3;
            }
        }
        System.out.println(sword+" "+shield+" "+helmet+" "+iron);
    }
}
