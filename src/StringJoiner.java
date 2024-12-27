public class StringJoiner {
    public static String join(String[] array, String delimiter) {
        if (array == null || delimiter == null) {
            return "";
        }
        return String.join(delimiter, array);
    }
}
