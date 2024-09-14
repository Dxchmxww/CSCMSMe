import java.util.Scanner;
public class word_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine().toLowerCase();
        String wrd = sc.nextLine().toLowerCase();
        int count = 0;

        for (int j = 0; j <= sen.length(); j++) {
            if(j + wrd.length() > sen.length()){
                continue;
            }
            if(sen.substring(j,j+wrd.length()).equals(wrd)){
                count++;
                j += wrd.length()-1;
            }

        }
        System.out.println(count);
    }
}
