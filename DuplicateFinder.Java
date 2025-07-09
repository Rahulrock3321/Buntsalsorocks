import java.util.*;

public class DuplicateFinder {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 9, 4, 9, 6, 7, 5, 4};

        List<Integer> duplicates = findDuplicates(numbers);

        System.out.println("Duplicate elements are:");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1 && !duplicates.contains(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        
        return duplicates;
    }
}
