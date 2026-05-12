class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");

        return check(s,0,s.length()-1);
    }

 public boolean check(String s,int low,int high){
   if(low>=high)return true;

   if(s.charAt(low)!=s.charAt(high))return false;

   return check(s,low+1,high-1);
    }
}