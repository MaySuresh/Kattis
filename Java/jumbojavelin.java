package Java;
import java.util.*;

class main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int total =0;
        for(int i =0;i<N;i++){
            int l = sc.nextInt();
            total +=(l);

        }
        System.out.println(total-(N-1));

    }


}
