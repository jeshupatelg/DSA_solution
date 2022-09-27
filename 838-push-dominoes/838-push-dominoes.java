class Solution {
    public String pushDominoes(String dominoes) {
        int st=0,en=0;
        char[] arr=dominoes.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] == '.' && i!=arr.length-1){continue;}
            else{
                en=i;
                if(arr[st] == '.' || arr[en] == '.'){
                    if(arr[st] == 'R'){
                        for(int j=st;j<=en;j++){
                            arr[j]='R';
                        }
                    }
                    else if(arr[en] == 'L'){
                        for(int j=st;j<=en;j++){
                            arr[j]='L';
                        }
                    }
                }
                else if(arr[st] == arr[en]){
                    for(int j=st;j<=en;j++){
                            arr[j]=arr[st];
                        }
                }
                else if(arr[st] == 'R' && arr[en] == 'L'){
                    int mid=st+(en-st)/2;
                    if((en-st)%2==0){
                        for(int j=st;j<mid;j++){arr[j]='R';}
                    }
                    else{
                        for(int j=st;j<=mid;j++){arr[j]='R';}
                    }
                    for(int j=mid+1;j<=en;j++){arr[j]='L';}
                }
                st=en;
            }
        }
        return new String(arr);
    }
}