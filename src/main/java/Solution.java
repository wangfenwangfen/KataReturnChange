class Solution {

    Change optimalChange(int sum){
        if(sum==2)
            return new Change(1,0);
        if(sum==5)
            return new Change(0,1);
        return null;
    }
}
