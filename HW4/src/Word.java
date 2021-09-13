import java.util.*;

public class Word {

    public static void main(String[] args) {

        ArrayList<String> arrayWords = new ArrayList<>();
        arrayWords.add("Test0");
        arrayWords.add("Test1");
        arrayWords.add("Test2");
        arrayWords.add("Test3");
        arrayWords.add("Test4");
        arrayWords.add("Test5");
        arrayWords.add("Test0");
        arrayWords.add("Test2");
        arrayWords.add("Test1");
        arrayWords.add("Test3");

        HashSet<String> uniqW = new HashSet<>(arrayWords);

        Map<String, Integer> countWord = new HashMap<>();
        int count = 0;
        for (String word : uniqW) {
            for (String allWord : arrayWords) {
                if (word.equals(allWord)) {
                    count++;
                }
            }
            if (count == 0) {
                count++;
            }
            countWord.put(word, count);
            count = 0;
        }
        System.out.println("Уникальные слова: " + uniqW);
        for (Map.Entry<String, Integer> e : countWord.entrySet()) {
            System.out.printf("Повторяются слова %s - %d.\n", e.getKey(), e.getValue());
        }
    }
}
