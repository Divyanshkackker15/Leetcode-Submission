class Solution {
    public boolean isPalindrome(int x) {
       int newx=0;
       int dup=x;
       while(x>0){
        int lastnum=x%10;
        newx=(newx*10)+lastnum;
        x=x/10;
       } 
       if(newx==dup)return true;
       return false;
    }
}