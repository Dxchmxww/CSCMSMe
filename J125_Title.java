import java.util.Scanner;
public class J125_Title {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int x = sc.nextInt();

        if(word.length()>x){
            System.out.println(word.substring(0,x)+"...");
        }
        else{
            System.out.println(word);
        }
    }
}
