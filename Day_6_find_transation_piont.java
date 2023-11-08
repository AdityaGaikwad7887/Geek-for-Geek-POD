public class Day_6_find_transation_piont {

    static int transitionPoint(int arr[], int n) {
        int s = 0;
        int e = n-1;
        int ans = -1;

        while (s<=e) {
            int mid = (s+e)/2;
            if (arr[mid] ==1) {
                e = mid-1;
                ans = mid;
            }else{
                s = mid +1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {1};
        System.out.println(transitionPoint(arr, arr.length));
    }
}
