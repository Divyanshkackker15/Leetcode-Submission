class Solution {
    public int reverse(int x) {
        int revno=0;
        int ld=0;
        while(x != 0){
            ld=x%10;
            x=x/10;
             if ((revno > 0 && revno > (Integer.MAX_VALUE - ld) / 10) || 
                (revno < 0 && revno < (Integer.MIN_VALUE - ld) / 10)) {
                return 0;
            }
            revno=(revno*10)+ld;
        }
        return revno;
    }
}