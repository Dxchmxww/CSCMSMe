import java.util.Scanner;
public class J123_Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        
        if(x.equals(y)){
            System.out.println("Perfect Match");
        }
        else if(x.equalsIgnoreCase(y)){
            System.out.println("Partial Match");
        }
        else if(x.toLowerCase().contains(y.toLowerCase()) || y.toLowerCase().contains(x.toLowerCase())){
            System.out.println("Partial Match");
        }
        else{
            System.out.println("Not Match");
        }
    }
}
