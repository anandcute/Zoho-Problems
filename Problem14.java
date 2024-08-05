public class Problem14 {
    public int zoho(int A[] , int target){
        int low =0 ; 
        int high = A.length-1;
        while (low <= high) {
            int mid = low + high / 2 ; 
            if(A[mid] == target)
                return mid;
            else if (A[mid] > target)
                high= mid -1 ;
            else 
             low = mid + 1 ;        
        }
        return low;
    }
    public static void main(String[] args) {
        Problem14 p = new Problem14();
        int A[] = {1,3,5,6};

        System.out.println(p.zoho(A, 7));
    }
}
