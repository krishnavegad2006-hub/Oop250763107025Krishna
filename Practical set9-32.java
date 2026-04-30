import java.util.*;

public class GenericSearch {

    // Generic method
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        // Integer list (roll numbers)
        LinkedList<Integer> rollNos = new LinkedList<>();
        rollNos.add(101);
        rollNos.add(102);
        rollNos.add(103);

        System.out.println("Search 102: " + searchElement(rollNos, 102));
        System.out.println("Search 105: " + searchElement(rollNos, 105));

        // String list (names)
        LinkedList<String> names = new LinkedList<>();
        names.add("Krishna");
        names.add("Ravi");
        names.add("Neha");

        System.out.println("\nSearch 'Ravi': " + searchElement(names, "Ravi"));
        System.out.println("Search 'Amit': " + searchElement(names, "Amit"));
    }
}