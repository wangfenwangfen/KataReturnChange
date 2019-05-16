class Change {
    private int coin2;
    private int bill5;
    private  int bill10;

    Change(int coin2, int bill5, int bill10) {
        this.coin2 = coin2;
        this.bill5 = bill5;
        this.bill10 = bill10;
    }

    @Override
    public String toString() {
        return "Change{" +
                "coin2=" + coin2 +
                ", bill5=" + bill5 +
                ", bill10=" + bill10 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Change change = (Change) o;

        if (coin2 != change.coin2) return false;
        if (bill5 != change.bill5) return false;
        return bill10 == change.bill10;
    }

    @Override
    public int hashCode() {
        int result = coin2;
        result = 31 * result + bill5;
        result = 31 * result + bill10;
        return result;
    }
}
