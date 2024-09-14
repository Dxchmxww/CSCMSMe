import java.util.Scanner;
public class J160_Digital_Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        char[] y = x.toCharArray();
        int a = sc.nextInt();
        int count = 0;
        int q = 0;

        if(a==1){
            for (int i = 0; i < y.length; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int j2 = 0; j2 < 3; j2++) {
                        if(y[i]=='0'){
                            if(j>0 && j2 == 1 && j<4 && j2==1 ){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("#");
                            }
                   
                            
                        }
                        else if(y[i] =='1'){
                            if(j2==2){
                                System.out.print("#");
                            }
                            else{
                                System.out.print(" ");
                            }
                           
                        }
                        else if(y[i]=='2'){
                            if(j==1 && j2<2 || j==3 && j2>0){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("#");
                            }
                        }
                        else if(y[i]=='3'){
                            if(j==1 && j2<2 || j==3 && j2<2){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("#");
                            }
                        }
                        else if(y[i]=='4'){
                            if(j2==1 && j != 2 || j>2 && j2==0){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("#");
                            }
                        }
                        else if(y[i]=='5'){
                            if(j==1 && j2 > 0 || j==3 && j2<2){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("#");
                            }
                        }
                        else if(y[i]=='6'){
                            if(j==1 && j2 > 0 || j==3 && j2==1){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("#");
                            }
                        }
                        else if(y[i]=='7'){
                            if(j>0 && j2 <2 ){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("#");
                            }
                        }
                        else if(y[i]=='8'){
                            if(j==1 && j2 == 1 || j==3 && j2==1){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("#");
                            }
                        }
                        else if(y[i]=='9'){
                            if(j==1 && j2 == 1 || j==3 && j2<2){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("#");
                            }
                        }
                        else if(y[i]==':'){
                            if(j==1 && j2==1 || j==3 && j2==1){
                                System.out.print("#");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                        
                            
                        
                    }
                    System.out.println();
                    
                    
                }
                System.out.println();
                
                
                
                
            }
        }
        else{
            for (int k2 = 0; k2 < 5; k2++) {
                int temp = q;
                q = 0 ;
                temp = q;
                for (int l = 0; l < 19; l++ ) {
                    for (int k = q; k < y.length; k++) {
                        if(y[k]=='0'){
                            count = k;
                            break;
                        }
                        else if(y[k]=='1'){
                            count = k;
                            break;
                        }
                        else if(y[k]=='2'){
                            count = k;
                            break;
                        }
                        else if(y[k]=='3'){
                            count = k;
                            break;
                        }
                        else if(y[k]=='4'){
                            count = k;
                            break;
                        }
                        else if(y[k]=='5'){
                            count = k;
                            break;
                        }
                        else if(y[k]=='6'){
                            count = k;
                            break;
                        }
                        else if(y[k]=='7'){
                            count = k;
                            break;
                        }
                        else if(y[k]=='8'){
                            count = k;
                            break;
                        }
                        else if(y[k]=='9'){
                            count = k;
                            break;
                        }
                        else if(y[k]==':'){
                            count = k;
                            break;
                        }
        
                    }

                    
                    if(l == 3 || l == 7 || l == 11 || l == 15){
                        System.out.print(" ");
                        q++;
                    } 
                    else if(y[count]=='0'){
                        if(l==count*4+1 && k2>=1 || l==count*4+1 && k2<4 ){
                            System.out.print(" ");
                        } 
                        else{
                            System.out.print("#");
                        }
                    }

                    else if(y[count]=='1'){
                        if(l==count*4+2 && k2>= 0 ){
                            System.out.print("#");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }

                    else if(y[count]=='2'){
                        if(l == count*4 && k2== 1 || l==count*4+1 && k2==1 ||
                        l == count*4+1 && k2== 3 || l==count*4+2 && k2==3){
                            System.out.print(" ");
                        } 
                        else{
                            System.out.print("#");
                        }
                    }

                    else if(y[count]=='3'){
                        if(l == count*4 && k2== 1 || l==count*4+1 && k2==1 ||
                        l == count*4 && k2== 3 || l==count*4+1 && k2==3){
                            System.out.print(" ");
                        } 
                        else{
                            System.out.print("#");
                        }

                    }
                        
                    else if(y[count]=='4'){
                        if(l == count*4+1 && k2 != 2 || l==count*4 && k2>2){
                            System.out.print(" ");
                        } 
                        else{
                            System.out.print("#");
                        }
                    }
                    
                    else if(y[count]=='5'){
                        if(l == count*4+1 && k2== 1 || l==count*4+2 && k2==1 ||
                        l == count*4 && k2== 3 || l==count*4+1 && k2==3){
                            System.out.print(" ");
                        } 
                        else{
                            System.out.print("#");
                        }
                    }
                    
                    else if(y[count]=='6'){
                        if(l == count*4+1 && k2== 1 || l==count*4+2 && k2==1 ||
                        l == count*4+1 && k2== 3){
                            System.out.print(" ");
                        } 
                        else{
                            System.out.print("#");
                        }
                    }

                    else if(y[count]=='7'){
                        if(l == count*4 && k2 >0  || l==count*4+1 && k2>0){
                            System.out.print(" ");
                        } 
                        else{
                            System.out.print("#");
                        }
                    }
                    
                    else if(y[count]=='8'){
                        if(l == count*4+1 && k2== 1 || l==count*4+1 && k2==3){
                            System.out.print(" ");
                        } 
                        else{
                            System.out.print("#");
                        }
                    }
                   
                    else if(y[count]=='9'){
                        if(l == count*4+1 && k2== 1 || l==count*4 && k2==3 ||
                        l == count*4+1 && k2== 3 ){
                            System.out.print(" ");
                        } 
                        else{
                            System.out.print("#");
                        }
                    }

                    else if(y[count]==':'){
                        if(l == 9 && k2== 1 || l==9 && k2==3 ){
                            System.out.print("#");
                        } 
                        else{
                            System.out.print(" ");
                        }
                    }
                    
                    
                    
                    else{
                        System.out.print("#");
                    }
                        
                }
                System.out.println();
                
            }
               
                
        }
            
    
    }
        
}

