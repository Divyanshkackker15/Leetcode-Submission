class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        StringBuilder temp = new StringBuilder();

        solve(0, 0, n, temp, ans);

        return ans;
    }

    public void solve(int open, int close, int n,
                      StringBuilder temp,
                      List<String> ans)
    {

        // Base condition
        if(open == n && close == n)
        {
            ans.add(temp.toString());
            return;
        }

        // Add opening bracket
        if(open < n)
        {
            temp.append('(');

            solve(open + 1, close, n, temp, ans);

            // Backtrack
            temp.deleteCharAt(temp.length() - 1);
        }

        // Add closing bracket
        if(close < open)
        {
            temp.append(')');

            solve(open, close + 1, n, temp, ans);

            // Backtrack
            temp.deleteCharAt(temp.length() - 1);
        }
    }

}