class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int[] ans = new int[k];
        int n=arr.length;
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> a.freq - b.freq
        );
        for(int key: mp.keySet()){
            pq.add(new Pair(key,mp.get(key)));

            if(pq.size()>k){
                pq.poll();
            }

        }
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().num;
        }

return ans;
    }


    


        
    
    class Pair{
        int num;
        int freq;

        Pair(int num,int freq){
            this.num=num;
            this.freq=freq;
        }
    }
}