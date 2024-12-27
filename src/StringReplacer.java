public class StringReplacer {
    public static String replace(String str, String target, String replacement) {
        if (str == null || target == null || replacement == null) {
            return str;
        }
        return str.replace(target, replacement);
    }
}
