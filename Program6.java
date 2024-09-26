
//Qn - 6 What does the zoho method return when given the inptu arr = [0,3,2,1,4]

public class Program6 {

    public static boolean zoho(int [] arr){
        if(arr.length < 3)
            return false;
        int i = 0 ;
        int r = arr.length-1;
        
        while(i + 1 < arr.length-1 && arr[i] < arr[i+1])
                i++;
            while (r-1 > 0 && arr[r] < arr [r - 1]) {
                r--;
            } 
        return i == r ;       
    }

    public static void main(String[] args) {
         int x [] = {0,3,2,1};
        System.out.println(zoho(x));
    }
    
}
