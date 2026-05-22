class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        int left = 0;
        int right = n - 1;
        int k = n - 1;

        while (left <= right) {
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if (leftSq > rightSq) {
                temp[k--] = leftSq;
                left++;
            } else {
                temp[k--] = rightSq;
                right--;
            }
        }

        return temp;
    }
}