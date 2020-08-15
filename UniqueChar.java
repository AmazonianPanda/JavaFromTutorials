import java.util.*;


class UniqueChar{
    static char[] uc_alph = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    static char[] lc_alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    static boolean unique(char[] array , char key){
        int flag = 0 ;
        for(int i = 0 ; i < array.length ; i++ ){
            //System.out.println(key + " and " + array[i] + " is " + key.equals(array[i]));
            if(key == (array[i])){
                flag += 1;
            }
        }
        
        if(flag == 1){
            return false;
        }
        else{
            return true;
        }
    }
    
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
        System.out.println("Enter the sentence:");
        Scanner sc = new Scanner(System.in);
        
        String sentance = sc.nextLine();
        
        char[] a_sentance = new char[sentance.length()];
        for(int i = 0 ; i < sentance.length() ; i++){
            a_sentance[i] = sentance.charAt(i);
            
        }
        
        int flag = 0;
        
        ArrayList<Character> list = new ArrayList<Character>();
        
        
        for(int i = 0 ; i < sentance.length() ; i++ ){
            if(!(unique(a_sentance, a_sentance[i]))){
                list.add(a_sentance[i]);
                if(!( (search(uc_alph,a_sentance[i])) || (search(lc_alph,a_sentance[i])) )){
                    flag = 1;
                    break;
                }
            }
        }   
        
        
        if(flag == 0 && list.size() > 0){
            System.out.println("Unique characters:");
            list.forEach((n) -> System.out.println(n));
        }else if(flag == 0 && list.size() == 0){
            System.out.println("No unique characters");
        }else{
        
            System.out.println("Invalid Sentence");
        }
    }
}