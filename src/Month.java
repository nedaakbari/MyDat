public enum Month {
    FARVARDIN(1), ORDIBEHESHT(2), KHORDAD(3),
    TIR(4), MORDAD(5), SHAHRIVAR(6),
    MEHR(7), ABAN(8), AZAR(9),
    DEY(10), BAHMAN(11), ESFAND(12);
    private int abbr;

    Month(int abbr) {
        this.abbr = abbr;
    }

    public void setAbbr(int abbr) {
        this.abbr = abbr;
    }

    public int getAbbr() {
        return abbr;
    }
}
