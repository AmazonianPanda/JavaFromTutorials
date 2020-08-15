import java.util.Scanner;
class CinemaTicket{

    
    static int tickets(){
        
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the no of ticket:");
        int count = sc1.nextInt();
        
        if(count>4 && count < 41){
            //sc1.close();
            return count;
        } else{
            System.out.print("Minimum of 5 and Maximum of 40 Tickets");
            //sc1.close();
            return 0;
        }
    }
    
    static String refreshment(){
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Do you want refreshment:");
        String flag = sc2.nextLine();
        
        //System.out.print(flag);
        if(flag.equals("y")){
            //sc2.close();
            return "y";
        }else {
            //sc2.close();
            return "n";
        }
    }
    
    static String coupon(){
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Do you have coupon code:");
        String flag = sc3.nextLine();
        
        //System.out.print(flag);
        if(flag.equals("y")){
            //sc3.close();
            return "y";
        }else {
            //sc3.close();
            return "n";
        }
    }
    
    static String circle(){
        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter the circle:");
        //sc4.close();
        return sc4.nextLine();
        
    }
    
    static float total(int nos, String refr, String coupon , String circ){
        float ov_total = 0f;
        int ticket_cost = 0;
        float refr_c = 50f;
        float disc_bulk = 0.9f;
        float coup = 0.98f;
        float t_disc = 1f;
        
        
        //find circle
        if (circ.equals("k")){
            ticket_cost = 75;
        }else if(circ.equals("q")){
            ticket_cost = 150;
        }
        
        //find discount with coupon
        if(coupon.equals("y")){
            t_disc *= coup;
        }

        //Number of tickets
        if(nos<20){
            ov_total = nos * ticket_cost * t_disc;
        }else{
            t_disc *= disc_bulk;
            ov_total = nos * ticket_cost * t_disc;
        }
        
               //refreshment
        if (refr.equals("y")){
            ov_total += nos * refr_c;
        }
        
        
        //final value
        return ov_total;
    }

    public static void main(String[] args){
        
         
        //Scanner sc = new Scanner(System.in);
        int t_nos = tickets();
        
        float total = 0f;
        String flag_rfr ;
        int flag_bulk;
        String flag_coupon;
        String circ;
        
        if(t_nos != 0){
            
            flag_rfr = refreshment();
           
            flag_coupon = coupon();
            
            circ = circle();
            
            if(circ.equals("k") || circ.equals("q")){
                total = total(t_nos, flag_rfr, flag_coupon, circ);
                System.out.println("Ticket cost:" + total);
                
            }else{
                System.out.println("Invalid Input");
            }
            
        }
    } 
}