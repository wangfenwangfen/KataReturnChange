class Change {
    private long coin2;
    private long bill5;
    private  long bill10;

    Change(long coin2, long bill5, long bill10) {
        this.coin2 = coin2;
        this.bill5 = bill5;
        this.bill10 = bill10;
    }

    long calculateSum(){
        return coin2*2+bill5*5+bill10*10;
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
        int result = (int) (coin2 ^ (coin2 >>> 32));
        result = 31 * result + (int) (bill5 ^ (bill5 >>> 32));
        result = 31 * result + (int) (bill10 ^ (bill10 >>> 32));
        return result;
    }
}
