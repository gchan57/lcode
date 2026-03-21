class Solution {
    public int romanToInt(String s) {
     int n=s.length() ;
     int ans=0;
     int previousNum=0;
     for(int i=n-1;i>=0;i--){
        int num=0;
        if(s.charAt(i)=='I'){
            num=1;
        }
        else if(s.charAt(i)=='V'){
            num=5;
        }
        else if(s.charAt(i)=='X'){
            num=10;
        }
        else if(s.charAt(i)=='L'){
            num=50;
        }
        else if(s.charAt(i)=='C'){
            num=100;
        }
        else if(s.charAt(i)=='D'){
            num=500;
        }
        else if(s.charAt(i)=='M'){
            num=1000;
        }
        if(num<previousNum){
            ans=ans-num;
        }
        else{
            ans=ans+num;
        }
        previousNum=num;
     }  
     return ans;
    }
}