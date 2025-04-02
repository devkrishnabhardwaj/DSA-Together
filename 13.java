// Problem: https://leetcode.com/problems/roman-to-integer/submissions/867440410/
class Solution {
    public static int value(char c){
        int a=0;
        switch(c){
            case 'I' : a=1; break;
            case 'V' : a=5; break;
            case 'X' : a=10; break;
            case 'L' : a=50; break;
            case 'C' : a=100; break;
            case 'D' : a=500; break;
            case 'M' : a=1000; break;
        }
        return a;
    }
    public int romanToInt(String s) {    
        int num=value(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            int temp = value(s.charAt(i));
            if(value(s.charAt(i+1))<=temp){
                num = num + temp;
            }
            else{
                num = num - temp;
            }
        }
        return num;
    }
}
