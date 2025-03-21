public class Task2 {
    public static void main(String[] args) {
        int[] array = {3, 3, 3, 2, 2};
        int result = findDominant(array);

        System.out.println(result);

    }

    public static int findDominant(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > a.length / 2) {
                return a[i];
            }
        }
        return -1;
    }
}
