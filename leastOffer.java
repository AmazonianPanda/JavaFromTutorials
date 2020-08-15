import java.util.*;
public class leastOffer{
    
  
    public static void main (String[] args) {
        
         Scanner sc=new Scanner(System.in);
         int num = 0;
         num = Integer.parseInt(sc.nextLine());
         //System.out.println(num);
         //to hold array of details
         String[][] products = new String[num][3];
         
        
         //user input
         for(int i = 0 ; i < num ; i++){
             if(sc.hasNextLine()){
                String prod = sc.nextLine();
                products[i] = prod.split(",");
             }
             //System.out.println(products[i][1]);
             
         }
       
         //to store discount
         float[] disc_amt = new float[num];
         
         //to store index of all min values
         //int[] index = new int[num];
         
         
         //find individual discount
         for(int i = 0 ; i < num ; i++){
             
             int price = Integer.parseInt(products[i][1]);
             int disc_per = Integer.parseInt(products[i][2]);
             
             disc_amt[i] = (price * disc_per)/100;
             
         }
         
         
         //to store min value
         float min = disc_amt[0];
         
         //finding min of discount
         for(int i = 0 ; i < num ; i++){
             if(disc_amt[i] < min){
                 min = disc_amt[i];
             }
             
         }
         
         
         //print all with min disc_amt
         for(int i = 0 ; i < num ; i++){
             if(disc_amt[i] == min ){
                 
                 System.out.println(products[i][0]);
             }
             
         }
      
    }
}