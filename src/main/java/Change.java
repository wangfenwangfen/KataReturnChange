class Change {
    private int coin2;

    Change(int coin2) {
        this.coin2 = coin2;
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
