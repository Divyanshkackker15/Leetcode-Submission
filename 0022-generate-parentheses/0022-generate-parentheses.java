class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();

        StringBuilder sb=new StringBuilder();

        solve(0,0,n,sb,ans);

     return ans;

        
    }
public static void solve(int open,int close,int n,StringBuilder sb,List<String> ans){
 
 if(open==n && close == n){
    ans.add(sb.toString());
    return ;

 }
if(open<n){
    sb.append('(');
    solve(open+1,close,n,sb,ans);

    sb.deleteCharAt(sb.length()-1);
}

if(open>close){

    sb.append(')');

    solve(open,close+1,n,sb,ans);

    sb.deleteCharAt(sb.length()-1);
}




    }
}