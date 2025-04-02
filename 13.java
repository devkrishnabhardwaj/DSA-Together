// Problem: https://leetcode.com/problems/roman-to-integer/submissions/867440410/
class Solution {
public:
    int val(char c){
        int a;
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
    int romanToInt(string s) {
        int n= s.length()-1,value = val(s.at(n));
        n--;
        while(n+1){
            
            if(val(s.at(n+1))>val(s.at(n)))
            value = value - val(s.at(n));
            else
            value += val(s.at(n));
            n--;
        }
        return value;
    }
};
