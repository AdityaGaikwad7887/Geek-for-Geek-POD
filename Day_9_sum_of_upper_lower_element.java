import java.util.ArrayList;

public class Day_9_sum_of_upper_lower_element {
    // Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        ArrayList<Integer> L1 = new ArrayList<>();
        int upper_sum = 0;
        int lower_sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    upper_sum += matrix[i][j];
                    lower_sum += matrix[i][j];
                } else if (i < j) {
                    upper_sum += matrix[i][j];
                } else {
                    lower_sum += matrix[i][j];
                }
            }
        }

        L1.add(upper_sum);
        L1.add(lower_sum);
        System.out.println(upper_sum);
        System.out.println(lower_sum);
        return L1;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 6, 5, 4 },
                { 1, 2, 5 }, { 7, 9, 7 } };
        ArrayList<Integer> n = new ArrayList<>();
        n = sumTriangles(matrix, 3);

        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));
        }
    }
}
