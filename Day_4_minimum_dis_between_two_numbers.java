// import java.util.*;

public class Day_4_minimum_dis_between_two_numbers {

    static int minDistance(int a[], int x, int y){
        int x_index = -1;
        int y_index = -1;
        int minD = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i]==x) {
                x_index = i;
            }else if (a[i]==y) {
                y_index = i;
            }

            if(x_index != -1 && y_index != -1){
                if (Math.abs(x_index - y_index)<minD && Math.abs(x_index - y_index) != 0) {
                    minD = Math.abs(x_index - y_index);
                }
            }
        }
        System.out.println(minD);
        return x_index == -1 && y_index == -1?-1:minD;
    }
    public static void main(String args[]){
        int a[] = {1,2,3,2};
        int x = 1;
        int y = 2;
        int ans = minDistance(a, x, y);
        System.out.println(ans);
    }
}