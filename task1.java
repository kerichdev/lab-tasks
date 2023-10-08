import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();

        for (String num : scanner.nextLine().split(" ")) {
            numbers1.add(Integer.parseInt(num));
        }

        for (String num : scanner.nextLine().split(" ")) {
            numbers2.add(Integer.parseInt(num));
        }

        List<Integer> mergedNumbers = new ArrayList<>(numbers1);
        mergedNumbers.addAll(numbers2);
        Collections.sort(mergedNumbers);

        for (int num : mergedNumbers) {
            System.out.print(num + " ");
        }
    }
}