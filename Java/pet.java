package Java;
import java.util.*;

class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] score = new int [5];
        int mark=0;
        int max;        
        int count=0;

        for(int i=0;i<5;i++){int point =0;
            for(int j=0;j<4;j++){
                mark=sc.nextInt();
                point+=mark;
                score[i]=point;
            } 
        }
        max = score[0];
        for(int i=0;i<score.length;i++){
            if(max<=score[i]){

             max=score[i]; count =i+1;
            }
        }
        System.out.println(count+" "+max);



    }
    
}
