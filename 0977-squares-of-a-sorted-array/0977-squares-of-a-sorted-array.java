class Solution {
    public int[] sortedSquares(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        int k=n-1;
        int []temp=new int[n];
        while(left<=right){
              int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if(leftSq>rightSq){
            temp[k]=leftSq;
            k--;
            left++;
            }
            else{
                temp[k]=rightSq;
                k--;
                right--;
            }
        }
        return temp;
    }
}