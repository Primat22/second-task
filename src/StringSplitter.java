public class StringSplitter {
    public static String[] split(String str, String delimiter) {
        if (str == null || delimiter == null) {
            return new String[0];
        }
        return str.split(delimiter);
    }
}
