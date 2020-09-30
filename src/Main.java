import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File input = new File("input.txt");

        try (Scanner scanner = new Scanner(input)) {
            String str = scanner.nextLine();
            char[] charArray = str.toCharArray();
            int counter = 1;

            Map<Character, Integer> map = new LinkedHashMap<>();
            for (char ch : charArray){
                if (map.get(ch) == null){
                    map.put(ch, counter);
                } else {
                    map.put(ch, map.get(ch) + 1);
                }
            }
            //System.out.println(map);
            for (Map.Entry<Character, Integer> pair : map.entrySet()){
                if (pair.getValue() == 1){
                    System.out.printf("Первый неповторяющийся символ в \'%s\': %s", str, pair.getKey());
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
