import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class VirtualPicnicBasket {

    private final ArrayList<String> items = new <String>ArrayList();

    public VirtualPicnicBasket(String fileName, String delimeter) throws Exception {
        Scanner scanner = new Scanner(new File(fileName));
        scanner.useDelimiter(delimeter);
        while (scanner.hasNext()) {
            items.add(scanner.next().replaceAll("(\\r|\\n)", ""));
        }
        scanner.close();
        if (getNumWords() == 0) throw new Exception("Не удалось загрузить данные");
    }

    public int getNumWords() {
        return items.size();
    }

    public String getMostLongWord() {
        int longestWordLen = 0;
        String longestWord = "";

        for (String word : items) {
            if (longestWordLen < word.length()) {
                longestWordLen = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

    public HashMap<String, Integer> countNumEachWord() {
        HashMap<String, Integer> hashMap = new HashMap();

        for (String word : items) {
            if (hashMap.containsKey(word))
                hashMap.put(word, hashMap.get(word) + 1);
            else
                hashMap.put(word, 1);
        }
        return hashMap;
    }
}
