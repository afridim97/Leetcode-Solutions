class Solution {
    public boolean isValid(String s) {
        
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        
        map.put(')','(');
        
        map.put(']','[');
        
        map.put('}','{');
        
        Stack<Character> stacc=new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            
            char c=s.charAt(i);
            
            if(map.containsKey(c)){
                
            char topel=stacc.empty()?'#':stacc.pop();
            
                if(topel!=map.get(c)){
                    
                    return false;
                }
            }
                else{
                    
                    stacc.push(c);
                }
            }
        }
    }
}
