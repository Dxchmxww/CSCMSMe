import java.util.Scanner;
public class J048_Finite_State_Machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        
        if(x==0 && y==0){
            if(a.equals("1")){ 
                System.out.println("MuR");
            }
            else if(b.equals("1")){
                System.out.println("DnD");
            }
            else{
                System.out.println("NEUTRAL");
            }
           
        }

        if(x==1 && y==0){
            if(a.equals("1")){ 
                System.out.println("NEUTRAL");
            }
            else if(b.equals("1")){
                System.out.println("DnD");
            }
            else{
                System.out.println("MuR");
            }
        }

        if(x==0 && y==1){
            if(a.equals("1")){ 
                System.out.println("MuR");
            }
            else if(b.equals("1")){
                System.out.println("NEUTRAL");
            }
            else{
                System.out.println("DnD");
            }
        }

           
    }
   
}
