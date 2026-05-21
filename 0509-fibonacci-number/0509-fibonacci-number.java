class Solution {
    public Map<Integer,Integer> mp = new HashMap<>();

    public int fib(int n) {
        if(n==0 || n==1)return n;

         if(mp.containsKey(n)){
            return mp.get(n);
        }

        int a1=fib(n-1);
        int a2=fib(n-2);
        int ans=a1+a2;

        mp.put(n, ans);

        return fib(n-1)+fib(n-2);


    }
}