public class Problem21 {
    public static boolean zogo(int[] arr){
        for(int i= 0 ; i < arr.length; i++ ){
            int t = 2 * arr[i];
            System.out.println("t :" + t);
            int a = 0 , b = arr.length-1;
            while(a <= b){
                int c = a + (b-a)/2;
                if(arr[c] == t && c!= i ){
                    return true;
                }
                if (arr[c] < t) {
                    a= c+1;
                }
                else
                {b = c-1;}
            }
        }
        return false;
    }
    public static void main (String [] args){
        int arr[]={1,3,5,7,11};
        System.out.println(zogo(arr));//false
    }
}
