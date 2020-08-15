import java.util.*;

class Palindrome{
    static char[] uc_alph = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    static char[] lc_alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    static boolean check(char a , char b ){
        if(a == b){
            return true;
        }else{
            return false;
        }
    }
    
    static boolean search(char array[] ,char key){
        int flag = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(key == array[i] ){
                flag = 1;
            }
        }
        
        if(flag == 1){
            return true;
        }else{
            return false;
        }
    }
    
    static int searchIndex(char array[] ,char key){
        int flag = 0;
        int i = 0;
        for(i = 0 ; i < array.length ; i++){
            if(key == array[i] ){
                flag = 1;
                break;
            }
        }
        return i;
    }
    
    
    public static void main(String[] args){
        System.out.println("Enter the word : ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        char[] letters = new char[word.length()];
        for(int i = 0 ; i < word.length() ; i++){
            letters[i] = word.charAt(i);
            Character LETTER = Character.toUpperCase(letters[i]);
            letters[i] = LETTER.charValue();
        }
        
        
        int flag = 0;                               //for scaces or other char
        
        for(int i = 0 ; i < letters.length ; i++){
            if(  !(search(uc_alph, letters[i]) || search(lc_alph, letters[i])  )  ){
                flag = 1;
                break;
            }
        }
        
        if(flag == 0){    
            int flag2 = 0;
            for(int i = 0 ; i < (letters.length/2) ; i++){
                if( !(check( letters[i], letters[letters.length - 1 - i] )) ){
                    flag2 = 1;
                    break;
                }
            }
            
            if(flag2 == 1){
                System.out.println(word + " is not a Palindrome");
            }else{
                System.out.println(word + " is a Palindrome");
            }
            
        }else{
            System.out.println("Invalid Input");
        }
        
    }
}