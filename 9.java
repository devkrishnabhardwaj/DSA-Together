// Problem: https://leetcode.com/problems/find-the-difference/
class Solution {
    public char findTheDifference(String s, String t) {
        int []hash = new int[26];
        for(int i=0;i<t.length();i++){
            hash[t.charAt(i)-97]++;
        }
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-97]--;
        }
        char res=' ';
        for(int i=0;i<26;i++){
            if(hash[i]==1) res = (char)(i+97);
        }
        return res;
    }
}
