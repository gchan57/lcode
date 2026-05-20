class Solution {

    public String strbuilder(String str){
        int[] freq=new int[26];
        char[] carray=str.toCharArray();
        for(char a:carray){
            freq[a-'a']++;
        }
        char c='a';
        StringBuilder finalstring=new StringBuilder();
        for(int a:freq){
            if(a>0){
            finalstring.append(c);
            finalstring.append(a);
            }
            c++;
        }
        return finalstring.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0) return new ArrayList<>();
        Map<String,ArrayList<String>> strmap=new HashMap<>();
        for(String s:strs){
            String builtString=strbuilder(s);
            if(strmap.containsKey(builtString)){
                strmap.get(builtString).add(s);
            }
            else{
                ArrayList<String> newList=new ArrayList<>();
                newList.add(s);
                strmap.put(builtString,newList);
            }
        }
        return new ArrayList<>(strmap.values());
    }
}