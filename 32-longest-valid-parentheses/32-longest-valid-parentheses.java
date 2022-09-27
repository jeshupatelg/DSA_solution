class Solution {
    public int longestValidParentheses(String s) {
        int ans=0;
        Stack<Integer>st=new Stack<>();
        st.push(-1);
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(ch==')' && st.size()>1 && s.charAt(st.peek())=='('){
                st.pop();
                ans=Math.max(ans,j-st.peek());
            }
            else{
            st.push(j);
            }
        }
        return ans;
    }
}