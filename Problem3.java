//Qn-3 What does the 'zoho' method return when given the input nums = [1,2,3,1,1,3] ? 


import java.util.HashMap;

public class Problem3 {
    public static int  zoho (int []nums){
        HashMap <Integer,Integer> hm = new HashMap<>();
        int ans = 0 ;
        for(int num : nums){
            int c = hm.getOrDefault(num, 0);
            ans += c;
            hm.put(num,c+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int []x = {1,2,3,1,1,3};
        System.out.println(zoho(x));
    }
    
}




// Explaination


/* Initialization:

HashMap<Integer, Integer> hm = new HashMap<>();
int ans = 0;
Iteration Over Array:

We loop through each element in the array and update the HashMap and ans accordingly.
Detailed Iteration:

First Iteration (num = 1):

c = hm.getOrDefault(1, 0); → c = 0 (1 is not yet in the HashMap)
ans += c; → ans = 0 + 0 = 0
hm.put(1, c + 1); → hm = {1=1}
Second Iteration (num = 2):

c = hm.getOrDefault(2, 0); → c = 0 (2 is not yet in the HashMap)
ans += c; → ans = 0 + 0 = 0
hm.put(2, c + 1); → hm = {1=1, 2=1}
Third Iteration (num = 3):

c = hm.getOrDefault(3, 0); → c = 0 (3 is not yet in the HashMap)
ans += c; → ans = 0 + 0 = 0
hm.put(3, c + 1); → hm = {1=1, 2=1, 3=1}
Fourth Iteration (num = 1):

c = hm.getOrDefault(1, 1); → c = 1 (1 is already in the HashMap with count 1)
ans += c; → ans = 0 + 1 = 1
hm.put(1, c + 1); → hm = {1=2, 2=1, 3=1}
Fifth Iteration (num = 1):

c = hm.getOrDefault(1, 2); → c = 2 (1 is already in the HashMap with count 2)
ans += c; → ans = 1 + 2 = 3
hm.put(1, c + 1); → hm = {1=3, 2=1, 3=1}
Sixth Iteration (num = 3):

c = hm.getOrDefault(3, 1); → c = 1 (3 is already in the HashMap with count 1)
ans += c; → ans = 3 + 1 = 4
hm.put(3, c + 1); → hm = {1=3, 2=1, 3=2}  */