import java.util.*;


class playbox {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int count=0;  
        //int T= sc.nextInt();
       //for(int i=0;i<T;i++){
           int n = sc.nextInt();
           String [] nArr=new String [n];
           for(int j=0;j<n;j++){ String name = sc.next(); nArr[j]=name;}
              
               for(int j = 0; j < nArr.length; j++) {  
                count = 1;  
                for(int z = j+1; z < nArr.length; z++) {  
                    if(nArr[j].equals(nArr[z])) {  
                        count++;  
                        nArr[j] = "0";  }  
                
            }
            if(count > 1 && nArr[j] != "0")  
                System.out.println(nArr[j]);    
           }              
            //Displays the duplicate word if count is greater than 1  
            
       // }  
    }  
    
}
