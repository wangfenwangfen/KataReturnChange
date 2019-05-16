class Solution {

    Change optimalChange(int sum) {
        int nombreCoin2 = 0;
        int nombreBill5 = 0;
        int nombreBill10 = 0;

        if (sum != 1) {

            if (sum % 10 == 0) {
                nombreBill10 = sum / 10;
                return new Change(nombreCoin2, nombreBill5, nombreBill10);
            }
            if (sum == 5) {
                nombreBill5 = sum / 5;
                return new Change(nombreCoin2, nombreBill5, nombreBill10);
            }

            if (sum % 2 == 0) {
                nombreCoin2 = sum / 2;
                return new Change(nombreCoin2, nombreBill5, nombreBill10);
            }
        }

        return null;
    }
}
