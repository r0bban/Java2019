package UI;

public class UI {

    public static String fixedLengthString(String string, int length) {
        return String.format("%1$" + -length + "s", string);
    }

    public static String fixedLengthIntToString(int value, int length) {
        return String.format("%1$" + -length + "s", value);
    }

}
