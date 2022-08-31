class Solution {
    public String reverseWords(String s) {
        ArrayList<String> res=new ArrayList<>();
        Stack<Character> st1=new Stack<>(),st2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                st1.push(s.charAt(i));
            }
            else{
                if(st1.isEmpty()){continue;}
                else{
                    while(!st1.isEmpty()){
                        char temp=st1.pop();
                        st2.push(temp);
                    }
                    String str = "";
                    while(!st2.isEmpty()){str+=st2.pop();}
                    res.add(str);
                }
            }
            //System.out.println(st1.toString());
        }
        if(!st1.isEmpty()){
            while(!st1.isEmpty()){
                char temp=st1.pop();
                st2.push(temp);
            }
            String str = "";
            while(!st2.isEmpty()){str+=st2.pop();}
            res.add(str);
        }
        
        s="";
        for(int i=res.size()-1;i>=0;i--){s+=res.get(i); if(i!=0){s+=" ";}}
        return s;
    }
}