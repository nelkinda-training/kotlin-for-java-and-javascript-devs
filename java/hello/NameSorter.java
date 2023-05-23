import java.util.*;

public class NameSorter {
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
    public static void main(final String... args) {
        String[] names = { "Kumar", "Nikude", "Jain", "Bastade", "Koot" };
        Arrays.sort(names, NameSorter::compare);
        Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());
        for (var name : names)
            System.out.println(name);
    }
}
