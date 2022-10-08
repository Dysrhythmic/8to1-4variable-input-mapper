public enum ResultSet {
    ZERO("0"),
    ONE("1"),
    X("x"),
    XComplement("x'");

    public final String value;

    ResultSet(String value) {
        this.value = value;
    }
}
