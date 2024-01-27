public class MyExp {
    int base;
    int exp;

    int getValue() {
        int value = 1;
        for (int i = 0; i < exp; i++) {
            value = base * value;
        }
        return value;
    }
}
