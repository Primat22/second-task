public class StringFormatter {
    public static String format(String format, Object... args) {
        if (format == null) {
            return "";
        }
        return String.format(format, args);
    }
}
