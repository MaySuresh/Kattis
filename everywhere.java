import java.util.*;

class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
       int T = sc.nextInt();

       for(int i=0;i<T;i++){
           int n = sc.nextInt();
           String [] nameArr = new String[n];
           int count =1;
           for(int j=0;j<n;j++){
               String name = sc.next();
               nameArr[j] = name;
            }
            for(int j=0;j<nameArr.length;j++){
                for(int z=j+1;z<nameArr.length;z++){
                    if(nameArr[j].equals(nameArr[z])) count++; nameArr[z]="0";
                }
            }
            System.out.println(Arrays.toString(nameArr));
           
        
       }

    }
    
}
