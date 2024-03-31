public enum Discount {
    NONE(0),
    BRONZE_CARD(0.05),
    SILVER_CARD(0.15),
    GOLDEN_CARD(0.25);
    private final double percent;

    Discount(double percent) {
        this.percent = percent;
    }

    public double getValue() {
        return percent;
    }
}
