import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals based on starting time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Create an ArrayList to store merged intervals
        List<int[]> result = new ArrayList<>();

        // Step 3: Traverse through intervals
        for (int[] interval : intervals) {

            // If result is empty OR no overlap exists
            if (result.isEmpty() ||
                result.get(result.size() - 1)[1] < interval[0]) {

                result.add(interval);
            }

            // Otherwise, merge overlapping intervals
            else {
                result.get(result.size() - 1)[1] =
                    Math.max(
                        result.get(result.size() - 1)[1],
                        interval[1]
                    );
            }
        }

        // Step 4: Convert ArrayList to 2D array
        return result.toArray(new int[result.size()][]);
    }
}