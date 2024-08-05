import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int num[] = {6,5,4,8};//0,0,0,0,1,1,1,0,1
        int temp[] = new int[101];
        for (int i = 0 ; i < num.length ; i++) {
            temp[num[i]] += 1;
        }
       // System.out.println( " Fiest : " + Arrays.toString(temp));
   
        for (int i = 1 ; i <= 100 ; i++){
            temp[i] += temp[i-1];
        }
        //System.out.println( "Second " + Arrays.toString(temp));
        for (int k = 0 ; k < num.length ; k++){
            int pov = num[k];
            num[k]= pov==0 ? 0 : temp[pov-1];
        }
        System.out.println(Arrays.toString(num));
    }
}
