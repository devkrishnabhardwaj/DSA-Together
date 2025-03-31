//Problem : https://leetcode.com/problems/count-primes/
class Solution {
    public int countPrimes(int n) {
        int count=0;
        int prime[] = new int [n];
        for(int i=2;i<n;){
            boolean isPrime=true;
            int sqr = (int)Math.sqrt(i);
            for(int j=0;j<count && prime[j]<=sqr;j++){
                if(i%prime[j]==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                prime[count]=i;
                count++;
            }
            if(i%2==1) i+=2;
            else i++;
        }
        return count;
    }
}
