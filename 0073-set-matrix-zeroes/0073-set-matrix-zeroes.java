class Solution {

    public void setZeroes(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;

        int col0 = 1;

        // Step 1: Mark rows and columns
        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(arr[i][j] == 0) {

                    // mark row
                    arr[i][0] = 0;

                    // mark column
                    if(j != 0) {
                        arr[0][j] = 0;
                    }
                    else {
                        col0 = 0;
                    }
                }
            }
        }

        // Step 2: Traverse from back and fill zeroes
        for(int i = 1; i < n; i++) {

            for(int j = 1; j < m; j++) {

                if(arr[i][j] != 0) {

                    if(arr[i][0] == 0 || arr[0][j] == 0) {

                        arr[i][j] = 0;
                    }
                }
            }
        }

        // Step 3: First row
        if(arr[0][0] == 0) {

            for(int j = 0; j < m; j++) {

                arr[0][j] = 0;
            }
        }

        // Step 4: First column
        if(col0 == 0) {

            for(int i = 0; i < n; i++) {

                arr[i][0] = 0;
            }
        }
    }
}