package oop.finalexam.t1;

import java.util.ArrayList;
import java.util.List;

/**
 * This program processes two lists: list1 (integers) and list2 (strings).
 * It follows these steps:
 * 1. **Processing list1 and list2**:
 *    For each element in list1, it adds 1 to the element and uses the resulting sum to
 *    determine the corresponding index in list2. The value from list2 at that index
 *    is then concatenated with the original value from list1, and the result is stored in list3.
 * 2. **Filtering list3**:
 *    Once list3 is generated, the program removes the elements at indices that match any value
 *    in list1. The resulting list3 will only contain the elements that don't correspond to indices
 *    present in list1.
 * 3. **Error Handling**:
 *    The program handles situations where the sum of a value from list1 (after adding 1) exceeds the
 *    valid range of indices in list2. It also checks if any value in list1 exceeds the size of list3
 *    during the filtering phase. If any of these conditions are met, an appropriate error message is printed.
 *
 *    Errors are handled gracefully, and the program avoids crashes caused by invalid indices or sums
 *    that exceed the bounds of the lists.
 *
 * The algorithm works as follows:
 * 1. For each element in list1, the algorithm:
 *    a. Adds 1 to the element from list1.
 *    b. Checks if the resulting sum is within bounds of list2.
 *    c. If valid, it appends the value from list2 (at the index determined by the sum) with the
 *       original value from list1 and adds this result to list3.
 *    d. If invalid (i.e., the sum exceeds the size of list2), an error message is displayed.
 *
 * 2. After list3 is built, the algorithm proceeds to filter the list by removing elements at
 *    indices present in list1. Indices are checked, and any value in list1 is compared with the
 *    current index of list3. If a match is found, that entry is removed.
 *
 * 3. Finally, the program performs error checking during the filtering phase to ensure that no
 *    invalid indices are used.
 *
 * Example:
 * - Input:
 *   list1 = {5, 1, 9, 4, 8, 6, 7, 10, 2, 3}
 *   list2 = {"zau", "njt", "jdp", "ptm", "peq", "pbo", "ltd", "tud", "zew", "nnt", "ojq", "ade"}
 *
 * - Output (before filtering):
 *   ltd5
 *   jdp1
 *   ojq9
 *   pbo4
 *   nnt8
 *   tud6
 *   zew7
 *   ade10
 *   ptm2
 *   peq3
 *
 * - Output (after filtering):
 *   ltd5
 *
 * - Errors (if any):
 *   Error: Value 10 is out of bounds for list2.
 *   Error: Index 10 is out of bounds for list3.
 *
 * Author: Elene Tvauri
 * Date: 03/07/2025
 */
public class ListProcessor {

    /**
     * The main method of the program which implements the processing and filtering of the lists.
     * It constructs list3 based on list1 and list2, then filters it based on the indices in list1.
     * Finally, it prints the list3 before and after filtering, along with any error messages.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int[] list1 = {5, 1, 9, 4, 8, 6, 7, 10, 2, 3};
        String[] list2 = {"zau", "njt", "jdp", "ptm", "peq", "pbo", "ltd", "tud", "zew", "nnt", "ojq", "ade"};

        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            int sum = list1[i] + 1;
            if (sum < list2.length) {
                list3.add(list2[sum] + list1[i]);
            } else {
                System.err.println("Error: Value " + sum + " is out of bounds for list2.");
            }
        }

        System.out.println("list3 before filtering:");
        for (String value : list3) {
            System.out.println(value);
        }

        List<String> filteredList3 = new ArrayList<>();

        for (int i = 0; i < list3.size(); i++) {
            boolean toRemove = false;
            for (int val : list1) {
                if (i == val) {
                    toRemove = true;
                    break;
                }
            }
            if (!toRemove) {
                filteredList3.add(list3.get(i));
            }
        }

        System.out.println("\nlist3 after filtering:");
        for (String value : filteredList3) {
            System.out.println(value);
        }

        for (int val : list1) {
            if (val >= list3.size()) {
                System.err.println("Error: Index " + val + " is out of bounds for list3.");
            }
        }
    }
}
