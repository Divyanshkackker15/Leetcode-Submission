class Solution {
    public int addDigits(int n) {
    //    here apan ne base condition single digit rkhi haiii

        if(n < 10){
            return n;
        }

        int sum = sumOfDigits(n);

        return addDigits(sum);
    }
    

    public int sumOfDigits(int n){
        if(n==0)return 0;
       
       int d=n%10;

       n=n/10;

       int ans=addDigits(n);

       return d+ans;
    }
}