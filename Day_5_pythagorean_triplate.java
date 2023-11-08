// import java.lang.reflect.InaccessibleObjectException;
import java.util.*;

public class Day_5_pythagorean_triplate {
    
    static boolean checkTriplet(int[] arr, int n) {
        // code here
        int max = Integer.MIN_VALUE;
        Set<Integer> nums = new HashSet<Integer>();

        for(int i = 0 ; i < n ; i++ ){
            if(arr[i] > max ){
                max = arr[i];
            }
            nums.add(arr[i]*arr[i]);
        }

        int[] arr2 = nums.stream().mapToInt(Integer::intValue).toArray();
        int arr2_sizee = arr2.length;
        int sum[] = new int[arr2_sizee*arr2_sizee];
        int x = 0 ; 

        for (int i = 0; i < arr2_sizee-1; i++) {
            for (int j = i+1; j < arr2_sizee; j++) {
                if(x==325 || x == 324 || x == 326){
                    System.out.println(arr2[i] + " " + arr2[j]);
                }
                sum[x] = arr2[i]+arr2[j];
                
                x++;
            }
        }

        System.out.println("ok");
        
        boolean f1= false;

        for (int i = 0; i < sum.length; i++) {
            if (nums.contains(sum[i])) {
                System.out.println(i);
                System.out.println(sum[i]);
                f1 = true;
            }
            
        }
        return f1; 
    }

    public static void main(String args[]){
        int arr[] = {57 ,24, 92, 96, 45, 21, 8, 60, 2, 58, 91, 31, 56, 9, 33, 37, 16, 24, 42, 99, 87, 44, 80, 95, 9, 46, 33, 41, 8, 68,75,7,78,20};
        checkTriplet(arr, arr.length);
    }
}
