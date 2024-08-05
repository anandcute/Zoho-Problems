import java.util.Arrays;

public class Problem11 {
    
    public boolean zoho(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int lo = 0, hi = arr.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (arr[mid] == target && mid != i)
                    return true;
                if (arr[mid] < target)
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Problem11 p = new Problem11();
        int[] arr = {3,1,7,11};
        System.out.println(p.zoho(arr));
    }
}

