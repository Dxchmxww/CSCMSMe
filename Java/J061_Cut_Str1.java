import java.util.Scanner;
public class J061_Cut_Str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        int[] ch = new int[26];
        int count = 1;

        for (int i = 0; i < a.length(); i++) {
            ch[a.charAt(i) - 'a']++;
            if(ch[a.charAt(i)-'a'] > 1){
                count++;
                for (int j = 0; j < ch.length; j++) {
                    if( j != a.charAt(i)-'a'){
                        ch[j] = 0; //find least then don't add more 
                    }
                }

            }
        }
        System.out.println(count);
    }
}
