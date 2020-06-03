import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "пять, два шшш, два. четыре пять,два шшш  пять.четыре пять,аа\n" +
                "аб ав шшш шшш\n" +
                "\n" +
                "яяя.";
        List<String> myArrayList = new ArrayList<String>();

                for (String word : str.split("\\s+|,\\s*|\\.\\s*|\\t+|\\n+")) {
                    myArrayList.add(word);
                }
        Collections.sort(myArrayList);
        System.out.println("Отсортированный по алфавиту список слов из файла :");
        System.out.println(myArrayList);
        String s = " ";
        myArrayList.add(0, s);
        int max = 0;
        HashMap<String, Integer> myHashMap = new HashMap<>();
        for (int i = 1; i < myArrayList.size(); i++) {
            int counter = 0;
            for (int j = 0; j < myArrayList.size(); j++) {
                if (myArrayList.get(j).equals(myArrayList.get(i))) {
                    counter++;
                }
            }
            if (counter >= max) {
                max = counter;
            }
            if (myArrayList.get(i).equals(myArrayList.get(i - 1))) {
            } else {
                System.out.println("Число потороений слова \"" + myArrayList.get(i) + "\" = " + counter);
                myHashMap.put(myArrayList.get(i), counter);
            }
        }
        System.out.println("Слова с наибольшим числом повторений (" + max + ") :");
        for (Map.Entry<String, Integer> pair : myHashMap.entrySet()) {
            if (pair.getValue() == max) {
                System.out.print(pair.getKey() + "  ");
            }
        }
    }
}
