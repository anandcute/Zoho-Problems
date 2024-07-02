
//'zoho ' method returns input nums = [1,1,1,2,3,3,4]


public class Problem1{

    public static int zoho(int [] nums){
        int ans =0;
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i + 1  ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    ans++;
                    
                }
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int x []= {1,1,1,2,3,3,4}; 
       System.out.println(zoho(x));

    //    int s = 5 >>  1; 
    //    System.out.println(s); 
        
    }
}

// output : 4 