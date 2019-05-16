class Solution {

    Change optimalChange(int sum){
        int nombreCoin2;
        int nombreBill5;
        int nombreBill10;

        if(sum==10) {
            return new Change(0, 0, 1);
        }
        if(sum==5) {
            return new Change(0, 1, 0);
        }

        if(sum%2==0) {
            nombreCoin2 = sum/2;
            nombreBill5 = 0;
            nombreBill10 = 0;
            return new Change(nombreCoin2, nombreBill5, nombreBill10);
        }
        return null;
    }
}
