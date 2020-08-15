import java.util.Scanner;

class Course{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of course:");
        int n_course = sc.nextInt();
        System.out.println("Enter course names:");
        
        String[] courses = new String[n_course];
        
        
        
        if(n_course > 0 ){
            for(int i = 0 ; i < n_course ; i++){
                if(sc.hasNextLine()){
                    String sub = sc.nextLine();
                    courses[i] = sub;
                }
                
            }
            
            
            System.out.println(courses[1]);
            System.out.println(courses[2]);
            System.out.println(courses[3]);
            System.out.println(courses[0]);
            System.out.println(courses[4]);
            
            
            System.out.println("Enter the course to be searched:");
            String key = sc.nextLine();
            
            int flag = 0;
            
            
            for(int i = 0 ; i < n_course ; i++){
                if(courses[i] == key){
                    flag = 1;
                }
                
            }
            
            if(flag == 1){
                System.out.println(key + " course is available");
                
            }else if(flag == 0){
                System.out.println(key + " course is not available");
            }
            
        }else {System.out.println("Invalid Range");}
        
        
        
    }
}