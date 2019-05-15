class Change {
    private int coin2;
    private int bill5;

    Change(int coin2, int bill5) {
        this.coin2 = coin2;
        this.bill5 = bill5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Change change = (Change) o;

        return coin2 == change.coin2;
    }

    @Override
    public int hashCode() {
        return coin2;
    }
}
