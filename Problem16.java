import java.util.Arrays;

public class Problem16 {
    public static int[] zoho (int num){
        int f [] = new int[num+1];
        for(int i = 1 ; i <= num ; i++){
            f[i] = f [i >> 1] + (i & 1);
            System.out.println(Arrays.toString(f));
        }
        return f;
    }
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(zoho(5)));
        
    
    }
}
