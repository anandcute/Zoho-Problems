import java.util.Arrays;

public class Program10 {
    public int[] zoho(int[] arr){
        int[] result = new int[9];
        for (int i = 0 ; i< arr.length ; i++){
            result[arr[i]]+= 1;
        }
            
        return result;
    }
    public static void main(String[] args) {
        Program10 p = new Program10();
        int[] arr = {6,5,4,8};
        // int result[] = ;
        System.out.println(Arrays.toString(p.zoho(arr)));

        
    }
}
