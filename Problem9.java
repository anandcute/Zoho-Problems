public class Problem9 {
    
        public boolean zoho(String s) {
            int i = 0;
            int j = s.length() - 1;
            while (i <= j) {
                if (s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                } else return help(s, i + 1, j) || help(s, i, j - 1);
            }
            return true;
        }
    
        public boolean help(String s, int i, int j) {
            while (i <= j) {
                if (s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                } else return false;
            }
            return true;
        }
   
    
    public static void main(String[] args) {
       Problem9 p = new Problem9();
       System.out.println(p.zoho("aba")); // true
    }
}
