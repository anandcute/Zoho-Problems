//Qn-7 What does the zoho method return when given the input nums=[1,2,3]

import java.util.Arrays;

public class Program7 {
    public int [] zoho (int[] nums){
        int [] ans = new int[2*nums.length];

        for(int i = 0 ; i< nums.length ; i++){
            ans[i] = ans[i+nums.length] = nums[i];
            System.out.println("i : " + i + " " + ans[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Program7 p = new Program7();
        int x [] = {1,2,3};

        System.out.println(Arrays.toString(p.zoho(x)));
    }
}
