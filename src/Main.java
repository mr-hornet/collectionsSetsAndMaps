import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task 1
        List<Integer> nums = new ArrayList<>(List.of(12, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8, 10, 10));
        printOddNumbers(nums);

        //task 2
        printEvenNumbers(nums);

        //task 3
        String text = "Я ходил на рынок и Я на рынке купил мандаринок";
        printUniqueWords(text);

        //task 4
        printDuplicates(text);


    }

    public static void printOddNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

    public static void printEvenNumbers(List<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        for (Integer number : numbers) {
            if (!list.contains(number) && number % 2 == 0) {
                list.add(number);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static void printUniqueWords (String text) {
        Set<String> words = new HashSet<>(List.of(text.split(" ")));
        System.out.println(words);
    }


    public static void printDuplicates (String text) {
        List<String> list = new ArrayList<>(List.of(text.split(" ")));
        Map<String, Integer> map = new HashMap<>();
        for (String words : list) {
            if (!map.containsKey(words)) {
                map.put(words, 1);
            } else {
                int count = map.get(words);
                map.put(words, count + 1);
            }
        }
        System.out.println(map);
    }






}