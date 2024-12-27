public class StringIndexer {
    public static int indexOf(String str, String substring) {
        if (str == null || substring == null) {
            return -1;
        }
        return str.indexOf(substring);
    }
}
