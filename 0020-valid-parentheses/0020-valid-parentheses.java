class Solution {
    public boolean isValid(String s) {
        // Stack<Character> st=new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)== '(' || s.charAt(i)== '{' || s.charAt(i) == '[' ) st.push(s.charAt(i));
        //     else{
        //         if(st.isEmpty()) return false;
        //         char top=st.pop();
        //         if(s.charAt(i)==')'){
        //             if(top!='(') return false;
        //         }
        //         if(s.charAt(i)=='}'){
        //             if(top!='{') return false;
        //         }
        //         if(s.charAt(i)==']'){
        //             if(top!='[') return false;
        //         }
        //     }
        // }
        // if(!st.isEmpty()) return false;
        // else return true;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') st.push(s.charAt(i));
            else{
                if(st.isEmpty()) return false;
                char c=st.pop();
                if(s.charAt(i)==')'){ 
                    if(c!='(') return false;
                }
                if(s.charAt(i)=='}'){ 
                    if(c!='{') return false;
                }
                if(s.charAt(i)==']'){ 
                    if(c!='[') return false;
                }   
            }
        }
         if(!st.isEmpty()) return false;
         else return true;
    }
}