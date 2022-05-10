public class App {
    public static void main(String[] args) throws Exception {
        
                int[] nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}; 
                int finalProduct = 1;
             
                for(int i = 0; i < nums.length; i++){
                 finalProduct = finalProduct * nums[i];   
                }
                System.out.println(finalProduct);
                System.out.println(signFunc(finalProduct));
            
            
           
        
    }
    public static int signFunc(int x){
        if(x >= 1 ){
            return 1;
        }else if(x <=-1 ){
            return -1;
        }else{
          return 0;  
        } 
       }
}
