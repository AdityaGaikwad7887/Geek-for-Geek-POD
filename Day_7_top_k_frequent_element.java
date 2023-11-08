import java.util.*;

public class Day_7_top_k_frequent_element {
    
    static int[] topK(int[] nums, int k) {
        // Code here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                max = nums[i];
            }
        }
        
        int hash[][] = new int[max+1][max+1];

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]][1]++;
        }
        for (int i = 0; i < max+1; i++) {
            hash[i][0] = i;
        }

        Arrays.sort(hash, Comparator.comparing(o -> o[1]));

        int ans[] = new int[k];
        int j = 0 ;
        for (int i = 1; i <= k; i++) {
            ans[j] = hash[hash.length-i][0];
            j++;
        }

        return ans;

    }

    public static void main(String args[]){
        int arr[] = {1,1,1,2,2,3};
        int ans[] = topK(arr, 2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
