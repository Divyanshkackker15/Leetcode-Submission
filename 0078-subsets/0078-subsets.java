class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>> ans=new ArrayList<>();

        List<Integer> dairy=new ArrayList<>();

        solve(nums,0,ans,dairy);

        return ans;
    }

    public void solve(int[]nums,int idx,List <List<Integer>> ans, List<Integer> dairy){

        if(idx==nums.length)
        {
            ans.add(new ArrayList<>(dairy));
            return;
        }
        // mth lo
        solve(nums,idx+1,ans,dairy);

        dairy.add(nums[idx]);

        solve(nums,idx+1,ans,dairy);

        dairy.remove(dairy.size()-1);

    }
}
