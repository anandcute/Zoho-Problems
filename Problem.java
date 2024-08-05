public class Problem {

    public int zoho(String str1, String str2) {

        int num = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.indexOf(str2.charAt(i)) != -1)
                num++;
        }
        return num;
    }

    public static void main(String[] args) {
        Problem p = new Problem();
        System.out.println(p.zoho("aA", "aAAbbbb")); // 3

    }
}
