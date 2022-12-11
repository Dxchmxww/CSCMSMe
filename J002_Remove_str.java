import java.util.Scanner;
public class J002_Remove_str {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        
        if(x.length()>y.length()){
            System.out.println( x.replace(y, ""));        
        }else {
            System.out.println( y.replace(x, ""));      
        }
    }
}
