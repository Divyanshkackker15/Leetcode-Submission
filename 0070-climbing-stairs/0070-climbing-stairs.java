class Solution {
        Map<Integer,Integer> mp = new HashMap<>();

    public int climbStairs(int n) {
   return fun(0,n);
    }
    public int fun(int i,int n){
           if(i == n){
            return 1;
        }
        if(i>n){
            return 0;
        }
if(mp.containsKey(i)){
            return mp.get(i);
        }

        int ans1 = fun(i + 1, n);

        int ans2 = fun(i + 2, n);

        int ans = ans1 + ans2;

        mp.put(i, ans);

        return ans;
    }
}