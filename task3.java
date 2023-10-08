import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String num : input) {
            nums.add(Integer.parseInt(num));
        }
        List<Integer> result = new ArrayList<>();
        for (int a : nums) {
            if (countOccurrences(nums, a) < 2) {
                result.add(a);
            }
        }
        System.out.println(result);
    }
    
    public static int countOccurrences(List<Integer> nums, int num) {
        int count = 0;
        for (int n : nums) {
            if (n == num) {
                count++;
            }
        }
        return count;
    }
}