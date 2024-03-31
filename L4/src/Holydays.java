public enum Holydays {
    FEMALE_DAY("08-03"),
    MALE_DAY("23-02"),
    COMMON_DAY("01-01");
    private final String date;
    Holydays(String s) {
        this.date = s;
    }
    public String getValue(){
        return date;
    }
}
