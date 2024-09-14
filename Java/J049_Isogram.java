import java.util.Scanner; 
public class J049_Isogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String word = sc.nextLine();
        // String words = word.toLowerCase();
        // char[] arr = words.toCharArray();  //make string to array for use each alphabet*
        // int count = 0;
        // char[] a = {' '};
        // char[] b = {'-'};
        
        // if(word.length()<1000){
        //     for (int i = 0; i < arr.length; i++) {
        //         for (int j = i+1; j < arr.length; j++) {
        //             if(arr[i] == arr[j] || arr[j] == a[0] || arr[j] == b[0] || arr[0] == a[0] || arr[0] == b[0]){
        //                 count+=1;
        //                  if(count==1){
        //                 System.out.println(word + " is not an isogram");
        //                 break;
        //                 }
                        
        //             }
                   
        //         }
    
            
        //     }
    
        //     if(count==0){
        //         System.out.println(word + " is an isogram");
        //     }
    
    
    
        // }


        //---------retry---------
        String wrd = sc.nextLine();
        String wrds = wrd.toLowerCase();
        char[] wrd2 = wrds.toCharArray();
        int ch = 0;
        char[] x = {' ','-'};

        if(wrd.length()<=1000){
            for (int i = 0; i < wrd.length(); i++) {
                for (int j = 0; j < wrd2.length; j++) {
                    if(i==j){
                        continue;
                    }
                    else {
                        if(wrd.charAt(i)==wrd2[j] || wrd.charAt(i) == x[0] || wrd.charAt(i) == x[1]){
                            ch++;
                            if(ch == 1){
                                System.out.print(wrd+" is not an isogram");
                                break;
                            }
                            
                        }
                        
                    }
                }
            }
            if(ch == 0){
                System.out.println(wrd+" is an isogram");
            }
        }
        
    }
}
