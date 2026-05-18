class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();

        if(digits.length()==0)
        return ans;

        Map<Character,String> mymap=new HashMap<>();

        mymap.put('2', "abc");
        mymap.put('3', "def");
        mymap.put('4', "ghi");
        mymap.put('5', "jkl");
        mymap.put('6', "mno");
        mymap.put('7', "pqrs");
        mymap.put('8', "tuv");
        mymap.put('9', "wxyz"); 

        StringBuilder dairy=new StringBuilder();

        solveLetter(digits,digits.length(),0,dairy,ans,mymap);

        return ans;

        
    }

    public void solveLetter(String str,int n,int idx,StringBuilder dairy,List<String> ans,Map<Character,String> mymap){

        if(idx==n){
            ans.add(dairy.toString());
            return;
        }

        String choice=mymap.get(str.charAt(idx));

        for(int j=0;j<choice.length();j++){
            dairy.append(choice.charAt(j));

            solveLetter(str,n,idx+1,dairy,ans,mymap);

            dairy.deleteCharAt(dairy.length()-1);
    

        }




    }
}