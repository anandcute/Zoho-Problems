//Qn-4 Given n = 16 , what is the output of the following code

public class Program4{

    public static boolean zoho (int n ){
        if (n == 1) return true;
        if (n == 0) return false;
        if (n % 4 != 0 ) return false;

        return zoho(n / 4);
    }

    public static void main(String[] args) {
        System.out.println(zoho(16));
    }


}