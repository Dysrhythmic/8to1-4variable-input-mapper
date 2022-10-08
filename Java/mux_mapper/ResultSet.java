public enum ResultSet {
    ZERO("0"),
    ONE("1"),
    X("d"),
    XComplement("d'");

    public final String value;

    ResultSet(String value) {
        this.value = value;
    }
}
