import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;

public class NonDublicate {
    public static void main(String[] args) {
		System.out.println("\n Name: Parth Katariya \n Enrollment No: 230410107073\n\n");
        if (args.length != 1) {
            System.out.println("filename : ");
            return;
        }
        String fileName = args[0];
        Set<String> words = new TreeSet<>(Collections.reverseOrder());
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
            System.out.println("Non-duplicate words in descending order:");
            for (String word : words) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
