public enum ResultSet {
    ZERO("0"),
    ONE("1"),
    D("d"),
    DComplement("d'");

    public final String value;

    ResultSet(String value) {
        this.value = value;
    }
}
