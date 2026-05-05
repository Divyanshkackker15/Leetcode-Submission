class Solution {
    class Pair {
        int num;
        int freq;

        Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b)->{
               return b.freq-a.freq;
            }
        );

        for(int key: mp.keySet()){
            pq.add(new Pair(key,mp.get(key)));
        }  

        for(int i=0;i<k;i++){
            ans[i]=pq.poll().num;
        }

return ans;
       
    }
}