class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        int[][] proj=new int[n][2];
        for(int i=0;i<n;i++){
            proj[i][0]=capital[i];
            proj[i][1]=profits[i];
        }
 
       Arrays.sort(proj,(a,b)->a[0]-b[0]);

        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b)->b-a
        );

        int i=0;
        for(int j=0;j<k;j++){

          while(i<n && proj[i][0]<=w){
            pq.add(proj[i][1]);
            i++;

          }
          if(pq.isEmpty())break;

          w+=pq.poll();
        
        }
        return w;


        
    }
}