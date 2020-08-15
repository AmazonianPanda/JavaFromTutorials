import java.util.Scanner;

class HighestMarkPerSem{
    static Scanner sc = new Scanner(System.in);
    
    //runs once
    public static int num_sem(){
        System.out.println("Enter no of semester:");
        int n_sem = sc.nextInt();
        return n_sem;
    }
    
    //runs each semester
    public static int eachSem(int sem){
        System.out.println("Enter no of subjects in " + sem + " semester:");
        int subjects = sc.nextInt();
        return subjects;
    }
    

    
    public static float max(float[] array){
        
        float max = array[0];
        
        for(int i = 0; i < array.length ; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }
        }
        
        return max;
    }
    
    public static void output(float[] array , int sem){
        
        for(int i = 0 ; i < sem ; i++){
            
            System.out.print("Maximum mark in " + (i+1) + " semester:");
            System.out.printf("%.0f", array[i]);
            System.out.println("");
        }
        
        
    }
    
    
    public static void main(String[] args){
        int n_sem = num_sem();
        //System.out.println(n_sem);
        float[] subs = new float[n_sem];
        
        
        
        //run for each sem t get count
        for(int i = 1 ; i <= n_sem ; i++ ){
            subs[i-1] = eachSem(i);
        }
        
        
        //max has maximum number of semesters
        float max = max( subs);
        
        //System.out.println(max);

        
        
        //store marks
        float[][] marks = new float[n_sem][(int)max];
        int flag = 0;
        
        outerloop:for(int i =0 ; i < n_sem ; i++){
            flag = 0;
            
            System.out.println("Marks obtained in semester " + (i+1) + ":");
            for(int j = 0 ; j < subs[i] ; j++){
                
                marks[i][j] = sc.nextFloat();
                if( marks[i][j] < 0 || marks[i][j] > 100){
                    flag = 1;
                    break outerloop;
                }
                }
                    
            }

        
        if(flag == 1){
            System.out.println("You have entered invalid mark.");
            
            
        }else{
        
        
            //finding max of each sem
            float[] maxpersem  = new float[n_sem];
            
            for(int i = 0 ; i < n_sem ; i++){
                
                maxpersem[i] = max(marks[i]);
            }
            
            output(maxpersem , n_sem);
        }
    }
}