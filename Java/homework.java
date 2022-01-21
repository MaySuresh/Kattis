package Java;
import java.util.*;


class main {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String [] split = in.split(";");
        int count =0;
        
       
        for (int i =0;i<split.length;i++){
            String [] dash = split[i].split("-");
                       
            if(dash.length==1){
                count++;
            }if(dash.length==2){
                count += Integer.parseInt(dash[1])-Integer.parseInt(dash[0])+1;


            }
            
        }
        System.out.println(count);

    
                  
        


    }

    
}
