class Solution {
     class Pair2
    {

        int freq;
        char ch;

        Pair2(int freq,char ch)
        {
           this.ch=ch;
            this.freq = freq;
        }
    }

    public String reorganizeString(String s) {
      PriorityQueue<Pair2> pq=new PriorityQueue<>(
              (a,b)->{
                  return b.freq-a.freq;
              }
      );
      Map<Character,Integer> mp=new HashMap<>();
      for(char ch:s.toCharArray()){
          mp.put(ch,mp.getOrDefault(ch,0)+1);
      }
      for(char key:mp.keySet()){
          pq.add(new Pair2(mp.get(key),key ));
      }
      StringBuilder res=new StringBuilder();
      Pair2 prev=null;

      while(!pq.isEmpty()){
      Pair2 curr=pq.poll();


      res.append(curr.ch);
      curr.freq--;

      if(prev!=null && prev.freq>0){
  pq.add(prev);
      }

      prev=curr;
      }
        if(res.length() != s.length()) return "";

        return res.toString();
    }
}