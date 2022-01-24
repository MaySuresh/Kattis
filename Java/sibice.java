package Java;
import java.util.*;

class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int w=sc.nextInt();
        int h=sc.nextInt();

        for(int i=0;i<n;i++){
            int ans = sc.nextInt();
            if(ans<=Math.sqrt(w*w+h*h)) System.out.println("DA");
            else System.out.println("NE");

        }

    } 
    
}
