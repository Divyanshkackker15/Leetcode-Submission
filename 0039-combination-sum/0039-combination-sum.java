class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> dairy = new ArrayList<>();

        int n = candidates.length;

        solve(candidates, n, 0, dairy, ans, target, 0);

        return ans;

    }

  public void solve(int[] arr,
                      int n,
                      int idx,
                      List<Integer> dairy,
                      List<List<Integer>> ans,
                      int target,
                      int sum){

         if(idx == n){

            if(sum == target){
                ans.add(new ArrayList<>(dairy));
            }

            return;
        }

        solve(arr, n, idx + 1, dairy, ans, target, sum);

        if(arr[idx] + sum <= target){

            dairy.add(arr[idx]);

            sum += arr[idx];

            solve(arr, n, idx, dairy, ans, target, sum);

            dairy.remove(dairy.size() - 1);

            sum -= arr[idx];
        }
    }
}