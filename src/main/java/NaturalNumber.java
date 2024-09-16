public class NaturalNumber {

    private int naturalNumber;

    private NaturalNumber() {
    }

    private NaturalNumber(int naturalNumber) {
        this.naturalNumber = naturalNumber;
    }

    public static NaturalNumber from(int naturalNumber) {
        if (naturalNumber < 1) {
            throw new IllegalArgumentException("Natural number must be a positive integer");
        }
        return new NaturalNumber(naturalNumber);
    }

    public int getNaturalNumber() {
        return naturalNumber;
    }
}
