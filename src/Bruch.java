public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        double decimal = numerator / denominator;
        return decimal;
    }

    public String print() {
        String num = denominator + " / " + numerator;
        return num;
    }

    public Bruch multiplicate(Bruch b2) {

        int num = this.numerator * b2.getNumerator();
        int den = this.denominator * b2.getDenominator();
        return new Bruch(num, den);
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {

        int numer = this.numerator * b2.getNumerator() * b3.getNumerator();
        int denom = this.denominator * b3.getDenominator() * b3.getDenominator();
        return new Bruch(numer, denom);
    }
}
