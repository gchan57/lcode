class Solution {

     static int[] lpscompute(String pat){
     	int n=pat.length();
     	int[] lps=new int[n];

     	lps[0]=0;
     	int len=0;
     	int i=1;
     	while(i<n){
     		if(pat.charAt(len)==pat.charAt(i)){
     			len++;
     			lps[i]=len;
     			i++;
     		}
     		else{
     			if(len!=0){
     				len=lps[len-1];
     			}
     			else{
     				lps[i]=0;
     				i++;
     			}
     		}
     	}
     	return lps;
     }
     static String  minChar(String s){
     	int n=s.length();
     	String rev=new StringBuilder(s).reverse().toString();
     String 	si=s+"#"+rev;
     	int[] lps=lpscompute(si);
     	int need= (n-lps[lps.length-1]);
     	return rev.substring(0,need)+s;
     	
     }

    public String shortestPalindrome(String s) {
        return minChar(s);
    }
}