// probl3m : https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card


class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int a=0,b=0;
        boolean[] hash = new boolean[arr.length+1];
        for(int i: arr){
            if(!hash[i]){
                hash[i]=true;
            }
            else a=i;
        }
        for(int i=1;i<hash.length;i++){
            if(!hash[i]) b=i; 
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(a);
        res.add(b);
        return res;
    }
}
