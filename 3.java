// problem : https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1?page=1

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int p = a*b;
        while(b !=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int [] res = new int[2];
        res[1]=a;
        res[0]= p/a;
        return res;
    }
}
