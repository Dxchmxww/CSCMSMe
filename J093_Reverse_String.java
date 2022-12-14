import java.util.Scanner;
public class J093_Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[] word = new String[x];
        
        for (int i = 0; i < word.length; i++) {
            word[i] = sc.next().toLowerCase();
            for (int j = word[i].length()-1; j >= 0; j--) {
                if(j==word[i].length()-1){
                    System.out.print(word[i].substring(j).toUpperCase());
                }
                else{
                    System.out.print(word[i].charAt(j));
                }
                
            }
            System.out.print(" ");

        }

       
    }
}
