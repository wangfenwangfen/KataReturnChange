class Solution {

    Change optimalChange(int sum) {
        int nombreCoin2 = 0;
        int nombreBill5 = 0;
        int nombreBill10 = 0;

        if (sum != 1) {

            int rest = sum;

            if (rest >= 10) {
                rest = sum % 10;
                nombreBill10 = (sum - rest) / 10;
            }
            if (rest == 5 ) {
                sum = rest;
                rest = sum % 5;
                nombreBill5 = (sum - rest) / 5;
            }

            if (rest >= 2) {
                sum = rest;
                rest = sum % 2;
                nombreCoin2 = (sum - rest) / 2;
            }
            return new Change(nombreCoin2, nombreBill5, nombreBill10);
        }

        return null;
    }
}
