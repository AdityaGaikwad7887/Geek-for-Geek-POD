import java.util.*;

public class Day_3_frequency_count_in_limited_range_of_array {
    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        int ans[] = new int[N];

        Arrays.parallelSort(arr);
        for (int i = 0; i < N; i++) {
            if (arr[i] <= N) {
                ans[arr[i]-1]++;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {3,3,4};
        frequencyCount(arr, arr.length, 0);
    }
}