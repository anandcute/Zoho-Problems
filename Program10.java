import java.util.Arrays;

public class Program10 {
    public int[] zoho(int[] arr){
        int[] result = new int[101];
        for (int i = 0 ; i< arr.length ; i++){
            result[arr[i]]+= 1;
        }
        for(int j = 1 ; j <=100; j++){
            result[j] += result[j-1];
        }
        for(int k= 0; k< arr.length;k++){
            int pos = arr[k];
            arr[k]=pos == 0 ? 0 : result[pos-1];
        }
            
        return arr;
    }
    public static void main(String[] args) {
        Program10 p = new Program10();
        int[] arr = {6,5,4,12};
        // int result[] = ;
        System.out.println(Arrays.toString(p.zoho(arr)));
        int nums[] = {1,2,3};
        int ans[] = new int[2*nums.length];

        for(int i = 0 ; i < nums.length ; i++ ){
            ans[i] = ans[i + nums.length] = nums[i];
        }
        System.out.println("Arrays: "+Arrays.toString(ans));
    }
}
