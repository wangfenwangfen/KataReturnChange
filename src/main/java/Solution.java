class Solution {

    private static final int SUM_NO_GIVEN_CHANGE = 1;
    private static final int VALUE_BILL10 = 10;
    private static final int VALUE_BILL5 = 5;
    private static final int VALUE_COIN2 = 2;

    Change optimalChange(int sum) {
        int nombreCoin2 = 0;
        int nombreBill5 = 0;
        int nombreBill10 = 0;

        if (sumIsPossibleToGivenChange(sum)) {
            int rest = sum;

            if (shouldUseBille10(rest)) {
                rest = sum % VALUE_BILL10;
                nombreBill10 = (sum - rest) / VALUE_BILL10;
            }
            if (shouldUseBill5(rest)) {
                sum = rest;
                rest = sum % VALUE_BILL5;
                nombreBill5 = (sum - rest) / VALUE_BILL5;
            }
            if (shouldUseCoin2(rest)) {
                sum = rest;
                rest = sum % VALUE_COIN2;
                nombreCoin2 = (sum - rest) / VALUE_COIN2;
            }
            if(!sumIsPossibleToGivenChange(rest)){
                return null;
            }
            return new Change(nombreCoin2, nombreBill5, nombreBill10);
        }
        return null;
    }

    private boolean shouldUseCoin2(int rest) {
        return rest >= VALUE_COIN2;
    }

    private boolean shouldUseBill5(int rest) {
        return rest>6||rest == VALUE_BILL5;
    }

    private boolean shouldUseBille10(int rest) {
        return rest >= VALUE_BILL10;
    }

    private boolean sumIsPossibleToGivenChange(int sum) {
        return sum != SUM_NO_GIVEN_CHANGE;
    }
}
