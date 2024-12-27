///Библиотека для работы со строками. Реализация операций split, join, replace, ,equalsIgnoreCase, indexOf, format 
public class Main {
    public static void main(String[] args) {
        // split
        String[] parts = StringSplitter.split("яблоко,банан,апельсин", ",");
        System.out.println("Результат split: " + java.util.Arrays.toString(parts));

        // join
        String joined = StringJoiner.join(parts, " - ");
        System.out.println("Результат join: " + joined);

        // replace
        String replaced = StringReplacer.replace("привет мир", "мир", "Java");
        System.out.println("Результат replace: " + replaced);

        // equalsIgnoreCase
        boolean equal = StringComparer.equalsIgnoreCase("java", "JAVA");
        System.out.println("Результат equalsIgnoreCase: " + equal);

        // indexOf
        int index = StringIndexer.indexOf("привет мир", "мир");
        System.out.println("Результат indexOf: " + index);

        // format
        String formatted = StringFormatter.format("Привет, %s! У вас %d новых сообщений.", "Алиса", 5);
        System.out.println("Результат format: " + formatted);
    }
}
