import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        rotateArray(arr1, 2);
        System.out.println(Arrays.toString(arr1));

        int[] arr3 = {7, 8, 9};
        rotateArray(arr3, 0);
        System.out.println(Arrays.toString(arr3));
    }

    public static void rotateArray(int[] arr, int positions) {
        if (arr == null || arr.length == 0) return;

        int n = arr.length;
        positions = positions % n;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        for (int i = 0; i < positions / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[positions - 1 - i];
            arr[positions - 1 - i] = temp;
        }

        for (int i = 0; i < (n - positions) / 2; i++) {
            int temp = arr[positions + i];
            arr[positions + i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

}

