class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0,col=0;
        int st=0,en=matrix.length-1;
        if(matrix[en][0]<=target){row=en; en=-1;}
        if(matrix[st][0]>target){return false;}
        while(st<=en){
            int mid=st+(en-st)/2;
            //System.out.println("1- "+matrix[mid][0]);
            if(matrix[mid][0]<=target && matrix[mid+1][0]>target){row = mid; break;}
            else if(matrix[mid][0]<target){st=mid;}
            else{en=mid;}
        }
        st=0;
        en=matrix[row].length-1;
        
        while(st<=en){
            if(matrix[row][en]==target){return true;}
            if(matrix[row][st]==target){return true;}
            int mid=st+(en-st)/2;
            //System.out.println("2- "+matrix[row][mid]);
            if(matrix[row][mid]==target){return true;}
            else if(matrix[row][mid]<target){st=mid+1;}
            else {en=mid-1;}
        }
        return false;
    }
}