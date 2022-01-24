package Java;
import java.util.*;
class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] inArr= new int[6];
        int[] chess = {1,1,2,2,2,8};
        for(int i =0;i<6;i++){
            inArr[i]=sc.nextInt();
            if(inArr[i]==chess[i])inArr[i]=0;                  
            else inArr[i]=chess[i]-inArr[i];
            System.out.print(inArr[i]+" ");
        }
        
    } 
    
}
