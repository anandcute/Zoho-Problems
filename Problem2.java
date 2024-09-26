// QN-2 Given num = 5 , What is the output of the code
import java.util.Arrays;
public class Problem2 {

    public static int[] zoho (int num){
        int [] f = new int [num+1];
        for (int i = 1 ; i <= num; i ++ ){
            f[i] = f [i >> 1] + (i & 1);
           // System.out.println(i + " " + f[i]);
        }
        return f;
    }
    public static void main(String[] args) {
        
        
        System.out.println(Arrays.toString(zoho(5)));
    }
}
