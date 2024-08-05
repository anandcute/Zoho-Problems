public class Problem_13 {
    public static void main(String[] args) {
        int arr[] = {0,3,2,1};

        if(arr.length < 3 )
         System.out.println(false);

        int l = 0 ;
        int r = arr.length-1;
        while (l + 1 < arr.length-1 && arr[l] < arr[l+1]) {
            l++;
        }
        while(r-1 > 0 && arr[r] < arr[r-1])
            r--;
        System.out.println(l == r);    
        
    }
}