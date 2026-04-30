import java.util.*;

public class MarksList {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        // Add marks
        marks.add(85);
        marks.add(72);
        marks.add(90);
        marks.add(66);
        marks.add(78);

        // Display marks
        System.out.println("Marks: " + marks);

        // Find highest and lowest
        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}