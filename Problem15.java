public class Problem15 {
    public boolean zoho (int arr[] , int n){
        int count = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if ( arr[i] == 0 ){
                boolean l = (i == 0 )|| (arr[i - 1] == 0) ;
                boolean r = (i == arr.length) || (arr[i + 1] == 0) ;
                if(l && r){
                    arr[i] = 1 ;
                    count++ ;
                    //System.out.println(i + " , " + count);
                }
            }
        }
        return count >= n ;
    }
    public static void main(String[] args) {
        Problem15 p = new Problem15();
        int arrays[] = {1,0,0,0,1};

        System.out.println(p.zoho(arrays, 1));
    }
}
