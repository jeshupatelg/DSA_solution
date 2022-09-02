class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){return "";}
        if(strs.length==1){return strs[0];}
        int length=0;
        String res="";
        int i=0;
        while(i<Math.min(strs[0].length(),strs[1].length()) && strs[0].charAt(i) == strs[1].charAt(i)){length++; i++;}
        if(length==0){return res;}
        else{res=strs[0].substring(0,length);}
        
        for(i=2;i<strs.length;i++){
            if(strs[i].indexOf(res)!=0){
                int len=0,j=0;
                while(j<Math.min(strs[i].length(),res.length()) && res.charAt(j) == strs[i].charAt(j) && len<length){len++; j++;}
                if(len==0){return "";}
                else{res=res.substring(0,len); length=len;}
            }
        }
        return res;
    }
}