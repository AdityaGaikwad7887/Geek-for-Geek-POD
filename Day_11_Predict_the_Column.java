
public class Day_11_Predict_the_Column {

    static int columnWithMaxZeros(int arr[][], int N) {
        int ans = -1;
        int prev_count = -1;
        boolean f1 = false;

        for (int j = 0; j < N; j++) {
            int current_count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == 0) {
                    current_count++;
                    f1 = true;
                }
            }
            if (current_count > prev_count) {
                ans = j;
                prev_count = current_count;
            }
        }

        if (f1 == false) {
            return -1;
        }

        return ans;
    }

    public static void main(String args[]) {
        int arr[][] = { { 0, 0, 0 },
                { 1, 0, 1 },
                { 0, 1, 1 } };
        System.out.println(columnWithMaxZeros(arr, 3));
    }
}
