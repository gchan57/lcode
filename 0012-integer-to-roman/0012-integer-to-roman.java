class Solution {
    public String intToRoman(int num) {
        int[] base={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] sym={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        StringBuilder res=new StringBuilder();
        int i=base.length-1;
        while(num>0){
            int inter=num/base[i];
            while(inter>0){
                res.append(sym[i]);
                inter--;
            }
            num=num%base[i];
            i--;
        }
        return res.toString();
    }
}