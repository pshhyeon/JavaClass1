public class CurrencyConverter {
    static double rate;
    static double dollar;
    static double kwr;

    static void setRate(int num) {
        rate = num;
    }

    static double toDollar(int num) {
        dollar = num / rate;
        return dollar;
    }

    static double toKWR(int num) {
        kwr = num * rate;
        return kwr;
    }

}
