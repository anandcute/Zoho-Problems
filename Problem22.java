public class Problem22 {
    public static int  zoho(int []nums){
        return help(nums,0,Integer.MAX_VALUE,0);
    }
    private static int help(int nums[],int i,int a,int b ){
        if(i==nums.length){
            return b;
        }
        int diff = nums[i] - a;
        b= Math.max(diff, b);
        a= Math.min(a, nums[i]);
        return help(nums,++i,a,b);
    }
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6};
        System.out.println(zoho(nums));
    }
}
