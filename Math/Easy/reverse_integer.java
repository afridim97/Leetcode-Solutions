class Solution {
    public int reverse(int x) {
     
        int a=x;
        
        if(a<0){
            
            a=0-a;
        }
        
        long rev=0;
        
        while(a>0){
            
            rev=rev*10+a%10;
            
            a=a/10;
        }
        
        if(x<0){
            
            rev=0-rev;
        }
        
        return a;
    }
}
