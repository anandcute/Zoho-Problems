// Qn - 5 What does the zoho  method return the when given the input  n= 6 ? 

public class Program5 {

    public static boolean zoho(int n ){

        if(n == 1)
            return false;
        else
           return !zoho(n-1);

    }
    public static void main(String[] args) {
       
        System.out.println(zoho(6));
    }
}
