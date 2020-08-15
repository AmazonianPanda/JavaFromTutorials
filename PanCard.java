import java.util.Scanner;
class PanCard{
    
    static boolean search(char array[] ,char key){
        int flag = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(key == array[i]){
                flag = 1;
            }
        }
        
        if(flag == 1){
            return true;
        }else{
            return false;
        }
    }
    
    
    public static void main(String[] args){
        char[] uc_alph = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] num = {'1','2','3','4','5','6','7','8','9'};
        
        System.out.println("Enter the PAN no:");
        Scanner sc = new Scanner(System.in);
        
        String pan_num = sc.nextLine();
        
        //System.out.println(pan_num);
        if(pan_num.length() != 10){
            System.out.println("Invalid PAN no");
        }else{
        
            char[] chars = new char[10];
            
            for(int i = 0 ; i < 10 ; i++){
                chars[i] = pan_num.charAt(i);
                
            }
            
            int flag = 0;
            
            
            //for first 5
            for(int i = 0 ; i < 5 ; i++){
                if(!(search(uc_alph, (char)chars[i]))){
                    flag =1;
                    break;
                }
                
            }
            
            for(int i = 5 ; i < 9 ; i++){
                if(!(search(num, (char)chars[i]))){
                    flag =1;
                    break;
                }
                
            }
            if(!(search(uc_alph, (char)chars[9]))){
                flag =1;
                
            }
                
            
            if(flag == 1){
                System.out.println("Invalid PAN no");
            }else if(flag == 0){
                System.out.println("Valid PAN no");
            }
            
        }
    }
}