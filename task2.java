import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String num : input) {
            numbers.add(Integer.parseInt(num));
        }
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        List<Integer> sortedNumbers = new ArrayList<>(uniqueNumbers);
        Collections.sort(sortedNumbers);
        for (int num : sortedNumbers) {
            System.out.print(num + " ");
        }
    }
}